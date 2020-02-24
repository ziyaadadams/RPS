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
import java.util.Scanner;

public class HumanPlayer implements RPSPlayer {
    private final Scanner scanner;


    // Constructor
    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    // play function
    @Override
    public String play() {
        System.out.println("Select 1, 2, or 3 for Rock, Paper, Scissors");
        int choice = this.scanner.nextInt();
        
        return CHOICES[choice - 1];
    }
} 
