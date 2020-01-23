package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections {
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("enter the number :");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 System.out.println("enter values in array");
	 for (int i = 0; i < n; i++) {
		
		 a[i]= sc.nextInt();
	}
		java.util.List<Integer> li=new ArrayList<Integer>(); 
		for (int i = 0; i < a.length; i++){
			
			li.add(a[i]);
			}
	
		java.util.Collections.sort(li);
		System.out.println("ascending :"+li);
		java.util.Collections.reverse(li);
		System.out.println("decending :"+li);
	}

}
