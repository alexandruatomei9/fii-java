package real.tests;

import model.Citizen;
import real.CommonRealPerson;
import real.NomadRealPerson;
import real.RealPerson;
import real.behavior.impl.DifficultWalkingBehaviour;
import real.behavior.impl.NormalWalkingBehaviour;
import real.view.Views;

public class TestRealPerson {
	public static void main(String...args) {
		
		RealPerson[] array = new RealPerson[5];
		array[0] = new CommonRealPerson(new Citizen("Ionel", "Vasilescu", 1, "234543150694"), 
				new DifficultWalkingBehaviour(), "Romana", "Iasi, Strada Garii, nr 10");
		array[1] = new CommonRealPerson(new Citizen("Marian", "Ionescu", 76, "235543150684")
				, "Romana", "Iasi, Strada Garii, nr 12");
		array[2] = new NomadRealPerson(new Citizen("George", "Ion", 21, "234543120694")
				, "Tatar");
		array[3] = new NomadRealPerson(new Citizen("Cristian", "Popescu", 37, "234543150681")
				, "Nomad");
		array[4] = new CommonRealPerson(new Citizen("Alexandru", "Vasilescu", 25, "333543110183"),
				new NormalWalkingBehaviour(Views.SIMPLE), "Romana", "Iasi, Strada Garii, nr 12");
		
		for (int i=0; i<array.length; i++) {
			array[i].walk();
		}

	}
}
