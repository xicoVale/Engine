package player;

import java.util.LinkedList;

import units.Builder;
import units.Building;
import units.Unit;

public class Player {

	private int playerId;
	
	private LinkedList<Unit> units;
	private LinkedList<Builder> builders;
	private LinkedList<Building> buildings;
	
	public Player() {
	
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public LinkedList<Unit> getUnits() {
		return units;
	}

	public void setUnits(LinkedList<Unit> units) {
		this.units = units;
	}

	public LinkedList<Builder> getBuilders() {
		return builders;
	}

	public void setBuilders(LinkedList<Builder> builders) {
		this.builders = builders;
	}

	public LinkedList<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(LinkedList<Building> buildings) {
		this.buildings = buildings;
	}

}
