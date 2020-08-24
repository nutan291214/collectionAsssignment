package com.demo;
import java.util.ArrayList;
import java.util.LinkedList;

/*"Given two LinkedList, we need to combine two LinkedList  in such a way that the combined aList has alternate elements of both. If one list has extra element, then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}
"
*/

public class Que16AlternateSort {
	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<>();
		LinkedList<Integer> list2=new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		System.out.println(list1);
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		System.out.println(list2.size());
		int n=list1.size()+list2.size();
		//System.out.println(list1.get(0));
		System.out.println(n);
		ArrayList<Integer> mergeList=new ArrayList<Integer>(10);
		int l1=0,l2=0;
		for(int i=0;i<10;) {
			if(l1<6) {
				int j=list1.get(l1++);
				//System.out.println(list1.get(l1));
				mergeList.add(i++,j);
				//l1++;
				//i++;
				//System.out.println(mergeList.size());
			}
			if(l2<4) {
				int k=list2.get(l2++);
				mergeList.add(i++,k);
				
			
			}
		}
		System.out.println(mergeList);
	}


}
