package com.syntax.groupPoject;

public class task03 {

	public static void main(String[] args) {
		
	
			
			int[][]arrayEvenOdd= {
					{3,2,4,5,6,7,8,9,4,456},
					{34,45,34,23,456,7676,345345,234},
					{45,23,567,987,345,6},
					{3,2}
			};
			
			for (int i=0; i<arrayEvenOdd.length; i++) {
				for (int j=0; j<arrayEvenOdd[i].length; j++) {
					if(arrayEvenOdd[i][j]%2==0) {
						System.out.println("Numer "+arrayEvenOdd[i][j]+ " is even.");
					}else {
						continue;
					}			
			}		
	}

}
	}
