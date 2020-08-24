package master_assignment.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import master_assignment.bean.Academy;
import master_assignment.bean.Course;
import master_assignment.bean.Student;

public class CourseManager {

	public static void addTwoCourse() {
		Course c1 = new Course(1, "Computer", new Date(3 / 10 / 2017), "java", 30000, "2 months");
		Course c2 = new Course(2, "IT", new Date(4 / 10 / 2017), "Adv java", 40000, "3 months");
		Academy.courseList.add(c1);
		Academy.courseList.add(c2);
	}

	public static void printCourses() {

		List<Course> courseList = Academy.courseList;
		for (Iterator<Course> iterator = courseList.iterator(); iterator.hasNext();) {
			Course course = (Course) iterator.next();
			System.out.println(course);
		}
	}

	public static void printCourse(int inputCourseId) {

		List<Course> courseList = Academy.courseList;
		for (Iterator<Course> iterator = courseList.iterator(); iterator.hasNext();) {
			Course course = (Course) iterator.next();
			if (course.courseId == inputCourseId) {
				System.out.println(course.course_name);
			}
		}
	}

	public static void printCourseByMultipleInputs(Set<Integer> inpuSetOfCourseId) {

		List<Course> courseList = Academy.courseList;
		for (Iterator<Course> iterator = courseList.iterator(); iterator.hasNext();) {
			Course course = (Course) iterator.next();
			if (inpuSetOfCourseId.contains(course.courseId)) {
				System.out.println(course.course_name);
			}
		}
	}

	/**
	 * Course with maximum number of students is most favoured course
	 */
	public static void printMostFavouredCourse() {
		HashMap<Integer, List<Student>> studentMap = Academy.studentMap;

		Set<Entry<Integer, List<Student>>> entrySet = studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> iterator = entrySet.iterator();

		int maxNoOfStudentsCount = -1;

		while (iterator.hasNext()) {
			Entry<Integer, List<Student>> entry = iterator.next();
			List<Student> studentList = entry.getValue();
			if (maxNoOfStudentsCount < studentList.size()) {
				maxNoOfStudentsCount = studentList.size();
			}
		}
		Set<Integer> setOfCourseIdOfMaxNoOfStudents = new HashSet<>();
		Iterator<Entry<Integer, List<Student>>> iteratorForMaxCourseId = entrySet.iterator();
		while (iteratorForMaxCourseId.hasNext()) {
			Entry<Integer, List<Student>> entry = iteratorForMaxCourseId.next();
			List<Student> studentList = entry.getValue();
			if (maxNoOfStudentsCount == studentList.size()) {
				setOfCourseIdOfMaxNoOfStudents.add(entry.getKey());
			}
		}
		printCourseByMultipleInputs(setOfCourseIdOfMaxNoOfStudents);
	}

	public static ArrayList<Course> addCourse() {
		Course c1 = new Course(1, "DW", new Date(3 / 10 / 2017), "java", 30000, "2 months");
		Course c2 = new Course(2, "Angular", new Date(4 / 10 / 2017), "Adv java", 40000, "3 months");
		Course c3 = new Course(3, "Java", new Date(5 / 10 / 2017), "networking", 20000, "2 months");
		Course c4 = new Course(4, "Dot Net", new Date(6 / 10 / 2017), "java", 30000, "4 months");
		Course c5 = new Course(5, "Soft Skills", new Date(7 / 10 / 2017), "Ecg", 50000, "5 months");

		Academy.courseList.add(c1);
		Academy.courseList.add(c2);
		Academy.courseList.add(c3);
		Academy.courseList.add(c4);
		Academy.courseList.add(c5);

		return Academy.courseList;
	}

	public static Course GetCourse(int inputCourseId) {
		List<Course> courseList = Academy.courseList;
		for (Iterator<Course> iterator = courseList.iterator(); iterator.hasNext();) {
			Course course = (Course) iterator.next();
			
			if (course.courseId == inputCourseId) {
				return course;
			}
		}
		return null;
		
			}

}
