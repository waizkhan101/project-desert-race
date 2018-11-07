package entity;

import java.awt.Color;

public class LegBetCard extends ColoredItem implements Comparable<LegBetCard> {
	

	private int maxValue;

	public LegBetCard(Color c, int maxValue) {
		super(c);
		this.maxValue = maxValue;
	}
	
	public int getValue(int place) {
		return 0;
	}
	
	@Override
	public int compareTo(LegBetCard card) {
		return 0;
	}
	
}
