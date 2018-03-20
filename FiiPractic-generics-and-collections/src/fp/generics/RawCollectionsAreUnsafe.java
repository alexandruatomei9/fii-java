package fp.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Softvision
 * @since 17/03/2018
 * 
 * Demonstreaza faptul ca raw-collection nu sunt type-safe.
 * Cand utilizam o colectie in forma bruta ( raw ) , operam asupra unor elemente de tip Object, 
 * deci nu avem niciun control ( intrinsec ) a ceea ce introducem in colectie sau a ceea ce accesam,
 * fapt care poate duce foarte usor la exceptii de run-time .
 * Forma "raw" a colectiilor este mentinuta deoarece Java este backwards compatible .
 * Pentru a atentiona o posibila utilizare gresita a colectiilor , sunt generate warning-uri in momentul in care este
 * folosita forma "bruta" a lor. Aceste avertismente se pot suprima , dar acest lucru poate conduce la mascarea anumitor probleme. 
 */
public class RawCollectionsAreUnsafe {
     
	@SuppressWarnings({"rawtypes"})
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);		
		list.add("Un String");
		Integer i1 = (Integer)list.get(0);
		System.out.println(i1);
		//Integer i2 = (Integer)list.get(1); //ClassCastException
		List listInteger = new ArrayList();
		listInteger.add(Integer.valueOf(1));
		listInteger.add(Integer.valueOf(2));
		System.out.println(listInteger);
		List listString = new ArrayList();
		listString.add("String one");
		listString.add("String two");
		System.out.println(listString);
		listString = listInteger; 
		String i3 = (String)listString.get(0); // ClassCastException		
	}

}
