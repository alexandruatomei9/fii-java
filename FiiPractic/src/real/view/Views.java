package real.view;

public class Views {

	private Views() {		
		throw new IllegalStateException("Not instantiable");
	}
	
	public static ViewStrategy SIMPLE = new SimpleView();
	public static ViewStrategy DEFAULT = new DefaultView();
}
