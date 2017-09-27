/*
 * Author: Amir Hasan
 * Date: 9-27-17
 * Description: Guessing game for numbers 1 to 10.
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s=input.next();
		System.out.println("Nice to meet you, "+s+".");
		int answer=(int)(Math.random()*10+1);
		int playerGuess=0;
		while(playerGuess!=answer)
		{
			boolean good=false;
			while(!good)
			{
				try
				{
					input.reset();
					System.out.println("Enter your guess.");
					playerGuess=input.nextInt();
					good=true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was not a number.");
				}
			}
			if(playerGuess!=answer)
			{
				System.out.println("That is not the right number. Try again.");
			}
		}
		input.close();
		System.out.println("You guessed it right!");
	}
}

//viewed by Kaitlyn