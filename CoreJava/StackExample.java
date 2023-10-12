package CoreJava;

import java.util.Scanner;

//push, pop, top

//underflow, overflow

class stackE {
	int n = 10;
	int a[] = new int[n];
	int top = -1;

	public void push(Scanner sc) {
		System.out.println("push called \n");
		if (top == n - 1) {
			System.out.println("overflow condition \n");
		} else {

			top = top + 1;
			a[top] = sc.nextInt();
		}
	}

	public void pop() {
		System.out.println("pop called \n");
		if (top == -1) {
			System.out.println("underflow condition");
		} else {
			top = top - 1;
		}
	}

	public void display() {
		System.out.println("display called \n");
		if (top == -1) {
			System.out.println("underflow condition :: nothing to display");
		} else {
			for (int j = top; j >= 0; j--) {
				System.out.println(a[j] + "\n");
			}
		}
	}

}

public class StackExample {

	public static void main(String[] args) {
		stackE s = new stackE();
		Scanner sc = new Scanner(System.in);
		s.push(sc);

		s.display();
		s.pop();
		s.display();
	}
}
