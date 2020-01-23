package programs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
		int count=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the num");
    	int n=sc.nextInt();
    	for (int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				count=1;
			}
    		
		}if (count==0) {
			System.out.println("It id prime num");
		}
		else
		{
			System.out.println("it is not prime");
		}
    	
    	
	}
}
