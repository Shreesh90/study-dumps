package SnakeAndLadder;

public abstract class Obstacle {
    int start, end;

    public Obstacle(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }
}
