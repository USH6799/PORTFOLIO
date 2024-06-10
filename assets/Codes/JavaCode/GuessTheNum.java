import java.util.Scanner;

public class GuessTheNum {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Welcome message for the game
        System.out.println("Welcome to the Number Guesser Game");

        // Infinite loop to keep the game running until the user decides to exit
        while (true) {
            // Prompting the user to choose the difficulty level (easy, normal, or hard)
            System.out.print("Choose the Level [easy | normal | hard]\nWrite the level in small letters: ");
            
            // Reading the user's choice of difficulty level
            String mode = sc.nextLine();
            
            // Checking the chosen level and proceeding accordingly
            if (mode.compareTo("easy") == 0) {
                // Easy level configuration
                int max = 5; // Maximum number to guess (inclusive)
                int min = 1; // Minimum number to guess
                int num = (int) (Math.random() * (max - min) + min); // Generating a random number for the user to guess
                
                // Loop to allow the user 5 guesses
                for (int i = 1; i <= 5; i++) {
                    // Prompting the user to guess the number
                    System.out.print("Guess the Number between 1 to 5: ");
                    
                    // Reading the user's guess
                    int guess = sc.nextInt();
                    
                    // Checking if the guess is correct or not
                    if (guess != num) {
                        // Providing feedback if the guess is smaller than the target number
                        if (guess < num) {
                            System.out.println("Your guess is smaller. Try bigger. [Tries left: " + (5 - i) + "]");
                            continue; // Continuing to the next iteration of the loop
                        }
                        // Providing feedback if the guess is bigger than the target number
                        if (guess > num) {
                            System.out.println("Your guess is bigger. Try smaller. [Tries left: " + (5 - i) + "]");
                            continue; // Continuing to the next iteration of the loop
                        }
                    } else {
                        // Displaying a congratulatory message if the guess is correct
                        System.out.println("You guessed the number in " + i + " tries");
                        break; // Exiting the loop as the correct guess has been made
                    }
                }
                break; // Exiting the loop as the game for the chosen level has ended
            } else if (mode.compareTo("normal") == 0) {
                // Normal level configuration
                int max = 10;
                int min = 1;
                int num = (int) (Math.random() * (max - min) + min);
                
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Guess the Number between 1 to 10: ");
                    int guess = sc.nextInt();
                    
                    if (guess != num) {
                        if (guess < num) {
                            System.out.println("Your guess is smaller. Try bigger. [Tries left: " + (5 - i) + "]");
                            continue;
                        }
                        if (guess > num) {
                            System.out.println("Your guess is bigger. Try smaller. [Tries left: " + (5 - i) + "]");
                            continue;
                        }
                    } else {
                        System.out.println("You guessed the number in " + i + " tries");
                        break;
                    }
                }
                break;
            } else if (mode.compareTo("hard") == 0) {
                // Hard level configuration
                int max = 15;
                int min = 1;
                int num = (int) (Math.random() * (max - min) + min);
                
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Guess the Number between 1 to 15: ");
                    int guess = sc.nextInt();
                    
                    if (guess != num) {
                        if (guess < num) {
                            System.out.println("Your guess is smaller. Try bigger. [Tries left: " + (5 - i) + "]");
                            continue;
                        }
                        if (guess > num) {
                            System.out.println("Your guess is bigger. Try smaller. [Tries left: " + (5 - i) + "]");
                            continue;
                        }
                    } else {
                        System.out.println("You guessed the number in " + i + " tries");
                        break;
                    }
                }
                break;
            } else {
                // Handling incorrect inputs for difficulty level selection
                System.out.println("You chose the wrong mode");
            }
        }
        
        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}


/*
 * Dry Run:
 * 
 * Welcome message for the game is displayed.
 * 
 * Infinite loop starts to keep the game running until the user decides to exit.
 * 
 * Prompted to choose the difficulty level.
 * 
 * User enters the difficulty level choice.
 * 
 * If the chosen level is "easy":
 *     - Random number between 1 and 5 is generated for the user to guess.
 *     - User is allowed 5 guesses.
 *     - For each guess:
 *         - User is prompted to enter their guess.
 *         - User's guess is compared with the generated number.
 *         - Feedback is provided based on the guess (smaller, bigger, or correct).
 *         - If the guess is correct, a congratulatory message is displayed, and the loop is exited.
 *     - If the user doesn't guess the number within 5 attempts, the loop exits automatically.
 * 
 * If the chosen level is "normal":
 *     - Random number between 1 and 10 is generated for the user to guess.
 *     - Similar steps are followed as in the "easy" level.
 * 
 * If the chosen level is "hard":
 *     - Random number between 1 and 15 is generated for the user to guess.
 *     - Similar steps are followed as in the "easy" level.
 * 
 * If the chosen level is none of the above:
 *     - User is informed that they chose the wrong mode.
 * 
 * The loop continues until the user decides to exit the game.
 * 
 * Scanner object is closed to prevent resource leak.
 */
