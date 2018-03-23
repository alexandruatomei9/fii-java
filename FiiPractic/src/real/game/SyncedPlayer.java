package real.game;

public class SyncedPlayer implements Runnable {
	
	private final Thread t;
	private final String name;
	private final IGame game;
	
	public SyncedPlayer(String name, IGame game) {
		this.name = name;
		this.game = game;
		this.t = new Thread(this);
		t.start();
	}
	
	public void run() {
		System.out.println(name + " is trying to join ... ");
		synchronized(game) {
			if(game.getNumPlayers() < game.getMaxPlayers()) {		
				System.out.println(name + " is joining ... ");
				System.out.println(name + " has joined ... ");
				game.incrementPlayers();
			} 
		}
	}

	public String getName() {
		return name;
	}

	public IGame getGame() {
		return game;
	}
		
}
