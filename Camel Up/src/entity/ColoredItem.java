package entity;

import java.awt.Color;

public abstract class ColoredItem {
	
	protected Color color;
	
	public ColoredItem(Color c) {
		this.color = c;
	}
	
	public Color getColor() {
		return color;
	}
}
