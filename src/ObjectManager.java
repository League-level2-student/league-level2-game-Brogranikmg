import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	private ArrayList<Button> buttons = new ArrayList<Button>();
	
	public ObjectManager() {
		
	}
	
	void addButton(Button button) {
		buttons.add(button);
	}
	
	void manageButtons() {
		
	}
	
	public void updateHover(Cursor cursor) {
		for (Button button : buttons) {
			button.hover = button.collisionBox.intersects(cursor.collisionBox);
			button.clicked = button.hover && cursor.clicked;
		}
	}
	
	void update() {
		
	}
	
	void drawAll(Graphics g) {
		for (Button button : buttons) {
			button.draw(g);
		}
	}
	void drawButton(Graphics g, GamePanel.Buttons id) {
		for (Button button : buttons) {
			if (id.equals(button.id)) {
				button.draw(g);
				return;
			}
		}
	}

	public boolean isClicked(GamePanel.Buttons id) {
		for (Button button : buttons) {
			if (id.equals(button.id) && button.clicked) {
				return true;
			}
		}
		return false;
	}
}
