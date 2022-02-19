package com.syntax.groupPoject;

public class task04 {

	public static void main(String[] args) {
		int[][]arrayEvenAndOdd= {
				{3,2,4,5,6,7,8,9,4,456},
				{34,45,34,23,456,7676,345345,234},
				{45,23,567,987,345,6},
				{3,2}
		};
		int sumEven=0;
		int sumOdd=0;
		for (int i=0; i<arrayEvenAndOdd.length; i++) {
			for (int j=0; j<arrayEvenAndOdd[i].length; j++) {
				if (arrayEvenAndOdd[i][j]%2==0) {
				sumEven+=arrayEvenAndOdd[i][j];
				System.out.println("The running total of even numbers so far is " +sumEven);
			}else {
				sumOdd+=arrayEvenAndOdd[i][j];
				System.out.println("The running total of even numbers so far is " +sumOdd);
			}
				
			}
		}
		System.out.println("The final total of even numbers is " +sumEven);
		System.out.println("The final total of odd numbers is " +sumOdd);


	}

}
