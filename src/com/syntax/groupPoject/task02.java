package com.syntax.groupPoject;

public class task02 {

	public static void main(String[] args) {
		
		int[][]arraydouble= {
				{3,2,4,5,6,7,8,9,4,456},
				{34,45,34,23,456,7676,345345,234},
				{45,23,567,987,345,6},
				{3,2}
		};
		int sum=0;
		for (int i=0; i<arraydouble.length; i++) {
			for (int j=0; j<arraydouble[i].length; j++) {
				sum+=arraydouble[i][j];
//				System.out.println("The running total so far is " +sum);
			}
		}
		System.out.println("The final total is " +sum);
		

	}

}
