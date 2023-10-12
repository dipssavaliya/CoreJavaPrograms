package CoreJava;

import java.util.Scanner;

//push, pop, display, top
//underflow, overflow condition

class StackNew {
	int n = 10;
	int[] arr = new int[n];
	int top = -1;

	public void push(Scanner sc) {
		System.out.println("Push called:: Enter element ");
		if (top == n - 1) {
			System.out.println("Overflow Condition\n");

		} else {
			top = top + 1;
			arr[top] = sc.nextInt();
		}
	}

	public void pop() {
		System.out.println("Pop called:: ");
		if (top == -1) {
			System.out.println("Underflow Condition \n");
		} else {
			top = top - 1;
		}
	}

	public void display() {
		System.out.println("Display called:: ");
		if (top == -1) {
			System.out.println("Underflow Condition:: Nothing to display \n");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		}
	}
}

public class stackrevise {
	public static void main(String[] args) {
		StackNew s = new StackNew();
		Scanner sc = new Scanner(System.in);
		s.push(sc);
		s.display();
		s.pop();
		s.display();
		s.push(sc);
		s.display();
	}

}
