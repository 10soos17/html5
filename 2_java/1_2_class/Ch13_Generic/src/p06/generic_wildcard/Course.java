package p06.generic_wildcard;

public class Course<T> {
	// 학원 교육과정 개설
	private String name;
	// private T[] students = (T[]) new Object[5]; 배열 선언
	private T[] students;// 배열 크기

	public Course(String name, int capacity) {// "학생", 5
		this.name = name;
		this.students = (T[]) new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	// 배열에 비어 있는 부분을 찾아서 수강생 추가
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
