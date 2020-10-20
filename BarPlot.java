import java.awt.Color;
import java.awt.Graphics;

public class BarPlot extends DecoratedPlot {
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		
		for (int i = 0; i < values.size(); i++) {
			g.fillRect(i+100, 0, 1, values.get(i));
		
		}
		
		super.draw(g);
	}
}
