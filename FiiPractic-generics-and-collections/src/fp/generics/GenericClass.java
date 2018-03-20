package fp.generics;

/**
 * 
 * @author Softvision
 * @since 17/03/2018
 *
 * Clasa generica simpla. Vocabular specific:
 * 
 *  - clasa generica - clasa care are cel putin un parametru generic
 *  - generic parameter ( parametru generic ) - se refera la T 
 *  - generic argument ( argument generic ) - se refera la un tip concret cu care se instantiaza o clasa generica  
 *  
 * @param <T>
 */
public class GenericClass<T> {
    
	private final T argument;
	
	public GenericClass(T argument) {
		this.argument = argument;
	}
	
	public T getArgument() {
		return argument;
	}
	
	public String getArgumentClass() {
		return argument.getClass().getName();
	}
	
	public static void main(String[] args) {
		GenericClass<String> genericString = new GenericClass<>("Argument String");
		System.out.println("Argument : " + genericString.getArgument() + "\nClass:" + genericString.getArgumentClass());
		GenericClass<Integer> genericInteger = new GenericClass<>(10);
		System.out.println("Argument : " + genericInteger.getArgument() + "\nClass:" + genericInteger.getArgumentClass());		
	}

}
