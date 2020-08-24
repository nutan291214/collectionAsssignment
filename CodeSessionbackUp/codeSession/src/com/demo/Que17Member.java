package com.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.
 *   Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of family members 
*/
class Member{
	private int memberId;
	private String wing_flatNo;
	private String name;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getWing_flatNo() {
		return wing_flatNo;
	}
	public void setWing_flatNo(String wing_flatNo) {
		this.wing_flatNo = wing_flatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", wing_flatNo=" + wing_flatNo + ", name=" + name + "]";
	}
	public Member(int memberId, String wing_flatNo, String name) {
		super();
		this.memberId = memberId;
		this.wing_flatNo = wing_flatNo;
		this.name = name;
	}
	
}

public class Que17Member {
	public static void main(String[] args) {
		ArrayList<Member> mal=new ArrayList<>();
		mal.add(new Member(1,"A101", "nutan"));
		mal.add(new Member(2,"A101","renu"));
		mal.add(new Member(3, "A102", "pranali"));
		mal.add(new Member(4, "A103", "kiran"));
		mal.add(new Member(5, "A102", "chaitali"));
		HashMap<String, List<String>> hm=new HashMap<>();
		for(Member m:mal) {
			String flat=m.getWing_flatNo();
			String name=m.getName();
			if(hm.containsKey(flat)) {
				List<String> mn=hm.get(flat);
				mn.add(name);
			}
			else {
				ArrayList<String> mname=new ArrayList<>();
				mname.add(name);
				hm.put(flat, mname);
			}
		}
		System.out.println(hm);
	}

}
