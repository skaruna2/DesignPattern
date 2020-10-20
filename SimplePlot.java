import java.awt.Color;
import java.awt.Graphics;

public class SimplePlot extends Drawable {
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		for (int i = 0; i < values.size(); i++) {
			if(i != values.size()-1)
				g.drawLine(i+100, values.get(i), i+100, values.get(i+1));
			}
		
		
		
	}
}
