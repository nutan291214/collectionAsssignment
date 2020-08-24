package com.demo;
/*"Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee along with their Manager name."
*/

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private String ename;
	private int eid;
	private int mgrid;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}
	
}


public class Que11Manager {
	public static void main(String[] args) {
		ArrayList<Employee> eAl=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		char ch;
	    do {
	    	Employee e=new Employee();
	    	System.out.println("Enter employee name,employee id,manager id");
	    	e.setEname(sc.next());
	    	e.setEid(sc.nextInt());
	    	e.setMgrid(sc.nextInt());
	    	System.out.println("Do you want add one more employee y/n");
	    	ch=sc.next().charAt(0);
	    	eAl.add(e);
	    }while(ch=='y'||ch=='Y');
		
	    for(Employee ob:eAl) {
	    	String nm=ob.getEname();
	    	int mid=ob.getMgrid();
	    	String mname="CEO";
	    	for(Employee e:eAl) {
	    		if(e.getEid()==mid) {
	    			mname=e.getEname();
	    			break;
	    		}
	    	}
	    	System.out.println(nm+"\t"+mname);
	    	
	    }
			
			
		
	}

}
