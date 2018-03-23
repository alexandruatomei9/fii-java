package real.game;

public class Game implements Runnable, IGame {

	private final Thread thread;
	private final int maxPlayers;
	private int numPlayers;
	
	public Game(int maxPlayers) {
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
		Game game = new Game(4);
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
