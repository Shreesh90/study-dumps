package SnakeAndLadder;

import java.util.List;

public class Board {
    int size;
    Cell[][] board;

    public Board(int size, List<Obstacle> obstacles) {
        this.size = size;
        this.board = new Cell[size][size];
        initializeBoard();
        initialiseObstacles(obstacles);
    }

    private void initializeBoard() {
        int id = 1;
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                board[i][j] = new Cell(id);
                id++;
            }
        }
    }

    private void initialiseObstacles(List<Obstacle> obstacles) {
        for(Obstacle obstacle: obstacles) {
            int obstacleStartCell = obstacle.getStart();
            int obstacleEndCell = obstacle.getEnd();

            Cell boardCell = getCell(obstacleStartCell);
            boardCell.setObstacle(obstacleEndCell);
        }
    }

    Cell getCell(int id) {
        int row = id / size;
        int col = id % size;
        return board[row][col];
    }
}
