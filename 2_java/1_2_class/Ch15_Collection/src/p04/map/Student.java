package p04.map;

import p03.set.Person;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return (name+sno).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student p = (Student) obj;
			return this.name.equals(p.name) && this.sno == p.sno;
		}
		return false;
	}
}
