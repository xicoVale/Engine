package units;

import action.Action;

/**
 * 
 * Units superclass. You can use this to create almost all your units.
 * 
 * @author xico
 *
 */
public class Unit implements Action{
	// Offensive attributes
	private float hitPoints;
	private float attackPoints;
	private float attackRange;
	// Defensive attributes
	private float defensePoints;
	private float armor;
	private float dodge;
	// Line of sight range
	private float sightRange;
	// Movement speed (tiles per turn?)
	private float movementSpeed;
	// Owner of the unit
	private float playerOwner;
	
	private String name;
	
	public Unit(){
		
	}

	public float getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(float hitPoints) {
		this.hitPoints = hitPoints;
	}

	public float getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(float attackPoints) {
		this.attackPoints = attackPoints;
	}

	public float getArmor() {
		return armor;
	}

	public void setArmor(float armor) {
		this.armor = armor;
	}

	public float getDodge() {
		return dodge;
	}

	public void setDodge(float dodge) {
		this.dodge = dodge;
	}

	public float getDefensePoints() {
		return defensePoints;
	}
	
	/**
	 * 
	 * Sets the unit's main defensive attribute, it will allways be a function of
	 * its armor and its dodge values.
	 * 
	 * @param armorModifier How valuable should armor be?
	 * @param dodgeModifier	How valuable should dodge be?
	 */
	public void setDefensePoints(float armorModifier, float dodgeModifier) {
		this.defensePoints = armorModifier * this.getArmor() 
				+ dodgeModifier * this.getDodge();
	}

	public float getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(float attackRange) {
		this.attackRange = attackRange;
	}

	public float getSightRange() {
		return sightRange;
	}

	public void setSightRange(float sightRange) {
		this.sightRange = sightRange;
	}

	public float getMovementSpeed() {
		return movementSpeed;
	}

	public void setMovementSpeed(float movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getOwner() {
		return playerOwner;
	}

	public void setOwner(float playerOwner) {
		this.playerOwner = playerOwner;
	}

	public void move(){
		
	}
	
	public void attack(){
		
	}
}
