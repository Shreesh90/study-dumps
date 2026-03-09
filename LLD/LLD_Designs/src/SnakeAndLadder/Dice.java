package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min, max;

    public Dice(int diceCount, int mini, int maxi) {
        this.diceCount = diceCount; // Total number of dice
        this.min = mini; // Minimum value in the dice
        this.max = maxi; // Maximum value in the dice
    }

    public int rollDice() {
        int jumps = 0;
        int diceNumber = 0;

        while(diceNumber < diceCount) {
            jumps += ThreadLocalRandom.current().nextInt(min, max+1);
            diceNumber++;
        }
        return jumps;
    }
}
