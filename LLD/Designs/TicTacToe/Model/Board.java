package Designs.TicTacToe.Model;

public class Board {
    int size;
    public PlayingPiece [][] board;
    int cellsUsed;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
        this.cellsUsed = 0;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] != null || row>=size || col>=size) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public void incrementCellsUsed() {
        this.cellsUsed++;
    }

    public boolean emptyCellsAvailable() {
        return cellsUsed != size*size;
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print("|");
                if(board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
