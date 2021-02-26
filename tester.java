import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class tester {

  public static void main(final String[] args) {
    JFrame frame = new JFrame("Test");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().setBackground(Color.red);
    frame.setPreferredSize(new Dimension(400, 300));
    frame.pack();
    frame.setVisible(true);
  }

  private tester() {
  }
}
