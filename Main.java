
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public static void main (String [] args)
   {
       //Variables
       Random randomNumber = new Random();
       Scanner input = new Scanner(System.in);
       int inputValue = randomNumber.nextInt(10);
       int numberOfTries = 0;
       int success = 0;
       int guess = 0;
       int numberOfGuess=0;
       int guess1=0;

       while(true) {
           inputValue = randomNumber.nextInt(10);
           //numberOfTries = 0;
        while (true) {
        System.out.println("please enter an integer betwen 1 and 10 inclusive: ");
        guess = input.nextInt();
        
        if(guess1==guess) {System.out.println("You already entered number "+guess1);}
        else{
        numberOfGuess = numberOfTries++;}

        if (guess < 1 || guess > 100) System.out.println("Invalid input");
        else if (guess == inputValue) {
            System.out.println("Congratulations you won! Your numbers of tries was: " + numberOfTries + " and the number was: " + inputValue);
            // leave the first loop
            break;
        }
        else if (guess < inputValue) System.out.println("Your guess is too low!");
        else if (guess > inputValue) System.out.println("Your guess is too high!");
    }
    guess1 = guess;
    
    System.out.println("Number of guess = "+numberOfGuess);
    System.out.println("Do you want to play again? (1:Yes/2:No)");
    // if input is not yes leave second loop
    if(input.nextInt() != 1) break;
}
}
}