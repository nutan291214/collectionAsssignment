package com.demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*Create a Map<String,String> where key is adharno  and value is voted casted 
 * to which party(eg. BJP,ShivSena,NCP,Congress,Other) .
 * From this create new map such that KEY is party name and value is count of votes casted 
*/


public class Que14Voter {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("enter adhar no,voted casted to which party");
			String adhar_no=sc.next();
			String party=sc.next();
			System.out.println("Do you want to add one more entry y/n");
			ch=sc.next().charAt(0);
			hm.put(adhar_no, party);
		}while(ch=='y'||ch=='Y');
		HashMap<String, Integer> vhm=new HashMap<>();
		Set<Entry<String,String>> s=hm.entrySet();
		for(Entry<String,String> ob:s) {
			String str=ob.getKey();
			String st=ob.getValue();
			if(vhm.containsKey(st)) {
				int i=vhm.get(st);
				i=i+1;
				vhm.put(st, i);
			}
			else {
				vhm.put(st, 1);
			}
		}
		System.out.println(vhm);
	}



}
