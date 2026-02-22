package Designs.TicTacToe;

import Designs.TicTacToe.Model.GameStatus;
import Designs.TicTacToe.Model.PieceType;
import Designs.TicTacToe.Model.PlayingPieceFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, PieceType> players = new HashMap<>();
        players.put("Shreesh", PieceType.X);
        players.put("Opponemt", PieceType.O);

        TicTacToeGame ticTacToeGame = new TicTacToeGame(3, players, new PlayingPieceFactory());

        GameStatus gameStatus = ticTacToeGame.startGame();

        switch (gameStatus) {
            case GameStatus.DRAW -> {
                System.out.println("GAME END: DRAW!");
            }
            case GameStatus.WIN -> {
                System.out.println(String.format("GAME END: Player %s Won!", ticTacToeGame.getWinner()));
            }
        }

    }
}
