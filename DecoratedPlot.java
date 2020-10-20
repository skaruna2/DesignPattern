import java.awt.Graphics;

public abstract class DecoratedPlot extends Drawable {
	Drawable drawable;
	
	
	public void add(Drawable d) {
		drawable =d;
	}

	
	public void setValue(int value) {
		
		drawable.setValue(value);
	}

	
	public void draw(Graphics g) {
		drawable.draw(g);
	}
}
