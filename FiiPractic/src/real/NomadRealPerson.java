package real;

import model.Person;
import real.behavior.WalkingBehaviour;

public class NomadRealPerson extends RealPerson {
	
	private String ethnicity;

	public NomadRealPerson(Person person, String ethnicity) {
		this(person, null, ethnicity);
		this.ethnicity = ethnicity;
	}    
    
	public NomadRealPerson(Person person, WalkingBehaviour walkingBehaviour, String ethnicity) {
		super(person, walkingBehaviour);
		this.ethnicity = ethnicity;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ethnicity == null) ? 0 : ethnicity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof NomadRealPerson)) {
			return false;
		}
		NomadRealPerson other = (NomadRealPerson) obj;
		if (ethnicity == null) {
			if (other.ethnicity != null) {
				return false;
			}
		} else if (!ethnicity.equals(other.ethnicity)) {
			return false;
		}
		return true;
	}        
}
