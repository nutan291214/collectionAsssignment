package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
/*"An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value"
*/
public class Que19AlphaKey {
	public static void main(String[] args) {
		ArrayList<String> sal=new ArrayList<>();
		sal.add("A+2");
		sal.add("B+12");
		sal.add("D+4");
		sal.add("DD+5");
		sal.add("A+32");
HashMap<String,Integer>hm= new HashMap<>();
		
		
		for(String s:sal)
		{
		String s1[]=s.split("[+]");
		String a=s1[0];
		 int n=Integer.parseInt(s1[1]);
			if(hm.containsKey(s1[0]))
			{
				int al2=hm.get(a);
				al2=al2+n;
				hm.put(a, al2);
				
			}
			else
			{
				//ArrayList<Integer>al1= new ArrayList<Integer>();
				//al1.add(n);
				hm.put(a, n);
				
			}
			
			
				
		}
		System.out.println(hm);

	}

}
