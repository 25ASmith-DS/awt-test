package awk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Board extends JPanel {
	public final int WIDTH = 640;
	public final int HEIGHT = 480;

	/*
	 * Constructor
	 */
	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D graphics = (Graphics2D)g;
		graphics.setColor(Color.RED);
		graphics.fillRect(10, 10, 10, 10);
	}

}
