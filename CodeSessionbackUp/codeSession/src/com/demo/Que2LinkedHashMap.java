package com.demo;
import java.util.ArrayList;
/*"Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {
“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”"
*/
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Que2LinkedHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String, Integer> lm=new LinkedHashMap<>();
		lm.put("pqr", 12);
		lm.put("rst", 43);
		lm.put("abc", 4);
		lm.put("mno", 2);
		 
		ArrayList<String> al=new ArrayList<>();
		for(String s:lm.keySet()) {
			al.add(s);
		}
		ArrayList<String> cal=new ArrayList<>();
		int i=1;
		System.out.println("enter string");
		for(i=1;i<=2;i++) {
			String str=sc.next();
			cal.add(str);
		}
		
		for(int j=0;j<1;j++) {
			for(int k=0;k<al.size();k++) {
				if(cal.get(j).equals(al.get(k))) {
					if(cal.get(1).equals(al.get(k+1))) {
						System.out.println("true");
						break;
					}
					else
					{
						System.out.println("false");
						break;
					}
				}
			}
		}
	}


}
