package model;

/**
 * Models a Person that is a Student
 * @author Softvision
 * @since 17/03/2018
 * 
 */
public class Student extends Person {
	
	private final String school;

	public Student(String firstName, String lastName, int age, String school) {
		super(firstName, lastName, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAge()=" + getAge() + "]";
	} 			
}