package awk;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Application app = new Application("Title");
			app.setVisible(true);
		});
	}
}
