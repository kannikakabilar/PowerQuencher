import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class Window extends JFrame{
	public static void main (String[] args) {
		JPanel pnl = new JPanel();
		JFrame f = new JFrame();
		//JSlider sld = new JSlider(1, 10, 5);
		//JLabel lbl = JLabel();
		//lbl.setText("Slider");
		//ImageIcon tick = new ImageIcon("Cross.png");
		/*sld.setPaintTrack(true);
		sld.setPaintTicks(true);
		sld.setPaintLabels(true);
		*/
		JButton tickBtn = new JButton("Click Me");
		pnl.add(tickBtn);
		
		//pnl.add(lbl);
		f.add(pnl);
		f.setSize(500, 200);
		f.show();
		Window gui = new Window(pnl); 
	}
	public Window(JPanel pnl) {
		super("Kan Window");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JSlider sld = new JSlider(1, 10, 5);
		sld.setPaintTrack(true);
		sld.setPaintTicks(true);
		sld.setPaintLabels(true);
		add(pnl);
		pnl.add(sld);
		
		setVisible(true);
	}
}
