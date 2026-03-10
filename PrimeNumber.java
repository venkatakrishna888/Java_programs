package com.Datavalley.Natural;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE END NUMBER");
	int number=scan.nextInt();
    boolean flag=verifyisprime(number); //Calling point
    if(flag==true)
    	System.out.println("It's prime number");
    else
    	System.out.println("it's not prime number");
	}

	private static boolean verifyisprime(int number) //define point
	{
		int count=0;
		for(int i=1; i<=number; i++)
		{
			if(number% i==0)
			{
		
				count++;
			}
		}
		if(count==2)
			return true;
		else
			return false;
			
    
		
	}

}
