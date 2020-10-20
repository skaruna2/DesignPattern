import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class World extends JFrame implements ActionListener{
	
	Button b = new Button("Run");
	Source source = new Source();
	
	public World() {
		//PlotPanel  P1 ;
//		PlotPanel  P2 ;
//		PlotPanel  P3 ;
//		SimplePlot simplePlot;
//		MarkedPlot markedPlot;
//		BarPlot barPlot;
		
		SimplePlot  simplePlot = new SimplePlot();
		MarkedPlot markedPlot = new MarkedPlot();
		BarPlot barPlot = new BarPlot();
		 
		markedPlot.add(simplePlot);
		barPlot.add(markedPlot);
		
		
		PlotPanel  P1 = new PlotPanel(simplePlot);
		PlotPanel  P2  = new PlotPanel(markedPlot);
		PlotPanel  P3  = new PlotPanel(barPlot);
		
		b.setBounds(80,30,40,40);
		
		b.addActionListener(this);
		
		
		source.addObserver(P1);
		source.addObserver(P2);
		source.addObserver(P3);
		
		setLayout(new GridLayout(1,1));
		add(P3);
		setLayout(new GridLayout(2,1));
		add(P2);
		setLayout(new GridLayout(3,1));
		add(P1);
		setLayout(new GridLayout(4,1));
		add(b);
	}
	public static void main(String[] args) {
		World world = new World();
		
		world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		world.setSize(500,500);
		world.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
				
		if(e.getSource() == b) {
			
			source.create();
			
		}
	}
}
