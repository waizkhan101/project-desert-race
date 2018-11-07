package entity;

import java.awt.Color;

public class Camel extends ColoredItem {
	private int loc;
	
	public Camel(Color c) {
		super(c);
		loc = 0;
	}
	
	public int getLocation() {
		return loc;
	}
	
	public void setLocation(int add) {
		loc+= add;
	}
}
