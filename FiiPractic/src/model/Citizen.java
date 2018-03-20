package model;

/**
 * Models a Person that is a Citizen 
 * 
 * @author Softvision
 * @since 17/03/2018
 */
public class Citizen extends Person {
	
	/**
	 * Personal Identification Number
	 */
	private final String pin;

	public Citizen(String firstName, String lastName, int age, String pin) {
		super(firstName, lastName, age);
		this.pin = pin;
	}

	public String getPin() {
		return pin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pin == null) ? 0 : pin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Citizen))
			return false;
		Citizen other = (Citizen) obj;
		if (pin == null) {
			if (other.pin != null)
				return false;
		} else if (!pin.equals(other.pin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Citizen [pin=" + pin + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAge()=" + getAge() + "]";
	} 		
}
