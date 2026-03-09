package Com.Datavalley.While;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER :");
    int n=scan.nextInt();
    
    if(n<=0)
    {
    	System.err.println("ENTER ONLY POSITIVE NUMBERS :");
    	return;
    }
    boolean flag=strong(n);
    if(flag==true)
    {
    	System.out.println("GIVEN NUMBER IS A STRONG NUMBER");
    }
    else
    {
    	System.out.println("GIVEN NUMBER IS NOT A STRONG NUMBER");
    }
	}

	private static boolean strong(int n) {
	int count=n;
    int	sum=0;
    while(n>0)
    {
	int lastdigit=n%10;
    int f=1;
    
    for (int i=1; i<=lastdigit; i++)
    {
    	f=f*i;
    	
    	
    }
    sum=sum+f;
	n=n/10;
    }
    if(sum==count)
   
    	return true;
   
    else
    		
    		
    	return false;
    
	
	}

}
