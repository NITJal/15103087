package assignment1;

import java.util.Scanner;

public class SortNames {
	 public static void main(String[] args)
	    {
	        int i, j ,n;
	        String temp;
		System.out.println("Enter no. of names to be entered: ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();	

	        String names[] = new String[n+1];
	        System.out.print("Enter Names : ");
	        for(i=0; i<=n; i++)
	        {
	            names[i] = sc.nextLine();
	        }
		
		System.out.println("\nSorting Names in Alphabetical Order: ");
	        for(i=1; i<=n+1; i++)
	        {
	            for(j=i; j<=n; j++)
	            {
	                if(names[j-1].compareTo(names[j])>0)
	                {
	                    temp=names[j-1];
	                    names[j-1]=names[j];
	                    names[j]=temp;
	                }
	            }
	        }
			
	        System.out.println("Names Sorted in Alphabetical Order: ");
	        for(i=0;i<=n;i++)
	        {
	            System.out.println(names[i]);
	        }
	    }
}
