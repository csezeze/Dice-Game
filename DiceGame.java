package ZeynepOzkanHW1;

import java.util.Scanner;
    /**
     *In order to attain a score of 100 points first,
     *the user competes against the computer in a game implemented by the DiceGame class.
     *A pair of dice are used to play the game,
     *and there is a number of rules determining how points are scored and when a turn ends.
     */
public class DiceGame {
    /**
     * The main method is responsible for starting the game and printing out the
     * rules.
     *
     * @param args command-line arguments, not used in this implementation
     */
    public static void main(String[] args) {
        // Print the initial pattern of the Welcome Message.
        int i, j, k,m;
        for (i = 1; i <8; i++) {
            for (j = i; j < 8; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
                for (m = k; m < 10; m++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        // Print the Welcome Message.
        System.out.println("Welcome to the DiceGame & You will be playing against computer!");
        // Print the final pattern of the Welcome Message.
        int a, b, c, d ;
        for (a = 7; 0<a; a--) {
            for (b = 1; 7 >= b; b++) {
                System.out.print(" ");
            }
            for (c = 1; c <= a; c++) {
                System.out.print("*");
                System.out.print(" ");
                for (d = c; d < 10; d++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Game Rules:");
        System.out.println("""
                The first player to get 100 points Wins.
                Even so, if you roll a 1, you lose every point you've earned thus far.
                You lose all of your points if you roll two 1s. The dice can be reset at any moment.
                Moreover, if you roll one or two 1's, you lose your turn.
                The computer play by the same rules.""");


        PairOfDice playerDice = new PairOfDice(); // Create a PairOfDice Object
        PairOfDice computerDice = new PairOfDice(); // Create a PairOfDice Object
        int playerTotalScore = 0; //Initialize the player total score to 0
        int computerTotalScore = 0; //Initialize the player computer total score to 0
        boolean playerTurn = true; //Set playerTurn to true, indicating it is the player's turn
        Scanner scanner = new Scanner(System.in); // Initialize a Scanner object to read user input

        // The game continues as long as neither player has scored 100 points yet
        while (playerTotalScore < 100 && computerTotalScore < 100) {
            int turnScore = 0;
            System.out.println();
            System.out.println("Current Scores:");
            System.out.println("Player: " + playerTotalScore + "    Computer: " + computerTotalScore);
            System.out.println();
            //If it is the player's turn
            if (playerTurn) {
                System.out.println("Player's Turn:");
                String s1="you can press any letter button e.g. N/n";
                System.out.print("Press ENTER BUTTON to roll the dice OR " +s1+ " to end your turn: ");
                String input = scanner.nextLine();

                //Press the enter button
                while (input.isEmpty()) {
                    playerDice.roll();//Call the roll() method
                    int rollValue = playerDice.getDiceSum();//Create the sum of the values rolled on the dice
                    // If the player rolls two ones
                    if (rollValue == 2) {
                        playerTotalScore = 0;
                        turnScore = 0;
                        System.out.println("You rolled two 1's! You lose all your points.");
                        break;
                    } else if (rollValue == 1) {
                        turnScore = 0;
                        System.out.println("You rolled a 1. Turn over."); // If the player rolls one
                        break;
                    } else {
                        turnScore += rollValue; // summing up the points
                        System.out.println("You rolled a " + rollValue + ".");
                        System.out.print("Roll again or end turn? (r/n) "); // ask user Whether continue or not?
                        input = scanner.nextLine();
                    }
                }

                playerTotalScore += turnScore;// Add the player's turn score to their total score
                playerTurn = false;
            } else {
                System.out.println("Computer's Turn:");

                while (turnScore < 20) {
                    computerDice.roll(); //Call the roll() method
                    int rollValue = computerDice.getDiceSum();//Create the sum of the values rolled on the dice
                    if (rollValue == 2) {
                        computerTotalScore = 0;
                        turnScore = 0;
                        System.out.println("Computer rolled two 1's! It loses all its points.");// If the computer rolls two ones
                        break;
                    } else if (rollValue == 1) {
                        turnScore = 0;
                        System.out.println("Computer rolled a 1. Turn over.");//If the computer rolls one
                        break;
                    } else {
                        turnScore += rollValue;
                        System.out.println("Computer rolled a " + rollValue + ".");
                    }
                }

                computerTotalScore += turnScore;//Add the computer's turn score to their total score
                playerTurn = true;
            }
        }

        System.out.println();
        //Print a message showing who gets what scores in the game
        System.out.println("Final Scores:");
        System.out.println("Player: " + playerTotalScore + "    Computer: " + computerTotalScore);


        //Print a message indicating who won the game
        if (playerTotalScore >= 100) {
            System.out.println("Congratulations! You win!"); // User wins
        } else {
            System.out.println("Sorry, The computer wins. Next time, you'll be luckier don't be sad :)"); // Computer wins
        }
        System.out.println("Thanks for playing the Dice Game!");
        scanner.close();
    }
}