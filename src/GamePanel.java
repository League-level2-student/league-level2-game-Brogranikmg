import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	GameObject object;
	final int MENU_STATE = 0;
	final int INTRO_STATE = 1;
	int currentState = MENU_STATE;
	
	public GamePanel() {
		timer = new Timer(1000/15, this);
		object = new GameObject(50, 60, 70, 80);
	}

	void startGame() {
		timer.start();
	}
	
	void updateMenuState() {
		
	}
	
	void drawMenuState(Graphics g) {
		
	}
	
	void updateIntroState() {
		
	}
	
	void drawIntroState(Graphics g) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// System.out.println("Spacefestival.jar UFOS ON VIDEO HIGH QUALITY NASA VID");
		repaint();
		object.update();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		object.draw(g);
	}
}