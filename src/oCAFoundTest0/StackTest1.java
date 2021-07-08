package oCAFoundTest0;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		stackItem(s1, s2);
		System.out.println(s1 + " "+ s2);
	}
	public static void stackItem(Stack x1, Stack x2) {
		x1.push(new Integer("100"));
		x2=x1;
	}

}
