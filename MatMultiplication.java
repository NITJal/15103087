package assignment1;

import java.util.Scanner;

public class MatMultiplication {
	 public static void main(String args[])
	   {
	      int m, n, p, q, sum = 0, i, j, k;
	 
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix");
	      m = sc.nextInt();
	      n = sc.nextInt();
	 
	      int first[][] = new int[m][n];
	 
	      System.out.println("Enter the elements of first matrix");
	 
	      for ( i = 0 ; i < m ; i++ )
	         for ( j = 0 ; j < n ; j++ )
	            first[i][j] = sc.nextInt();
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      p = sc.nextInt();
	      q = sc.nextInt();
	 
	      if ( n != p )
	         System.out.println("Matrices with entered orders can't be multiplied with each other.");
	      else
	      {
	         int second[][] = new int[p][q];
	         int multiply[][] = new int[m][q];
	 
	         System.out.println("Enter the elements of second matrix");
	 
	         for ( i = 0 ; i < p ; i++ )
	            for ( j = 0 ; j < q ; j++ )
	               second[i][j] = sc.nextInt();
	 
	         for ( i = 0 ; i < m ; i++ )
	         {
	            for ( j = 0 ; j < q ; j++ )
	            {   
	               for ( k = 0 ; k < p ; k++ )
	               {
	                  sum = sum + first[i][k]*second[k][j];
	               }
	 
	               multiply[i][j] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product of entered matrices: ");
	 
	         for ( i = 0 ; i < m ; i++ )
	         {
	            for ( j = 0 ; j < q ; j++ )
	               System.out.print(multiply[i][j]+"  ");
	 
	            System.out.print("\n");
	         }
	      }
	   }
}
