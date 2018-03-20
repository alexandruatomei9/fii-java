package real;

import model.Person;
import real.behavior.WalkingBehaviour;

public class CommonRealPerson extends RealPerson {
	
	private String nationality;
    private String address;
    
	public CommonRealPerson(Person person, String nationality, String address) {
		this(person, null, nationality, address);
		this.nationality = nationality;
		this.address = address;
	}
    
	public CommonRealPerson(Person person,WalkingBehaviour walkingBehaviour, String nationality, String address) {
		super(person, walkingBehaviour);
		this.nationality = nationality;
		this.address = address;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof CommonRealPerson))
			return false;
		CommonRealPerson other = (CommonRealPerson) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		return true;
	}	
}
