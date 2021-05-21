package p03.object.hashcode;

import p03.object.equals.Circle;

public class Name {
	String firstName;
	String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {

		return firstName.hashCode() + lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {// c2
		if (!(obj instanceof Name)) {
			return false;
		}
		Name n = (Name) obj;
		if (this.firstName.equals(n.firstName) && this.lastName.equals(n.lastName)) {
			return true;
		}
		return false;
	}
}
