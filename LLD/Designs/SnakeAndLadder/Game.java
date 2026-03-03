package Designs.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game(int size, int diceCount, List<Player> players, List<Obstacle> obstacles) {
        this.board = new Board(size, obstacles);
        dice = new Dice(diceCount, 1, 6);
        this.players.addAll(players);
        winner = null;
    }

    public void startGame() {
        while(winner == null) {
            Player currPlayer = players.removeFirst();
            System.out.println(String.format("Current Player & Position: %s, %s", currPlayer.name, currPlayer.getPosition()));

            int diceMoveValue = dice.rollDice();

            int newPosition = currPlayer.getPosition() + diceMoveValue;
            newPosition = checkNewPosition(newPosition);
            currPlayer.updatePosition(newPosition);

            players.addLast(currPlayer);

            if(newPosition >= board.size * board.size - 1) {
                winner = currPlayer;
            }
        }
        System.out.println("\n===> The Winner is: " + winner.name);
    }

    private int checkNewPosition(int position) {
        if(position > board.size * board.size - 1) {
            return position;
        }

        Cell newCell = board.getCell(position);
        if(newCell.hasObstacle) {
            position = newCell.getNewCell();
        }
        return position;
    }

}
