import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	
	public GamePanel() {
		timer = new Timer(1000/15, this);
	}

	void startGame() {
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Spacefestival.jar UFOS ON VIDEO HIGH QUALITY NASA VID");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.fillRect(50, 60, 70, 80);
	}
}