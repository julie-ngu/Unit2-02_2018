/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * MrCoxallStack class
 *
 ****************************************************************************/

import java.util.ArrayList;

public class MrCoxallStack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
	private static String update = "";
	
	public String print() {
		//prints entire stack
		update = "\nStack: " + stackArray;
		return update;
	}
	
	public String push(int value) {
		//adds value to stack
		stackArray.add(value);
		update = "Value was added.";
		return update;
	}
	
	public String pop() {
		//removes top value from stack
		int top = stackArray.size()-1;
		stackArray.remove(top);
		update = "Value was removed.";
		return update;
	}
}
