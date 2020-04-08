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
	// GameObject object;
	ObjectManager manager;
	BufferedImage bg;
	// BufferedImage stork;
	public enum GameStates {MENU_STATE, INTRO_STATE, FESTIVAL1}
	public enum Minigames {F1GAME1, F2GAME2}
	public enum Buttons {START, OPTIONS, EXIT}
	GameStates currentState = GameStates.MENU_STATE;
	Cursor cursed;
	private boolean clicked;

	public GamePanel() {
		timer = new Timer(1000/60, this);
		// object = new GameObject(50, 60, 70, 80);
		manager = new ObjectManager();
		manager.addButton(new Button(Buttons.START, 67, 185, 193, 49, "start.png", "startPressed.png"));
		manager.addButton(new Button(Buttons.OPTIONS, 67, 252, 193, 49, "options.png", "optionsPressed.png"));
		manager.addButton(new Button(Buttons.EXIT, 67, 319, 193, 49, "exit.png", "exitPressed.png"));
		cursed = new Cursor(0, 0, 10, 10);
		addMouseListener(this);
		try {
			bg = ImageIO.read(this.getClass().getResourceAsStream("SFMenu.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void startGame() {
		timer.start();
	}
	
	void updateMenuState() {
		if (manager.isClicked(Buttons.START)) {
			currentState = GameStates.INTRO_STATE;
		}
	}
	
	void drawMenuState(Graphics g) {
		g.drawImage(bg, 0, 0, 600, 400, null);
		manager.drawButton(g, Buttons.START);
		manager.drawButton(g, Buttons.OPTIONS);
		manager.drawButton(g, Buttons.EXIT);
	}
	
	void updateIntroState() {
		
	}
	
	void drawIntroState(Graphics g) {
		g.drawImage(bg, 0, 0, 600, 400, null);
	}
	
	void updateFestival1State() {
		
	}
	
	void drawFestival1State() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// System.out.println("Spacefestival.jar UFOS ON VIDEO HIGH QUALITY NASA VID");
		repaint();
		// object.update();
		cursed.update(
				(int) MouseInfo.getPointerInfo().getLocation().getX() - 10,
				(int) MouseInfo.getPointerInfo().getLocation().getY() - 30,
				clicked
				);
		manager.updateHover(cursed);
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
		clicked = false;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// object.draw(g);
		cursed.draw(g);
		switch (currentState) {
		case MENU_STATE:
			drawMenuState(g);
			break;
		case INTRO_STATE:
			drawIntroState(g);
		default:
			break;
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		clicked = true;
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