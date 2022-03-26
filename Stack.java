package www.bridgelabz.Stack;

import java.util.Scanner;

public class Stack {
	
	 static int ch;
	 int element, maxsize, top;
	 int[] st;
	 public Stack() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter stack size");
	  maxsize = sc.nextInt();
	  st = new int[maxsize];
	  top = -1;
	 }
	 public void push(int element) {
	
	   st[++top] = element;
	 
	 }
	 public int pop() {
	  if (top == -1) {
	   System.out.println("UnderFlow");
	  }
	  return (st[top--]);
	 }

	 public void display(int[] st, int maxSize) {
	  int i;
	  System.out.println("Stack Elements:");
	  for (i = 0; i <= maxSize; i++)
	   System.out.println(st[i]);
	 }
	


}
