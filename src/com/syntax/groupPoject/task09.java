package com.syntax.groupPoject;

import java.util.Arrays;

public class task09 {

	public static void main(String[] args) {
		int array[] = {25, 63, 96, 57, 95};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Arrays are: "+Arrays.toString(array));
	    
	      int largest = array[size -1];
	      int secondLargest = array[size-2];
	     
	      System.out.println("largest is " + largest);
	      System.out.println("2nd largest element is: "+ secondLargest);

	}

}
