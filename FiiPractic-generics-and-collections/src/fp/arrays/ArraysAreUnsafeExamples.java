package fp.arrays;
/**
 * Clasa care demonstreaza cateva utilizari ale array-urilor admise de compilator
 * dar care vor genera exceptii de run-time
 *  
 * @author Softvision
 * @since 17/03/2018
 */
public class ArraysAreUnsafeExamples {	
    /**
     * Conversiile Object[] -> String[] sau Object[] -> Integer[]
     * sau in general SuperClasa[] -> SubClasa[] vor genera {@link CastCastExceptiom} la run-time
     * In schimb conversiile inverse String[] -> Object[] sau Integer[] -> Object[] 
     * sau in general SubClasa[] -> SuperClasa[] vor fi admise de compilator
     * dar in cazul in care se va incerca stocarea unui element al carui tip nu e SubClasa , 
     * va fi generata o exceptie de tipul {@link ArrayStoreException} 
     * @see <a href="https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html#jls-5.5.3">Jls Run-time casts</>
     * @param args
     */
	public static void main(String args[]) {
				
		Object[] obj = {"Ionel" , "Gigel" , "Vasilica",1 , new Object()};
        //String[] names = (String[])obj; // ClassCastException
        
		String[] stringLiteralArray = {"Ionel", "Vasile", "Maria"};
		Object[] objectLiteralArray = {1, 2, 3, 4};
		//stringLiteralArray = (String[])objectLiteralArray;// ClassCastException
		
		objectLiteralArray = (Object[])stringLiteralArray;
		objectLiteralArray[2] = 2; // ArrayStoreException
		Integer[] integerArray = new Integer[10];
		//integerArray = (Integer[])objectLiteralArray; // ClassCastException
		Object[] anotherObjectArray = (Object[])integerArray;
		anotherObjectArray[0] = 45;
		//anotherObjectArray[1] = "Un String"; // ArrayStoreException
		String s = (String) anotherObjectArray[0]; // ClassCastException
	}
}
