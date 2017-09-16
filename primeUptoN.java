package assignment1;

	import java.util.Scanner;
	import java.lang.*;
	
	public class primeUptoN {
	static void isPrime(int n){
	 boolean prime[]= new boolean[n+1];
	 for(int i=0;i<n;i++)
	 prime[i]=true;
	 
	 for(int j=2;j*j<=n;j++)
	 {
	   if(prime[j]==true)
		{ 
		  for(int i=j*j;i<=n;i++)
			  if(i%j==0)
			prime[i]=false;
		}
	  }
	 for(int k=2;k<=n;k++)
	 {
		if(prime[k]==true)
		System.out.println(k);
	  }
	}
	 public static void main(String args[]){
	 System.out.println("Enter no. uptowhich prime nos. are to be printed: ");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();  
	 System.out.println("prime nos. are: ");
	 isPrime(n);
	}
}
