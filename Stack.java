/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Main file for MrCoxallStack program
 *
 ****************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		//gets input from user for stack
		MrCoxallStack userStack = new MrCoxallStack();
		
		System.out.print("Enter a number:\n");
		
		Random randGen = new Random();
		
		for(int counter = 0; counter < 5; counter++) {
			int randNum = randGen.nextInt(10) + 1;
			userStack.push(randNum);
		}
		Scanner userInput = new Scanner(System.in);
		int userNum = userInput.nextInt();
				
		System.out.println(userStack.push(userNum) + userStack.print());
		System.out.println();
		System.out.println(userStack.pop() + userStack.print());
	}
}
