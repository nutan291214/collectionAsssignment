
/*"WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students
 who have same marks are together."
*/

package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class StudSet{
	private int sid;
	private String sname;
	private int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudSet [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	public StudSet(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
}
public class Que6StudMap {
	public static void main(String[] args) {
		HashSet<StudSet> ss=new HashSet<>();
		ss.add(new StudSet(101, "nutan", 80));
		ss.add(new StudSet(102, "Basavraj", 80));
		ss.add(new StudSet(103, "renu", 75));
		ss.add(new StudSet(104, "roshan", 75));
		ss.add(new StudSet(105, "Atul", 60));
		
		HashMap<Integer, List<Integer>> hs=new HashMap<>();
		for(StudSet s:ss) {
			int id=s.getSid();
			int marks=s.getMarks();
			if(hs.containsKey(marks)) {
				List<Integer> ls=hs.get(marks);
				ls.add(id);
			}
			else {
				ArrayList< Integer> al=new ArrayList<>();
				al.add(id);
				hs.put(marks,al);
			}
		}
		
		System.out.println(hs);
	}

}
