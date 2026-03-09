package SnakeAndLadder;

import java.util.List;

import static SnakeAndLadder.Utils.getObstacles;
import static SnakeAndLadder.Utils.getPlayers;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        List<Player> players = getPlayers();
        List<Obstacle> obstacles = getObstacles(size, 8, 3);

        Game game = new Game(
                size,
                1,
                players,
                obstacles
        );

        game.startGame();
    }
}
