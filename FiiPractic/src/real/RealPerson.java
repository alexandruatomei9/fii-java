package real;

import model.Person;
import real.behavior.WalkingBehaviour;
import real.behavior.impl.DefaultWalkingBehaviour;
import real.exc.UnknownWalkingBehaviour;

/**
 * A Real Person that has an walking behaviour associated
 * Also demonstrates constructor overloading
 * Exposes mutable state
 * Demonstrates the concept of strategy / composition
 * 
 * @author Softvision
 * @since 17/03/2018
 *
 */
public abstract class RealPerson {
	
	private final Person person;
    private WalkingBehaviour walkingBehaviour;
	
	public RealPerson(Person person) {	
		this(person, new DefaultWalkingBehaviour());
	}

	public RealPerson(Person person, WalkingBehaviour walkingBehavior) {		
		this.person = person;
		this.walkingBehaviour = walkingBehavior == null ? new DefaultWalkingBehaviour() : walkingBehavior;
	}

	public WalkingBehaviour getWalkingBehavior() {
		return walkingBehaviour;
	}
    
	/**
	 * Sets the walking behaviour which may change 
	 * e.g : a baby learns how to walk and changes behaviour
	 * 
	 * @param walkingBehavior
	 */
	public void setWalkingBehavior(WalkingBehaviour walkingBehavior) {
		this.walkingBehaviour = walkingBehavior;
	}

	public Person getPerson() {
		return person;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RealPerson))
			return false;
		RealPerson other = (RealPerson) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	/**
	 * Delegates to the associated walking behaviour
	 */
	public final void walk() {
		try {
			walkingBehaviour.walk(person);
		} catch (UnknownWalkingBehaviour e) {			
			System.out.println(person + " Has no walking behaviour associated");
		}
	}
}
