package Designs.SnakeAndLadder;

public class Cell {
    int id;
    boolean hasObstacle;
    int nextId;

    public Cell(int id) {
        this.id = id;
        hasObstacle = false;
    }

    public void setObstacle(int nextId) {
        hasObstacle = true;
        this.nextId = nextId;
    }

    public int getNewCell() {
        return this.nextId;
    }

}
