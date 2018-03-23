package real.game;

public class BrokenGame implements Runnable, IGame {
	
	private final Thread thread;
	private final int maxPlayers;
	private int numPlayers;
	
	public BrokenGame(int maxPlayers) {
		this.maxPlayers = maxPlayers;
		this.numPlayers = 0; //default
		this.thread = new Thread(this);
		this.thread.start();
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public int getNumPlayers() {
		return numPlayers;
	}
	
	public void incrementPlayers() {
		numPlayers++;
	}

	private Thread getContext() {
		return this.thread;
	}
	
	public static void main(String args[]) throws InterruptedException {
		BrokenGame game = new BrokenGame(4);
		game.getContext().join();
		
		Thread.sleep(5000);
		System.out.println("End of the game: Max Players:" + game.getMaxPlayers() + ", actual number of players:" + game.getNumPlayers());
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			SyncedPlayer p = new SyncedPlayer("Player " + i, this);			
		}		
	}
}
