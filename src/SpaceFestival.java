	import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpaceFestival {
	final static int WIDTH = 600;
	final static int HEIGHT = 400;
	static JFrame frame;
	GamePanel panel;
	
	public SpaceFestival() {
		frame = new JFrame();
		panel = new GamePanel();
	}
	
	public static void main(String[] args) {
		SpaceFestival festival = new SpaceFestival();
		festival.setup();
	}
	
	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
        panel.startGame();
	}
}
