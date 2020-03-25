import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Button extends GameObject {
	BufferedImage img;
	BufferedImage img2;
	String imglink;
	String imghover;
	boolean hover;
	
	public Button(int x, int y, int width, int height, String imglink, String imghover) {
		super(x, y, width, height);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream(imglink));
			img2 = ImageIO.read(this.getClass().getResourceAsStream(imghover));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void update() {
		
	}
	
	void draw(Graphics g) {
		if (hover) {
			g.drawImage(img2, x, y, width, height, null);
		} else {
			g.drawImage(img, x, y, width, height, null);
		}
	}
}
