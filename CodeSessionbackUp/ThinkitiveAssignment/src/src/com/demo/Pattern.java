package src.com.demo;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		//int space=row-1,k=1;
		for(int i=1;i<=row;i++) {
			for(int j=row; j>i; j--) {
				 System.out.print("_");
			}
			for (int k=1; k<=i; k++ ) 
            { 
                System.out.print("* "); 
            } 
			for(int l=row-1;l>=i;l--)
			{
				System.out.print("_");
			}
			System.out.println();
		}
				
	}

}
