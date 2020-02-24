package rockpaperscissors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ziyaad
 */
public interface RPSPlayer {
     String[] CHOICES = new String[] { "Rock", "Paper", "Scissors" }; // choice to print after calculations

    /**
     * Returns one of "Rock", "Paper", or "Scissors".
     * @return 
     */
    String play();
    
}
