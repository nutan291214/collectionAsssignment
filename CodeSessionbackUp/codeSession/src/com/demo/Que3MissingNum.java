package com.demo;
import java.util.ArrayList;
/*"Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list."
*/
import java.util.LinkedList;

public class Que3MissingNum {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(3);
		ll.add(7);
		System.out.println(ll);
		ArrayList<Integer> al=new ArrayList<>();
		int c=0;
		int c1=1;
		for(int i=0;i<ll.size();) {
			if((i+c1)!=ll.size()) {
				if(ll.get(i+c1)-ll.get(i)==1) {
					i++;
				}
			
			else
			{
				if(ll.contains(ll.get(i)+c+1)) {
					c=0;
					i++;
				}
				else
				{
					al.add(ll.get(i)+c+1);
					c++;
				}
			}
			}
		}
				
		System.out.println(al);
	}

}
