package entity;

public class DesertTile {
	
	private boolean whichSide;
	private String playerName;
	
	public DesertTile(String playerName) {
		this.playerName = playerName;
	}
	
	public boolean getSide() {
		return whichSide;
	}


	public String getPlayerName() {
		return playerName;
	}
	
	public void setSide(boolean side) {
		
	}

}
