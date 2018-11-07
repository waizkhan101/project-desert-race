package entity;

import java.awt.Color;

public class FinalBetCard extends ColoredItem {
	
	private String playerName;
	
	public FinalBetCard(Color c, String playerName) {
		super(c);
		this.playerName = playerName;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
}
