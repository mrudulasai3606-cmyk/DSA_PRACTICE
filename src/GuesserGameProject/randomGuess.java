package GuesserGameProject;
import java.util.Random;
import java.util.Scanner;

public class randomGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numberToGuess = rd.nextInt(100);

        int guess;
        System.out.println("Welcome to number Guessing Game!");
        System.out.println("Guess any number between 1 to 100:");
        guess = sc.nextInt();
        if(guess==numberToGuess){
            System.out.println("You have guessesed right number"+guess);
        }
        else{
            System.out.println("Try Again!!!");
            System.out.println("The number to guess is "+numberToGuess);
        }
    }
}
