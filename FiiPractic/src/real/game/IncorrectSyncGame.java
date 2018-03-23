package real.game;

public class IncorrectSyncGame implements Runnable, IGame {
	
	private final Thread thread;
	private final int maxPlayers;
	private int numPlayers;
	
	public IncorrectSyncGame(int maxPlayers) {
		this.maxPlayers = maxPlayers;
		this.numPlayers = 0; //default
		this.thread = new Thread(this);
		this.thread.start();
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public synchronized int getNumPlayers() {
		return numPlayers;
	}
	
	public synchronized void incrementPlayers() {
		numPlayers++;
	}

	private Thread getContext() {
		return this.thread;
	}
	
	public static void main(String args[]) throws InterruptedException {
		IncorrectSyncGame game = new IncorrectSyncGame(4);
		game.getContext().join();
		
		Thread.sleep(5000);
		System.out.println("End of the game: Max Players:" + game.getMaxPlayers() + ", actual number of players:" + game.getNumPlayers());
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			Player p = new Player("Player " + i, this);			
		}		
	}
}
