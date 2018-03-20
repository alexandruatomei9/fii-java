package fp.generics;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Softvision
 * @since 17/03/2018
 * 
 * Clasa care demonstreaza faptul ca colectiile generice sunt type-safe in contrast cu forma "raw".
 * De asemenea colectiile generice sunt type-safe si relativ la array-uri , fapt demonstrat de al 3-lea exemplu,
 * deoarece principuil substitutiei nu se aplica argumentelor generice. 
 */
public class GenericCollectionsAreTypeSafe {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		//listInteger.add("Un String"); // Eroare de compilare 1)
		List<String> listString = new ArrayList<>();
		listString.add("Un String");
		//listInteger = listString; // Eroare de compilare 2)
		List<Object> listObject = new ArrayList<>();
		//listObject = listString; // Eroare de compilare 3)
	}

}
