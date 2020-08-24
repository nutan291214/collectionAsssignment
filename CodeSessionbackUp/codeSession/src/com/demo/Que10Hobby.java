package com.demo;



/*"Consider an array of Student 
Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name and list of
student objects having same hobby. Also find out most common hobby among students"
*/




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Student{
	private int sid;
	private String sname;
	private List<String> hobby;
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
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", hobby=" + hobby + "]";
	}
	
}

public class Que10Hobby {
	public static void main(String[] args) {
		ArrayList<Student> sal=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		char ch,ch1;
		do {
			 Student s=new Student();
			 System.out.println("enter student id, student name");
			 s.setSid(sc.nextInt());
			 s.setSname(sc.next());
			 ArrayList<String> hobbyAl=new ArrayList<>();
			 do {
				 System.out.println("Enter hobby");
				 hobbyAl.add(sc.next());
				 System.out.println("Do ypu want to add one more hobby y/n");
				 ch1=sc.next().charAt(0);
				 
			 }while(ch1=='y'||ch1=='Y');
			 s.setHobby(hobbyAl);
			 System.out.println("Do ypu want to add one more student y/n");
			 ch=sc.next().charAt(0);
			 sal.add(s);
		}while(ch=='y'||ch=='Y');
		
		//System.out.println(sal);
		HashMap<String, List<String>> hm=new HashMap<>();
		for(Student stud:sal) {
			String sname=stud.getSname();
			List<String> hobby=stud.getHobby();
			for(String hb:hobby) {
				
			
			if(hm.containsKey(hb)) {
				List<String> snm=hm.get(hb);
				snm.add(sname);
			}
			else {
				ArrayList<String> al=new ArrayList<>();
				al.add(sname);
				hm.put(hb, al);
			}
			}
		}
	
		System.out.println(hm);
	}



}
