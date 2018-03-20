package real.behavior.impl;

import model.Person;
import real.behavior.WalkingBehaviour;
import real.view.ViewStrategy;
import real.view.Views;

public class NormalWalkingBehaviour implements WalkingBehaviour {

	private final ViewStrategy view;
	
	
	public NormalWalkingBehaviour(ViewStrategy view) {		
		this.view = view == null ? Views.DEFAULT : view;
	}

	@Override
	public void walk(Person person) {
		System.out.println(view.display(person) + " walks normally");
    }

}
