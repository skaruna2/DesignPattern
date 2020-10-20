import java.awt.Color;
import java.awt.Graphics;

public class MarkedPlot extends DecoratedPlot {
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		//System.out.print("Marke");
		//System.out.print("Hello"+values.size() + "hello");
		for (int i = 0; i < values.size(); i++) {
			//g.drawRect();
			g.fillRect(i+100, values.get(i), 5, 5);
			
		}
		
		
		
		super.draw(g);
	}
}
