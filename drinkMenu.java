import javax.swing.event.*;

import java.util.concurrent.ThreadLocalRandom; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.Border;


public class drinkMenu implements ChangeListener, ActionListener, ItemListener {
	
	static JFrame f; 
	
	static JMenu menu;
	static JMenuItem m1, m2, m3;
	
	static JTextArea txt = new JTextArea();
	static JTextArea totalTxt = new JTextArea();
	
	static JButton purchase = new JButton("Buy Ordered Drinks");
	static JButton adder = new JButton("Add Drink");
	static JButton clear = new JButton("Reset Order");
	
	static JComboBox fruits;
	static JMenuItem f1, f2, f3;
	static JRadioButton r1, r2, r3;
	static ButtonGroup group = new ButtonGroup();
	
	static JComboBox milkshake;
	static JComboBox sodas;
	
	static float total = 0;
	static String recp = "";
	
	static JTextArea fruitsTxt = new JTextArea();
	static JTextArea milkTxt = new JTextArea();
	static JTextArea sodaTxt = new JTextArea();
	
	static JSlider slider = new JSlider(JSlider.VERTICAL, 0, 20, 0);
	static JCheckBox cb = new JCheckBox("Ice");
	static JTextArea iceText = new JTextArea();
	
	public static void main(String[] args) 
    { 
		f = new JFrame("Power Quencher - Virtual Drink Menu"); 
		
		drinkMenu kan = new drinkMenu();
		
		JPanel pnl = new JPanel();
		
		slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setOpaque(false);
        slider.setEnabled(false);
        slider.addChangeListener(kan);
        
        slider.setBounds(1030, 70, 40, 530);
        cb.setOpaque(false);
        cb.setFont(new Font("Algerian", Font.PLAIN, 24));
        cb.setBounds(940, 70, 70, 40);
        cb.addActionListener(kan);
        pnl.add(cb);
        iceText.setText("Select the level \n       of Ice \n       in your Drink!");
        iceText.setOpaque(false);
        iceText.setBounds(916, 150, 105, 60);
        pnl.add(iceText);
		
		Border border2 = BorderFactory.createEtchedBorder(4, Color.BLUE, Color.BLUE);
		Color clr2 = new Color(0, 88, 230);
		purchase.setForeground(clr2);
		purchase.setBorder(border2);
		Color clr3 = new Color(245, 2, 11);
		Border border3 = BorderFactory.createEtchedBorder(4, clr3, clr3);
		clear.setForeground(clr3);
		clear.setBorder(border3);
		Color clr4 = new Color(43, 245, 2);
		Border border4 = BorderFactory.createEtchedBorder(4, Color.GREEN, Color.GREEN);
		adder.setBorder(border4);
		adder.setForeground(clr4);
		
		
		
		JLabel title = new JLabel("Power Quencher");
		Font fnt = new Font("Serif", Font.PLAIN, 54);
		//Box box = Box.createVerticalBox();
		title.setFont(fnt);
		Color clr = new Color(0, 6, 71);
		title.setForeground(clr);
		//box.add(title);
		//pnl.add(box);
		
		JMenuBar lng = new JMenuBar();
		menu = new JMenu("English");
        m1 = new JMenuItem("English");
        m1.setEnabled(false);
        m2 = new JMenuItem("Français");
        m3 = new JMenuItem("Español");
        
        fruits = new JComboBox();
        fruits.addItem("Fine Pearl Clear Apple Juice");
        fruits.addItem("Kyoho Mountain Grape Extract");
        fruits.addItem("Viscous Pulpy Orange Juice");
        fruits.addItem("Pineapple & Mango Cocktail Mix");
        fruits.addItem("Tropical Spinach Smoothie");
        fruits.addItem("Carrot & Tomato Health Drink");
        fruits.setSelectedItem(null);
        
        //fruits.add
        
        milkshake = new JComboBox();
        milkshake.addItem("Hot Milk");
        milkshake.addItem("Green Tea");
        milkshake.addItem("Hot Chocolate w/ Marshmellos");
        milkshake.addItem("Cappucino");
        milkshake.addItem("Iced Latte");
        milkshake.addItem("Black Coffee");
        milkshake.addItem("Chocolate Shake");
        milkshake.addItem("Sundae Strawberry Special");
        milkshake.setSelectedItem(null);
        
        sodas = new JComboBox();
        sodas.addItem("CocoCola");
        sodas.addItem("Crush Orange");
        sodas.addItem("Sprite");
        sodas.addItem("Pepsi");
        sodas.setSelectedItem(null);
        
        Font f3 = new Font("Serif", Font.BOLD, 24);
        r1 = new JRadioButton("Fruity Drinks");
        r1.setFont(new Font("Algerian", Font.PLAIN, 24));
        r1.setOpaque(false);
        r2 = new JRadioButton("Hot/Creamy Drinks");
        r2.setFont(new Font("Algerian", Font.PLAIN, 24));
        r2.setOpaque(false);
        r2.addChangeListener(kan);
        r3 = new JRadioButton("Soda Drinks");
        r3.setFont(new Font("Algerian", Font.PLAIN, 24));
        r3.setOpaque(false);
        group.add(r1);
        group.add(r2);
        group.add(r3);
        r1.setBounds(10, 75, 200, 40);
        r2.setBounds(10, 280, 270, 40);
        r3.setBounds(630, 290, 200, 40);
        
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        lng.add(menu);
        
        m1.addActionListener(kan);
        m2.addActionListener(kan);
        m3.addActionListener(kan);
        
        JLabel lbl = new JLabel("");
        Image img = new ImageIcon(kan.getClass().getResource("/fruityDrink.jpg")).getImage();
        lbl.setIcon(new ImageIcon(img));
        Color c = new Color(0, 0, 0);
        Border border = BorderFactory.createEtchedBorder(4, Color.darkGray, Color.BLACK);
        //border.
        lbl.setBorder(border);
        lbl.setBounds(300, 90, 600, 190);
        
        JLabel lbl2 = new JLabel("");
        Image img2 = new ImageIcon(kan.getClass().getResource("/sundaes.jpg")).getImage();
        lbl2.setIcon(new ImageIcon(img2));
        lbl2.setBorder(border);
        lbl2.setBounds(290, 310, 300, 220);
        
        JLabel lbl3 = new JLabel("");
        Image img3 = new ImageIcon(kan.getClass().getResource("/sodaDrink.jpg")).getImage();
        lbl3.setIcon(new ImageIcon(img3));
        lbl3.setBorder(border);
        lbl3.setBounds(840, 310, 143, 220);
        
        
        JLabel lbl4 = new JLabel("");
        Image img4 = new ImageIcon(kan.getClass().getResource("/blurBlue.jpg")).getImage();
        lbl4.setIcon(new ImageIcon(img4));
        txt.setBorder(border);
        lbl4.setBounds(0, 0, 1400, 700);
        
        fruitsTxt.setBounds(15, 200, 240, 50);
        fruitsTxt.setEditable(false);
        //fruitsTxt.setBorder(border);
        fruitsTxt.setText("Choose a Healty Fruity Drink!");
        Font f2 = new Font("Verdana", Font.ITALIC, 14);
        fruitsTxt.setFont(f2);
        //fruitsTxt.background = false;
        fruitsTxt.setOpaque(false);
        //fruitsTxt.setBackground(new Color(181, 227, 255));
        fruits.addItemListener(kan);
        
        milkTxt.setBounds(10, 420, 240, 50);
        milkTxt.setFont(f2);
        milkTxt.setEditable(false);
        milkTxt.setOpaque(false);
        //milkTxt.setBackground(new Color(181, 227, 255));
        milkshake.addItemListener(kan);
        
        sodaTxt.setBounds(630, 420, 200, 50);
        sodaTxt.setFont(f2);
        sodaTxt.setEditable(false);
        sodaTxt.setOpaque(false);
        //sodaTxt.setBackground(new Color(181, 227, 255));
        sodas.addItemListener(kan);
        
        txt.setEditable(false);
        txt.setText("                      Power Quencher\n         Stay Hydrated with the Drink of\n                         Your Choice!\n                  ~~~~~~~~~~~~~~~~\nHere's the Receipt for \n                   your Ordered Drinks - Enjoy!\n");
        txt.setText(txt.getText()+"----------------------------------------------------------\n");
        recp += txt.getText();
        //txt.setOpaque(false);
        //txt.setBounds(100, 10, 10, 10);
        pnl.setLayout(null);
        Dimension s1 = txt.getPreferredSize();
        txt.setBounds(1100, 70, 220, 400);
        totalTxt.setBounds(1100, 470, 220, 50);
        totalTxt.setBorder(border);
        
        totalTxt.setText("\n             Your Total:     $"+Float.toString(total));
        totalTxt.setFont(new Font("Verdana", Font.BOLD, 12));
        JScrollPane scroll = new JScrollPane(txt);
        JScrollBar bar = new JScrollBar(); 
        bar.setEnabled(true);
        scroll.add(bar);
        //scroll.add
        scroll.setBounds(1320, 70, 19, 400);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setWheelScrollingEnabled(true);
        scroll.setEnabled(true);
        
        Dimension ttl = title.getPreferredSize();
        title.setBounds(470, 1, 400, 70);
        
        Dimension prchbtn = purchase.getPreferredSize();
        purchase.setBounds(1095, 550, 230, 50);
        
        Dimension veg = fruits.getPreferredSize();
        fruits.setBounds(25, 130, 230, 30);
        fruits.setFont(new Font("Verdana", Font.PLAIN, 14));
        
        Dimension calci = milkshake.getPreferredSize();
        milkshake.setBounds(10, 350, 230, 30);
        milkshake.setFont(new Font("Verdana", Font.PLAIN, 14));
        
        //Dimension coke = sodas.getPreferredSize();
        sodas.setBounds(630, 350, 200, 30);
        sodas.setFont(new Font("Verdana", Font.PLAIN, 14));
        //Dimension addbtn = adder.getPreferredSize();
        adder.setBounds(140, 570, 220, 50);
        adder.setFont(f3);
        
        //Dimension clrbtn = clear.getPreferredSize();
        clear.setBounds(660, 570, 220, 50);
        clear.setFont(f3);
        
        adder.addActionListener(kan);
        clear.addActionListener(kan);
        purchase.addActionListener(kan);
        purchase.setFont(f3);
        
        milkTxt.setText("Choose a Hot \n                   Vitalizing Beverage!");
        sodaTxt.setText("Choose a Refreshing \n             Carbonated Drink!");
        
        pnl.add(purchase);
        pnl.add(adder);
        pnl.add(clear);
        pnl.add(lng);
        pnl.add(title);
        pnl.add(txt);
        pnl.add(totalTxt);
        pnl.add(scroll);
        pnl.add(bar);
        pnl.add(fruits);
        pnl.add(milkshake);
        pnl.add(sodas);
        pnl.add(lbl);
        pnl.add(lbl2);
        pnl.add(lbl3);
        pnl.add(slider);
        pnl.add(r1);
        pnl.add(r2);
        pnl.add(r3);
        pnl.add(fruitsTxt);
        pnl.add(milkTxt);
        pnl.add(sodaTxt);
        pnl.add(lbl4);
        //kan.setMaximizedBounds(pnl.getMaximumWindowBounds());
        //kan.setExtendedState(kan.getExtendedState() | kan.MAXIMIZED_BOTH);
        //pnl.revalidate();
        //pnl.repaint();
        //f.add(scroll);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setJMenuBar(lng);
        //Container c = f.getContentPane();
		pnl.setBackground(Color.WHITE);
		f.add(pnl);
		//f.setSize(900, 600);
		f.setLocationRelativeTo(null);
		f.setExtendedState(f.MAXIMIZED_BOTH);
		//fruitsTxt.setText(Integer.toString(f.MAXIMIZED_BOTH));
		f.setVisible(true);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		if(s.equals("Français")) {
    		m2.setEnabled(false);
    		m1.setEnabled(true);
    		m3.setEnabled(true);
    		menu.setText(s);
    	}
		if(s.equals("English")) {
    		m1.setEnabled(false);
    		m2.setEnabled(true);
    		m3.setEnabled(true);
    		menu.setText(s);
    	}
		if(s.equals("Español")) {
    		m3.setEnabled(false);
    		m1.setEnabled(true);
    		m2.setEnabled(true);
    		menu.setText(s);
    	}
		if(s.equals("Add Drink") && r1.isSelected()) {
			total+=3.99;
			txt.setText(txt.getText()+(String)fruits.getSelectedItem()+" - $3.99\n");
			if(cb.isSelected()) {
				txt.setText(txt.getText()+"\tw/ "+slider.getValue()+"mL of ice\n");
			}
			totalTxt.setText("\n             Your Total:     $"+Float.toString(total));
	        //totalTxt.setFont(new Font("Verdana", Font.BOLD, 12));
		}
		if(s.equals("Add Drink") && r2.isSelected()) {
			total+=2.99;
			String item = (String)milkshake.getSelectedItem();
			txt.setText(txt.getText()+(String)milkshake.getSelectedItem()+" - $2.99\n");
			totalTxt.setText("\n             Your Total:     $"+Float.toString(total));
			
			if(cb.isSelected() && !(item.equals("Hot Milk") || item.equals("Green Tea") || item.equals("Hot Chocolate w/ Marshmellos") || item.equals("Black Coffee") || item.equals("Cappucino"))) {
				txt.setText(txt.getText()+"\tw/ "+slider.getValue()+"mL of ice\n");
			}
		}
		if(s.equals("Add Drink") && r3.isSelected()) {
			total+=1.99;
			txt.setText(txt.getText()+(String)sodas.getSelectedItem()+" - $1.99\n");
			totalTxt.setText("\n             Your Total:     $"+Float.toString(total));
			if(cb.isSelected()) {
				txt.setText(txt.getText()+"\tw/ "+slider.getValue()+"mL of ice\n");
			}
		}
		if(s.equals("Reset Order")) {
			total = 0;
			txt.setText(recp);
			totalTxt.setText("\n             Your Total:     $"+Float.toString(total));
		}
		if(s.equals("Buy Ordered Drinks")) {
			JFrame f2 = new JFrame();
			f2.setVisible(true);
			f2.setSize(400, 400);
			f2.setLocationRelativeTo(null);
		}
		/*
		String item = (String)milkshake.getSelectedItem();
		if(s.equals("Hot/Creamy Drinks") && (item.equals("Hot Milk") || item.equals("Green Tea") || item.equals("Hot Chocolate w/ Marshmellos") || item.equals("Black Coffee") || item.equals("Cappucino"))) {
			cb.setEnabled(false);
			slider.setEnabled(false);
		}
		*/
		if(s.equals("Ice")) {
			if(cb.isSelected()) {
				slider.setEnabled(true);
			}else {
				slider.setEnabled(false);
			}
		}
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent c) {
		// TODO Auto-generated method stub
		String x = "Ice level: " + slider.getValue() + "mL";
		if(slider.getValue()==20) {
			x += "\nExtremely Icy";
		}else if(slider.getValue()>=15) {
			x += "\n Freezy";
		}else if(slider.getValue()>=10) {
			x += "\nHalf-Ice Filled";
		}else if(slider.getValue()>=5) {
			x += "\nFew Sparkly Cubes";
		}else if(slider.getValue()>=0) {
			x += "\nKeepin' it Cool";
		}
		iceText.setText(x);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent event) {
	   
	   if (event.getStateChange() == ItemEvent.SELECTED && r1.isSelected()) {
	      cb.setEnabled(true);
	      //System.out.println(item);
	      //fruitsTxt.setBounds(15, 140, 200, 50);
	          //fruitsTxt.setOpaque(true);
	      fruitsTxt.setText((String)fruits.getSelectedItem()+"\n $3.99");
	   }
	   if (event.getStateChange() == ItemEvent.SELECTED && r2.isSelected()) {
		      String item = (String)milkshake.getSelectedItem();
		      cb.setEnabled(true);
		      //System.out.println(item);
		      //fruitsTxt.setBounds(15, 140, 200, 50);
		          //fruitsTxt.setOpaque(true);
		   if(item.equals("Hot Milk") || item.equals("Green Tea") || item.equals("Hot Chocolate w/ Marshmellos") || item.equals("Black Coffee") || item.equals("Cappucino")) {
			   cb.setSelected(false);
			   cb.setEnabled(false);
			   slider.setEnabled(false);
		   }
		      milkTxt.setText((String)milkshake.getSelectedItem()+"\n $2.99");
	   }
	   if (event.getStateChange() == ItemEvent.SELECTED && r3.isSelected()) {
		      cb.setEnabled(true);
		      //System.out.println(item);
		      //fruitsTxt.setBounds(15, 140, 200, 50);
		          //fruitsTxt.setOpaque(true);
		      sodaTxt.setText((String)sodas.getSelectedItem()+"\n $1.99");
	   }
	}       

}

