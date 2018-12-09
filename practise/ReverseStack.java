package com.practise;

import java.util.Iterator;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);

		Iterator<Integer> stakit = stk.iterator();
		while (stakit.hasNext()) {
			System.out.print(stakit.next() + " ");

		}
		System.out.println("");

		reverseOfStack(stk);

	}

	private static void reverseOfStack(Stack<Integer> stk) {
		Stack<Integer> revStack = new Stack<>();
		while (!stk.isEmpty()) {
			revStack.push(stk.pop());
		}

		Iterator<Integer> stakit = revStack.iterator();
		while (stakit.hasNext()) {
			System.out.print(stakit.next() + " ");
		}

	}

}
