package SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    static List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Shreesh", 0));
        players.add(new Player("Chandra", 0));
        return players;
    }

    static List<Obstacle> getObstacles(int size, int snakes, int ladders) {
        List<Obstacle> obstacles = new ArrayList<>();

        while(snakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, size * size - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, size * size - 1);
            if (snakeTail >= snakeHead) {
                continue;
            }
            Obstacle obstacle = new Snake(snakeHead, snakeTail);
            obstacles.add(obstacle);
            snakes--;
        }

        while(ladders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, size * size - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, size * size - 1);
            if (ladderStart >= ladderEnd) {
                continue;
            }

            Obstacle obstacle = new Ladder(ladderStart, ladderEnd);
            obstacles.add(obstacle);
            ladders--;
        }
        return obstacles;
    }
}
