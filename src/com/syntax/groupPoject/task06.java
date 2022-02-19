package com.syntax.groupPoject;
import java.util.Scanner;
public class task06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Enter a num to find out if it's true ");
		int num = scan.nextInt();

		if (num < 2) {
			System.out.println(num + " is not a prime number");
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");

				}

			}
			System.out.println(num + " is a prime number");
			

		}
		

	}
}