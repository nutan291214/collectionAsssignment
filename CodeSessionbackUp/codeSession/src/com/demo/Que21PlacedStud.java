package com.demo;

import java.util.ArrayList;
import java.util.HashSet;

/*"There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)"
*/
class StudPlace{
	private int studId;
	private String sname;
	private String qualification;
	private int yearOfPassing;
	private boolean placed;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public boolean isPlaced() {
		return placed;
	}
	public void setPlaced(boolean placed) {
		this.placed = placed;
	}
	@Override
	public String toString() {
		return "StudPlace [studId=" + studId + ", sname=" + sname + ", qualification=" + qualification
				+ ", yearOfPassing=" + yearOfPassing + ", placed=" + placed + "]";
	}
	public StudPlace(int studId, String sname, String qualification, int yearOfPassing, boolean placed) {
		super();
		this.studId = studId;
		this.sname = sname;
		this.qualification = qualification;
		this.yearOfPassing = yearOfPassing;
		this.placed = placed;
	}
	
}
public class Que21PlacedStud {
	public static void main(String[] args) {
		HashSet<StudPlace> sal=new HashSet<>();
		sal.add(new StudPlace(1, "nutan", "BE", 2018, true));
		sal.add(new StudPlace(2, "renu", "BE", 2019, true));
		sal.add(new StudPlace(3, "mayur", "BTech", 2020, false));
		sal.add(new StudPlace(4, "shubham", "BE", 2020, false));
		ArrayList<String> placed=new ArrayList<>();
		ArrayList<String> notPlaced=new ArrayList<>();
		for(StudPlace sp:sal) {
			String sname=sp.getSname();
			boolean place=sp.isPlaced();
			if(place) {
				placed.add(sname);
			}
			else {
				notPlaced.add(sname);
			}
		}
		System.out.println(sal);
		System.out.println(placed);
		System.out.println(notPlaced);
	}

}
