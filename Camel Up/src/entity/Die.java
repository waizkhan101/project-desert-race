package entity;

import java.awt.Color;

public class Die extends ColoredItem {
	
	private int roll;
	
	public Die(Color c) {
		super(c);
	}
	
	public void rollDie() {
		
	}
	
	public int getRoll() {
		return roll;
	}
}
