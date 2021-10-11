package com.company;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here

        // q1
        Scanner input = new Scanner(System.in);
        System.out.println("the new word?");
        String NewWord = input.next();
        System.out.println("Your guess?");
        String UserWordGuess = input.next();
        if (UserWordGuess.equals(NewWord)){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }


        // q2

        System.out.println("Enter to top limit. min is 1, max is 10000.");
        int maxNumber = input.nextInt();
        while (maxNumber < 1 || maxNumber > 1000){
            System.out.println("Not a valid choice, please enter another number: ");
            maxNumber = input.nextInt();
        }
        Random RandNum = new Random();


        int NumberToGuess = RandNum.nextInt(maxNumber + 1);
        int NumberOfGuesses = 0;
        int guess = 0;

        while(guess != NumberToGuess && NumberOfGuesses < 5 ){
            System.out.println("Have A guess");
            guess = input.nextInt();
            NumberOfGuesses = NumberOfGuesses +1;

        }
        if (guess == NumberToGuess){
            System.out.println("you win");
        }else{
            System.out.println("you lose");
        }
        System.out.println("the random number was "+NumberToGuess);




    }

}
