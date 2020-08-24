package com.demo;

/*"An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that 
"
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class stud{
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
		return "stud [sid=" + sid + ", sname=" + sname + "]";
	}
	
}

public class Que12Course {
	public static void main(String[] args) {
		HashMap<stud, List<String>> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		char ch,ch1;
		do {
			stud s=new stud();
			System.out.println("enter student id and name");
			s.setSid(sc.nextInt());
			s.setSname(sc.next());
			ArrayList<String> al=new ArrayList<>();
			do {
				System.out.println("enter courses");
				al.add(sc.next());
				System.out.println("Do you want add one more course? y/n");
				ch1=sc.next().charAt(0);
			}while(ch1=='y'||ch1=='Y');
			System.out.println("Do you want add one more course? y/n");
			ch=sc.next().charAt(0);
			hm.put(s, al);
		}while(ch=='y'||ch=='Y');
		System.out.println(hm);
		HashMap<String, List<String>> hm1=new HashMap<>();
		Set<Entry<stud,List<String>>> sa=hm.entrySet();
		for(Entry<stud,List<String>> es:sa) {
			String sname=es.getKey().getSname();
			ArrayList<String> course=(ArrayList<String>) es.getValue();
			for(String c:course) {
				if(hm1.containsKey(c)) {
					List<String> name=hm1.get(c);
					name.add(sname);
				}
				else {
					ArrayList<String> sl=new ArrayList<>();
					sl.add(sname);
					hm1.put(c, sl);
				}
			}
		}
		System.out.println(hm1);
		
		
	}

}
