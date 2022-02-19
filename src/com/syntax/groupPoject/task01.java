package com.syntax.groupPoject;
import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		
		Scanner getint = new Scanner (System.in);
		
		
		System.out.println("Enter a number ");
		int first = getint.nextInt();
		int[] arreyOfNums=new int [first];
		
		for (int i=0; i<arreyOfNums.length;i++ ) {
			System.out.println("Keep entering numbers  ");
			
			int num = getint.nextInt();
			
			arreyOfNums[i]=num;
			} 
		for (int i=0; i<arreyOfNums.length; i++) {
			System.out.print(arreyOfNums[i]+" ");}
		System.out.println();
		int sum=0;
		for (int i=0; i<arreyOfNums.length;i++) {
			sum +=i;
				
		}System.out.println("The sum of all numbers in this arrey is "+ sum);
		}
		
		
}

