//Write a java program Read the input from user
//Factorial Number

package com.Datavalley.Natural;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE FACTORIAL NUMBER");
    int number=scan.nextInt();
    if(number<0)
    {
    	System.err.println("Enter only positive numbers");
    	return;
    }
     int fact=factorialnumber(number);
     System.out.println(fact);
	}

	private static int factorialnumber(int number) {
	int product=1;
	for(int i=1; i<=number; i++)
	{
		product=product*i;
	}
	return product;
		
	}

}
