/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Stack file for MrCoxallStack program
 *
 ****************************************************************************/

import java.util.ArrayList;

public class Stack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
		
	public void push(int value) {
		//adds value to stack
		stackArray.add(value);
	}
	
	public void pop() {
		//removes top value from stack
		int top = stackArray.size()-1;
		stackArray.remove(top);
	}
	
	public void print() {
		//prints entire stack
			System.out.print(stackArray);
	}
}
