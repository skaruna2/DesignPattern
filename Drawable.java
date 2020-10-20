import java.awt.Graphics;
import java.util.LinkedList;

public abstract class Drawable {
	protected static LinkedList<Integer> values = new LinkedList<Integer>();
	//private int v;

	public void setValue(int v) {
		values.add(v);
		
		
	}

	public void draw(Graphics g) {
	}
}
