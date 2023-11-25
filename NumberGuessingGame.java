
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            
            int min = 1;
            int max = 100;
            int range = max - min + 1;
            int generatedNumber = random.nextInt(range) + min;
            
            int maxAttempts = 10;
            int attempts = 0;
            int userGuess;
            int rounds = 0;
            int score = 0;
    
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've generated a number between " + min + " and " + max + ".");
            
            while (true) {
                rounds++;
                attempts = 0;
                generatedNumber = random.nextInt(range) + min;
                System.out.println("Round " + rounds + ":");
                System.out.println("You have " + maxAttempts + " attempts to guess the number.");
                
                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    userGuess = scanner.nextInt();
                    attempts++;
                    
                    if (userGuess < min || userGuess > max) {
                        System.out.println("Please guess a number between " + min + " and " + max + ".");
                    } else if (userGuess < generatedNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > generatedNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You've guessed the number (" + generatedNumber + ") in " + attempts + " attempts.");
                        score++;
                        break;
                    }
                }
                
                if (attempts >= maxAttempts) {
                    System.out.println("You've run out of attempts. The correct number was " + generatedNumber + ".");
                }
                
                System.out.print("Do you want to play another round? (yes/no): ");
                String playAgain = scanner.next();
                
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }
            }
            
            System.out.println("Game over. You played " + rounds + " rounds and won " + score + " times.");
        }
    }
     

