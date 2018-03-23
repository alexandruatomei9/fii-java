package real.game;

public class Player implements Runnable {
	private final String name;
	private final IGame game;
	
	public Player(String name, IGame game) {
		this.name = name;
		this.game = game;
		Thread t = new Thread(this);
		t.start();
	}
	
	public void run() {
		System.out.println(name + " is trying to join ... ");
		if(game.getNumPlayers() < game.getMaxPlayers()) {		
			System.out.println(name + " is joining ... ");
			System.out.println(name + " has joined ... ");
			game.incrementPlayers();
		} 
	}

	public String getName() {
		return name;
	}

	public IGame getGame() {
		return game;
	}
		
}
