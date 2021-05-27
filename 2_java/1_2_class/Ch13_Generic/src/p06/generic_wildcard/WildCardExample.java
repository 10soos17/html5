package p06.generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	public static void main(String[] args) {

		// 일반인 과정
		Course<Person> p = new Course<Person>("일반인과정", 5);
		p.add(new Person("일반인"));
		p.add(new Worker("직장인"));
		p.add(new Student("학생"));
		p.add(new HighStudent("고등학생"));

		// 직장인 과정
		Course<Worker> p1 = new Course<Worker>("직장인과정", 5);

		p1.add(new Worker("직장인"));
		p1.add(new Worker("직장인"));
		p1.add(new Worker("직장인"));

		// 학생 과정
		Course<Student> p2 = new Course<Student>("학생과정", 5);

		p2.add(new Student("학생"));
		p2.add(new HighStudent("고등학생"));
		p2.add(new Student("학생"));

		// 고등학생 과정
		Course<HighStudent> p3 = new Course<HighStudent>("고등학생과정", 5);

		p3.add(new HighStudent("고등학생"));
		p3.add(new HighStudent("고등학생"));
		p3.add(new HighStudent("고등학생"));

		registerCourse(p);
		registerCourse(p1);
		registerCourse(p2);
		registerCourse(p3);
		System.out.println();

		registerCourseWorker(p);
		registerCourseWorker(p1);
		// registerCourseWorker(p2);
		// registerCourseWorker(p3);
		System.out.println();

		// registerCourseStudent(p);
		// registerCourseStudent(p1);
		registerCourseStudent(p2);
		registerCourseStudent(p3);
		System.out.println();

	}

	// 모든과정: ? (all, Object): 모든 과정 - Person, Worker, Student, HighStudent
	public static void registerCourse(Course<?> c) {
		System.out.println(c.getName() + "수강생" + Arrays.toString(c.getStudents()));
	}

	// 직장인과정: Person, Worker
	public static void registerCourseWorker(Course<? super Worker> c) {
		System.out.println(c.getName() + "수강생" + Arrays.toString(c.getStudents()));
	}

	// 학생과정: Student, HighStudent
	public static void registerCourseStudent(Course<? extends Student> c) {
		System.out.println(c.getName() + "수강생" + Arrays.toString(c.getStudents()));
	}
}
