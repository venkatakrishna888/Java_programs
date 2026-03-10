//Write a java program To Read the input from the user
//FabinociSeries

package com.Datavalley.Natural;

import java.util.Scanner;

public class FabinociSeries {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE FABINOCISERIES");
	int number=scan.nextInt();
	if(number<0)
	{
		System.err.println("ENTER ONLY POSITIVE NUMBERS");
		return;
	}
	febinoceseries(number);

	}

	private static void febinoceseries(int number) {
	int first_term=0;
	int second_term=1;
	for(int i=1; i<=number; i++)
	{
		int next_term=first_term + second_term;
		System.out.print(first_term +" ");
		
		first_term=second_term;
		second_term=next_term;
	}
	return;
	}

}
