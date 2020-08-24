package com.demo;

/*Create two Set of students objects where insertion order in maintained. 

 * Now accept Studentid from user and check whether in both sets have student with given id at same position
*/
import java.util.LinkedHashSet;
import java.util.Scanner;
class Student1{
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + "]";
	}
	public Student1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
}


public class Que15StudObj {
	public static void main(String[] args) {
		LinkedHashSet<Student1> sll=new LinkedHashSet<>();
		sll.add(new Student1(1,"nutan"));
		sll.add(new Student1(2,"Renu"));
		sll.add(new Student1(3,"Atish"));
		LinkedHashSet<Student1>sl=new LinkedHashSet<>();
		sl.add(new Student1(1,"basu"));
		sl.add(new Student1(2,"Renu"));
		sl.add(new Student1(3,"pranali"));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stud id to find same position in set");
		int id=sc.nextInt();
		int pos=0,pos1=0;
		int c=0,c1=0;
		for(Student1 ob:sll) {
			int i=ob.getSid();
			if(i==id) {
				c++;
			}
			pos=c;
			
		}
		for(Student1 ob1:sl) {
			int sid=ob1.getSid();
			if(sid==id) {
				c1++;
			
			}
			pos1=c1;
		}
		if(pos==pos1) {
			System.out.println("position is same");
		}
	}


}
