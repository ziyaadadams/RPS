/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author ziyaad
 */

import java.util.Random;

// Rando,Computer Class which calls RPSPlayer
public class RandomComputerPlayer implements RPSPlayer {
    private final Random random;

    // constructor 
    public RandomComputerPlayer(Random random) {
        this.random = random;
    }

    public String play() {
        return CHOICES[this.random.nextInt(CHOICES.length)];
    }
}
