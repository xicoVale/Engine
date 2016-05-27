package units;

import java.util.LinkedList;

import action.Build;
/**
 * 
 * You can use this class to create your builders. 
 * It contains a LinkedList of buildings it can build.
 * 
 * @author xico
 *
 */
public class Builder extends Unit implements Build{

	private LinkedList <Building> buildings;
	
	public Builder() {
		
	}

	public LinkedList <Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(LinkedList <Building> buildings) {
		this.buildings = buildings;
	}
	
	public void build() {
		
	}
	

}
