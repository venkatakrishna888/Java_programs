//Write a java program To Read the input from the user
//Multiplication Table

package com.Datavalley.Natural;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Table name");
	int tablename=scan.nextInt();
	if(tablename<0)
	{
		System.err.println("ENTER ONLY POSITIVE TABLENUMBERS");
		return;
	}
	Multiplicationtable(tablename);
	
	}

	private static void Multiplicationtable(int tablename) {
	int product=1;
	int i=0; 
	for( i=1; i<=10; i++)
		
	{
		product=tablename*i;
		System.out.println(tablename+ "x" +i+ "=" +product);
	}

	}

}
