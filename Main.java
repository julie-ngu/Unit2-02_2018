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

public class Main {
	public static void main(String[] args) {
		//gets input from user for stack
		Stack userStack = new Stack();
		
		System.out.print("Enter a number:\n");
		
		Random randGen = new Random();
		
		for(int counter = 0; counter < 5; counter++) {
			int randNum = randGen.nextInt(10) + 1;
			userStack.push(randNum);
		}
		Scanner userInput = new Scanner(System.in);
		int userNum = userInput.nextInt();
				
		userStack.push(userNum);
		//System.out.print("Push: ");
		//userStack.print();
		
		userStack.pop();
		//System.out.print("\nPop: ");
		//userStack.print();
	}
}
