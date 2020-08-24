package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*Consider an ArrayList<Test>and  test has  {tid,sid,marks} .
 * Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set in descending order of totalmarks
*/

class Test1{
	private int tid;
	private int sid;
	private int []marks;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public Test1(int tid, int sid, int[] marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
}
class Stud1{
	private int sid;
	private int total;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Stud1 [sid=" + sid + ", total=" + total + "]";
	}
	public Stud1(int sid, int total) {
		super();
		this.sid = sid;
		this.total = total;
	}
	
}


public class Que18Test {
			public static void main(String[] args) {
				HashSet<Stud1> s=new HashSet<Stud1>();
				ArrayList<Test1> tal=new ArrayList<>();
				int arr[]= {50,60,65};
				int arr1[]= {55,70,65};
				int arr2[]= {65,60,90};
				tal.add(new Test1(1,1,arr));
				tal.add(new Test1(2,3,arr1));
				tal.add(new Test1(3,4,arr2));
				for(Test1 t:tal) {
					int sid=t.getSid();
					int ar[]=t.getMarks();
					int total=0;
					for(int i=0;i<ar.length;i++) {
						total=total+ar[i];
					}
					s.add(new Stud1(sid,total));
				}
				System.out.println(s);
				TreeSet<Stud1> ts = new TreeSet<Stud1>(new Comparator<Stud1>(){
					 
		            @Override
		            public int compare(Stud1 o1, Stud1 o2) {
		                // reverse sorting logic
		            	int n=o1.getTotal();
		            	int n1=o2.getTotal();
		            	
		  
		            		return n1-n;
		            	
		            }
		        });
				ts.addAll(s);
				System.out.println(ts);
			}
}
