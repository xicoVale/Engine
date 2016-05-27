package map;

public class Map {

	private static Map map = new Map();
	
	
	private Map() {}
	
	public static Map getInstance(){
		return map;
	}

}
