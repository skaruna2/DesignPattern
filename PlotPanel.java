import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PlotPanel extends JPanel implements Observer {
	Drawable drawable;
	public PlotPanel(Drawable drawable) {
		this.drawable = drawable;
		//System.out.print(this.drawable.values);
		//System.out.print(this.drawable.values.size());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		//System.out.print("In update");
		drawable.setValue(((Source)o).getValue());
		
		repaint();


	}
	
	public void paintComponent(Graphics g) {
		
			drawable.draw(g);
			
		
	}
}
