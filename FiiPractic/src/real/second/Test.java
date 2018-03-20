package real.second;

import model.Citizen;
import real.second.RealPerson;

public class Test {
	public static void main(String args[]) {
		RealPerson[] array = new RealPerson[5];
		array[0] = new BabyRealPerson(new Citizen("Ionel", "Vasilescu", 1, "234543150694"));
		array[1] = new OldRealPerson(new Citizen("Marian", "Ionescu", 76, "235543150684"));
		array[2] = new NormalRealPerson(new Citizen("George", "Ion", 21, "234543120694"));
		array[3] = new NormalRealPerson(new Citizen("Cristian", "Popescu", 37, "234543150681"));
		array[4] = new NormalRealPerson(new Citizen("Alexandru", "Vasilescu", 25, "333543110183"));
		
		for (int i=0; i<array.length; i++) {
			array[i].walk();
		}
	}
}
