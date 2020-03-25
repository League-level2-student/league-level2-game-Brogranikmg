import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;

import javax.imageio.ImageIO;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, MouseListener {
	Timer timer;
	GameObject object;
	BufferedImage stork;
	public enum GameStates {MENU_STATE, INTRO_STATE, FESTIVAL1}
	public enum Minigames {F1GAME1, F2GAME2}
	GameStates currentState = GameStates.MENU_STATE;
	Button buttontopress;
	Cursor cursed;
	
	public GamePanel() {
		timer = new Timer(1000/15, this);
		object = new GameObject(50, 60, 70, 80);
		buttontopress = new Button(40, 40, 500, 100, "STORK.jpg", "HORSE.jpg");
		cursed = new Cursor(0, 0, 10, 10);
	}

	void startGame() {
		timer.start();
	}
	
	void updateMenuState() {
	}
	
	void drawMenuState(Graphics g) {
		buttontopress.draw(g);
		cursed.draw(g);
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
		cursed.update((int) MouseInfo.getPointerInfo().getLocation().getX() - 10, (int) MouseInfo.getPointerInfo().getLocation().getY() - 30);
		buttontopress.hover = buttontopress.collisionBox.intersects(cursed.collisionBox);
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
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}