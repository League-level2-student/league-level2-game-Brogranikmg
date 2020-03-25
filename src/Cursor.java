import java.awt.Graphics;

public class Cursor extends GameObject {

	public Cursor(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	void update(int x, int y) {
		super.update();
		this.x = x;
		this.y = y;
	}
	
	void draw(Graphics g) {
		
	}
}
