import java.awt.Graphics;

public class Cursor extends GameObject {

	public boolean clicked;

	public Cursor(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	void update(int x, int y, boolean clicked) {
		super.update();
		this.x = x;
		this.y = y;
		this.clicked = clicked;
	}
	
	void draw(Graphics g) {
		
	}
}
