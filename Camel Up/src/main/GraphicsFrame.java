package main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GraphicsFrame extends JFrame{
	
	private GraphicsPanel gamePanel;
	
	public GraphicsFrame(String title, int width, int height) {
		super(title);
		setSize(width, height);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		gamePanel = new GraphicsPanel();
		setContentPane(gamePanel);
	}
	
	public static void main(String[] args) {
		GraphicsFrame frame = new GraphicsFrame("Camel Up!", 500, 500);
	}
	
}
