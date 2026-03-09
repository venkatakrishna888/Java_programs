package Com.Datavalley.While;

import java.util.Scanner;

public class Palendrome {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER A NUMBER :");
	int n=scan.nextInt();
	
	if(n<=0)
	{
		System.err.println("ENTER ONLY POSITVE NUMBERS (+) ");
		return;
	}
    boolean value=phol(n);
    if(value==true)
    {
    	System.out.println("GIVEN NUMBER IS A POLINDROME NUMBER");
    }
    else
    {
    	System.out.println("GIVEN NUMBER IS NOT A POLINDROME NUMBER");
    }
	}

	private static boolean phol(int n) {
	int temp=n;
	int reverse=0;
	while(n>0)
	{
		int lastdigit=n%10;
		{
		reverse=reverse*10+lastdigit;
		}
		n=n/10;
	}
		if(reverse==temp)
			return true;
		else
			return false;
	}

}
