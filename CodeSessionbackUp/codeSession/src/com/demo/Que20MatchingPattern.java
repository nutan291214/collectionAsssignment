package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/*"An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and so on. Create a
method which accepts a character String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern"
*/
public class Que20MatchingPattern {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("D+5");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to match");
		String s=sc.next();
		for(String str:al) {
			String st[]=str.split("[+]");
			String a=st[0];
			int n=Integer.parseInt(st[1]);
			if(a.equals(s)) {
				System.out.println(n);
			}
		}
		
	}

}
