/*
 * Author: Amir Hasan
 * Date: 9-26-17
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
					Scanner thing=new Scanner(System.in);
					System.out.println("Enter your guess.");
					playerGuess=thing.nextInt();
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
		System.out.println("You guessed it right!");
	}
}