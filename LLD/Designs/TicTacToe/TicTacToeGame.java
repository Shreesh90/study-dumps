package Designs.TicTacToe;

import Designs.TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    PlayingPieceFactory playingPieceFactory;
    Board board;
    Player winner;
    int size;

    public TicTacToeGame(int size, Map<String, PieceType> players, PlayingPieceFactory playingPieceFactory) throws Exception {
        this.size = size;
        this.playingPieceFactory = playingPieceFactory;
        this.players = new LinkedList<>();
        for (Map.Entry<String, PieceType> entry : players.entrySet()) {
            Player player = new Player(entry.getKey(), playingPieceFactory.getPlayingPiece(entry.getValue()));
            this.players.add(player);
        }
        this.board = new Board(size);
        this.winner = null;
    }

    public GameStatus startGame() {
        boolean gameEnd = false;
        while(!gameEnd) {

            board.printBoard();

            Player currentPlayer = players.getFirst();

            boolean cellsAvailable = board.emptyCellsAvailable();
            if(!cellsAvailable) {
                gameEnd = true;
                continue;
            }

            System.out.print(String.format("Player %s: Please enter [row, col]: ", currentPlayer.getPlayerName()));
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]) - 1;
            int inputColumn = Integer.valueOf(values[1]) - 1;

            boolean playChance = board.addPiece(inputRow, inputColumn, currentPlayer.getPlayingPiece());
            if(!playChance) {
                System.out.println("Incorrect position chosen, try again!");
                continue;
            }
            board.incrementCellsUsed();
            players.removeFirst();
            players.addLast(currentPlayer);

            boolean isWinner = checkWinner(inputRow, inputColumn, currentPlayer.getPlayingPiece());
            if(isWinner) {
                winner = currentPlayer;
                return GameStatus.WIN;
            }
        }
        return GameStatus.DRAW;
    }

    boolean checkWinner(int row, int col, PlayingPiece playingPiece) {
        boolean rowWin = true;
        boolean colWin = true;
        boolean diagWin = true;
        boolean diagWin2 = true;

        // check row
        for(int j=0;j<size;j++) {
            if(board.board[row][j] == null || board.board[row][j] != playingPiece){
                rowWin = false;
                break;
            }
        }

        // check column
        for(int i=0;i<size;i++) {
            if(board.board[i][col] == null || board.board[i][col] != playingPiece) {
                colWin = false;
                break;
            }
        }

        // diagonal check
        for(int i=0,j=0; i<size; i++, j++) {
            if(board.board[i][j] == null || board.board[i][j] != playingPiece) {
                diagWin = false;
                break;
            }
        }

        // diagonal check opposite
        for(int i=0,j=size-1; i<size; i++, j--) {
            if(board.board[i][j] == null || board.board[i][j] != playingPiece) {
                diagWin2 = false;
                break;
            }
        }

        return rowWin || colWin || diagWin || diagWin2;
    }

    public String getWinner() {
        return this.winner.getPlayerName();
    }
}
