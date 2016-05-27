package units;

import java.util.LinkedList;

import action.Build;

/**
 * 
 * You can use this class to create your buildings.
 * It contains a LinkedList of Units which it can build.
 * 
 * @author xico
 *
 */
public class Building extends Unit implements Build{

	private LinkedList <Unit> buildableUnits; 
	
	public Building() {
		
	}

	public LinkedList <Unit> getBuildableUnits() {
		return buildableUnits;
	}

	public void setBuildableUnits(LinkedList <Unit> buildableUnits) {
		this.buildableUnits = buildableUnits;
	}
	
	public void build(){
		
	}

}
