package com.syntax.groupPoject;

public class task07 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2=1;
		int counter=0;
		
		while (counter<10) {
			System.out.print(num1+" ");

			int num3=num1+num2;
			
			num1=num2;
			num2=num3;
			counter++;
			
			
		}
	}

}



