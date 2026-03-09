package SnakeAndLadder;

public class Player {
    public String name;
    private int position;

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    void updatePosition(int newPosition) {
        this.position = newPosition;
    }

    public int getPosition() {
        return this.position;
    }
}
