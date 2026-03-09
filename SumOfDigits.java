package Com.Datavalley.While;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER A NUMBER :");
	int n=scan.nextInt();
	
	if(n<=0)
	{
		System.err.println("ENTER ONLY POSITIVE NUMBERS :");
		return;
	}
     int value=sum(n);
     System.out.println("SUM OF THE DIGITS =" +value);
	}

	private static int sum(int n) {
	int sum=0;
	while(n>0)
	{
	int lastdigit=n%10;
	sum=sum+lastdigit;
	n=n/10;
		}
	return sum;
	}

}
