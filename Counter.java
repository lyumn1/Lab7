//package Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter implements ActionListener{
	
	private JLabel leftLabel = new JLabel();
	private JLabel rightLabel = new JLabel();
	private int leftCount;
	private int rightCount;
	private JButton left;
	private JButton right;
	private JButton reset;
	
	public Counter() {
		JFrame frame = new JFrame("Lets Count");
		frame.setLayout(new FlowLayout());
		frame.setBounds(100, 100, 180, 140);
		this.left = new JButton("Left");
		this.right = new JButton("Right");
		this.leftCount = 0;
		this.rightCount = 0;
		this.left.addActionListener(this);
		this.right.addActionListener(this);
		frame.add(this.left);
		frame.add(this.right);
		this.leftLabel.setText("Count: "+this.leftCount);
		this.rightLabel.setText("Count: "+this.rightCount);
		frame.add(this.leftLabel);
		frame.add(this.rightLabel);
		this.reset = new JButton("Reset");
		this.reset.addActionListener(this);
		frame.add(this.reset);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(left)) {
			this.leftCount++;
			this.leftLabel.setText("Count: "+this.leftCount);
		}else if(e.getSource().equals(right)) {
			this.rightCount++;
			this.rightLabel.setText("Count: "+this.rightCount);
		}else if(e.getSource().equals(reset)) {
			this.leftCount=0;
			this.rightCount=0;
			this.leftLabel.setText("Count: "+this.leftCount);
			this.rightLabel.setText("Count: "+this.rightCount);
		}
	}

}
