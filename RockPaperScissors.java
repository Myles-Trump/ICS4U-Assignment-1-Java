/*
* The "RockPaperScissors" program lets the user play rock paper scissors with
*  the program
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-03
*/

import java.util.Scanner;

/**
* This is a program that lets the user play rock paper scissors.
*/

final class RockPaperScissors {

    /**
    * One.
    */
    public static final int ONE = 1;

    /**
    * Two.
    */
    public static final int TWO = 2;

    /**
    * Three.
    */
    public static final int THREE = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        String programChoice = "";
        int userChoice = 0;

        final Scanner userInput = new Scanner(System.in);

        // Block of code to try
        try {
                // instance of random class
                int max = THREE;
                int min = ONE;

                // generate random value from 1-3
                max = min + 1;
                int randNum
                    = (int) Math.floor(Math.random() * (max) + min);

                // ask the user to input Rock, Paper or Scissors
                System.out.print("Enter Rock, Paper or Scissors: ");

                // Stores input as float
                String rps = userInput.nextLine();

                if (rps.equals("Rock")) {
                    userChoice = ONE;
                } else if (rps.equals("Paper")) {
                    userChoice = TWO;
                } else if (rps.equals("Scissors")) {
                    userChoice = THREE;
                } else {
                    throw new java.util.InputMismatchException();
                }

                if (randNum == ONE) {
                    programChoice = "Rock.";
                } else if (randNum == TWO) {
                    programChoice = "Paper.";
                } else if (randNum == THREE) {
                    programChoice = "Scissors.";
                }

                if (userChoice == randNum) {
                    System.out.print("\nIt's a tie! You both picked "
                        + programChoice);
                } else {
                    if (userChoice == 1 && randNum == THREE) {
                        System.out.print("\nPlayer wins! Program picked "
                            + programChoice);
                    } else if (userChoice == THREE && randNum == 1){
                        System.out.print("\nProgram wins! Program picked "
                            + programChoice);
                    } else if (userChoice > randNum) {
                        System.out.print("\nPlayer wins! Program picked "
                            + programChoice);
                    } else if (randNum > userChoice) {
                        System.out.print("\nProgram wins! Program picked "
                            + programChoice);
                    }
                }

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
                System.out.print("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}
