package Games;
import java.util.Arrays;
import java.util.Scanner;

public class tictactoe {

    // Declare static variables for the game board, winner, and current player
    static String[] gameBoard;
    static String winner;
    static String player;

    // Method to check who the winner is
    public static String whoIsWinner() {
        // Loop through possible winning combinations
        for (int i = 0; i < 8; i++) {

            String check = null;

            // Each case represents a winning combination on the board
            switch (i) {
                case 0: check = gameBoard[0] + gameBoard[1] + gameBoard[2]; break; // Top row
                case 1: check = gameBoard[3] + gameBoard[4] + gameBoard[5]; break; // Middle row
                case 2: check = gameBoard[6] + gameBoard[7] + gameBoard[8]; break; // Bottom row
                case 3: check = gameBoard[0] + gameBoard[3] + gameBoard[6]; break; // Left column
                case 4: check = gameBoard[1] + gameBoard[4] + gameBoard[7]; break; // Middle column
                case 5: check = gameBoard[2] + gameBoard[5] + gameBoard[8]; break; // Right column
                case 6: check = gameBoard[0] + gameBoard[4] + gameBoard[8]; break; // Diagonal from top-left to bottom-right
                case 7: check = gameBoard[2] + gameBoard[4] + gameBoard[6]; break; // Diagonal from top-right to bottom-left
            }

            // Check if any combination has been filled with either 'X' or 'O'
            if (check.equals("XXX"))
                return "X"; // X is the winner
            else if (check.equals("OOO"))
                return "O"; // O is the winner
        }

        // Check for a tie by verifying if all positions are filled
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(gameBoard).contains(String.valueOf(i + 1)))
                break; // If there's an available position, no tie yet
            else if (i == 8)
                return "Tie"; // All positions filled, no winner, hence a tie
        }

        // If no winner or tie, continue the game
        System.out.println("Its " + player + " Chance:");
        return null;
    }

    // Method to display the current game board
    public static void showBoard() {
        System.out.println("#############");
        System.out.println("| " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + " |");
        System.out.println("| " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + " |");
        System.out.println("| " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + " |");
        System.out.println("#############");
    }

    // Main method where the game starts
    public static void main(String[] args) {

        winner = null; // Initialize winner as null
        player = "X"; // X starts the game
        gameBoard = new String[9]; // Initialize game board with 9 positions

        // Fill the board with initial values (1-9)
        for (int i = 0; i < 9; i++) {
            gameBoard[i] = String.valueOf(i + 1);
        }

        showBoard(); // Display the initial game board

        System.out.println("Its X Chance: "); // Prompt X to start the game

        Scanner sc = new Scanner(System.in);

        // Loop until there is a winner or tie
        while (winner == null) {

            int input;
            input = sc.nextInt(); // Read the player's move

            // Check if the input is within the valid range
            if (input > 0 && input <= 9) {

                // Check if the chosen position is available
                if (gameBoard[input - 1].equals(String.valueOf(input))) {

                    gameBoard[input - 1] = player; // Mark the position with the player's symbol

                    showBoard(); // Display the updated game board

                    // Toggle between players
                    if (player == "X")
                        player = "O";
                    else
                        player = "X";

                    winner = whoIsWinner(); // Check if there's a winner or a tie
                } else {
                    System.out.println("Enter value into another slot as it is already taken"); // Position is already filled
                }
            }
        }

        // Display the final result based on the winner
        if (winner == "Tie")
            System.out.println("Its a Tie!");
        else
            System.out.println("Congratulations! " + winner + " Wins");

        sc.close(); // Close the scanner
    }

    // Dry Run Example:
    // Input sequence: 1, 5, 2, 8, 3
    // Step 1: Player X marks position 1
    // | X | 2 | 3 |
    // | 4 | 5 | 6 |
    // | 7 | 8 | 9 |
    //
    // Step 2: Player O marks position 5
    // | X | 2 | 3 |
    // | 4 | O | 6 |
    // | 7 | 8 | 9 |
    //
    // Step 3: Player X marks position 2
    // | X | X | 3 |
    // | 4 | O | 6 |
    // | 7 | 8 | 9 |
    //
    // Step 4: Player O marks position 8
    // | X | X | 3 |
    // | 4 | O | 6 |
    // | 7 | O | 9 |
    //
    // Step 5: Player X marks position 3 and wins the game (top row is filled with X)
    // | X | X | X |
    // | 4 | O | 6 |
    // | 7 | O | 9 |
    // Output: "Congratulations! X Wins"
}
