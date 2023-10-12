package CoreJava;

import java.io.*;
import java.util.Scanner;

public class Singlylinkedlist {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	Node head = null;

	public void creation() {
		System.out.println("Inside creation::");
		int data1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		data1 = sc.nextInt();
		Node new_node = new Node(data1);
		if (head == null) {
			head=new_node;

		} else {
			head.next = new_node;
			System.out.println("newnodedta:: " + new_node.data + "headNext :: " + head+"\n");
		}
	}

	public void traverser() {
		System.out.println("Inside traverser::");
		Node temp = head;
		if (head == null) {
			System.out.println("No items in linkd list\n");
		} else {
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Singlylinkedlist sl = new Singlylinkedlist();
		sl.creation();
		sl.traverser();
		sl.creation();
		sl.traverser();
	}

}
