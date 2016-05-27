package game;

import java.util.LinkedList;

import map.Map;
import player.Player;

public class Game {

	private static Game game = new Game();
	
	private LinkedList<Player> players;
	private Map map;
		
	private Game() {}
	
	public static Game getInstance() {
		return game;
	}

	public LinkedList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(LinkedList<Player> players) {
		this.players = players;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

}
