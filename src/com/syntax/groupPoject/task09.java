package com.syntax.groupPoject;

public class task09 {

	public static void main(String[] args) {
		int[] numarray = {34,56,3455,45,32,7,4,5,3456546,87,45,4};
		
		int largest = numarray[0];
		
		
		for (int i=0; i<numarray.length; i++) {
			
			if (numarray[i]>largest) {
				largest=numarray[i];
			}
		}
		
		int secondlarge =0;
		for (int i=0; i<numarray.length; i++) {
			
			if (numarray[i]>largest-1) {
				secondlarge=numarray[i];
			}
		}
		
		
//		System.out.println(largest);
		System.out.println(secondlarge);
		

	}

}
