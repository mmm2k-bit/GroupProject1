package com.syntax.groupPoject;

public class task08 {

	public static void main(String[] args) {
		int[] numarray = {34,56,3455,45,32,7,4,5,3456546,87,45,4};
		
		int maxvalue = numarray[0];
		int minvalue = numarray[0];
		
		for (int i=0; i<numarray.length; i++) {
			
			if (numarray[i]>maxvalue) {
				maxvalue=numarray[i];
			}else if (numarray[i]<minvalue) {
				minvalue=numarray[i];
			}
		}
		System.out.println(maxvalue);
		System.out.println(minvalue);
		

	}

}
