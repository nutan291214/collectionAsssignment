/*"A hashmap contains information about students and his marks. 
 * Student object is key and marks is value. Write a method to 
 * create 2 hashset which will have passed students of java course and passed students of angular course. 
 * Passing marks for java is 50 and passing marks for angular is 60. Student class is as follows.
 *  Student { intsid , String name, String
course }"
*/

package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

class StudCourse{
	private int sid;
	private String name;
	private String course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public StudCourse(int sid, String name, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudCourse [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}
	
}

public class Que4StudCourse {
	public static void main(String[] args) {
		HashMap<StudCourse, Integer> hm=new HashMap<>();
		hm.put(new StudCourse(101,"nutan","java"), 75);
		hm.put(new StudCourse(102,"renuka","java"), 70);
		hm.put(new StudCourse(103,"pranali","angular"), 60);
		hm.put(new StudCourse(104,"chaitali","angular"), 75);
		hm.put(new StudCourse(105,"ankeetaa","java"), 45);
		hm.put(new StudCourse(106,"kiran","angular"), 50);
		HashSet<StudCourse> hs=new HashSet<>();
		HashSet<StudCourse> hs1=new HashSet<>();
		Set<Entry<StudCourse,Integer>> s=hm.entrySet();
		for(Entry<StudCourse,Integer> ob:s) {
			String cname=ob.getKey().getCourse();
			int marks=ob.getValue();
			if(cname.equals("java")&& marks>=50) {
                 hs.add(ob.getKey());				
			}
			if(cname.equals("angular") && marks>=60) {
				hs1.add(ob.getKey());
			}
			
		}
		System.out.println(hs);
		System.out.println(hs1);
		
	}

}
