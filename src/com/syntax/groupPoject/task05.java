package com.syntax.groupPoject;
import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = scan.nextInt();
		
		System.out.println("Enter second number ");
		int b = scan.nextInt();
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
		
		a= a+b;
		
		b=a-b;
//		System.out.println(b);
		a=a-b;
		System.out.println("Now first number is = "+a);
		System.out.println("Now second number is = "+b);

	}

}
