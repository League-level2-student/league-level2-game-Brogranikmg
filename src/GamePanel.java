import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	GameObject object;
	BufferedImage stork;
	public enum GameStates {MENU_STATE, INTRO_STATE, FESTIVAL1}
	public enum Minigames {F1GAME1, F2GAME2}
	GameStates currentState = GameStates.MENU_STATE;
	
	public GamePanel() {
		timer = new Timer(1000/15, this);
		object = new GameObject(50, 60, 70, 80);
		try {
			stork = ImageIO.read(this.getClass().getResourceAsStream("STORK.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void startGame() {
		timer.start();
	}
	
	void updateMenuState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.drawImage(stork, 100, 100, 100, 100, null);
	}
	
	void updateIntroState() {
		
	}
	
	void drawIntroState(Graphics g) {
		
	}
	
	void updateFestival1State() {
		
	}
	
	void drawFestival1State() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// System.out.println("Spacefestival.jar UFOS ON VIDEO HIGH QUALITY NASA VID");
		repaint();
		object.update();
		switch (currentState) {
		case MENU_STATE:
			updateMenuState();
			break;
		case INTRO_STATE:
			updateIntroState();
			break;
		default:
			break;
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		object.draw(g);
		drawMenuState(g);
	}
}