
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame 
{
    public static void main(String[] args) 
    {
            Random r = new Random();
            int randomNo = r.nextInt(100) + 1;
            System.out.println("Welcome to the Number Guessing Game");
            System.out.println("RULE: " + "\t" + "• Player will get only 5 Attempts to Guess !");
            Scanner s = new Scanner(System.in);

    //        System.out.println("The random number generated by system is " + randomNo);
            int tryCount = 0;

            while(true)
            {
                System.out.println("Enter your guess (1-100):");

                int playerNo= s.nextInt();
                tryCount++;
                if (tryCount <= 4) 
                {
                    if (playerNo == randomNo) 
                    {
                        System.out.println("Congratulations! You Guessed the Number right");
                        System.out.println("It took you " + tryCount + " tries to Guess");
                        break;
                    } else if (randomNo > playerNo) 
                    {
                        System.out.println("Nope! The number is higher.Please Guess again.");
                    } else 
                    {
                        System.out.println("Nope! The number is lower.Please Guess again.");
                    }
                } 
                else 
                {
                    System.out.println("You have exhausted your attempts. Try again!");
                    System.out.println("The Number was:"+randomNo);
                    break;
                }
            }
            s.close();
    }
}