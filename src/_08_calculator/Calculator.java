package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	
public void run() {
	frame.add(panel);
	panel.add(text);
	panel.add(text2);
	panel.add(add);
	add.setText("Add");
	add.addActionListener(this);
	panel.add(subtract);
	subtract.setText("Subtract");
	subtract.addActionListener(this);
	panel.add(multiply);
	multiply.setText("Multiply");
	multiply.addActionListener(this);
	panel.add(divide); 
	divide.setText("Divide");
	divide.addActionListener(this);
	frame.setVisible(true);
}
	
public int add(int var1, int var2) {
	int ans = var1+var2;
	return ans;
}

public int subtract(int var1, int var2) {
	int ans = var1-var2;
	return ans;
}

public int multiply(int var1, int var2) {
	int ans = var1*var2;
	return ans;
}

public int divide(int var1, int var2) {
	int ans = var1/var2;
	return ans;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String var1 = text.getText();
	String var2 = text2.getText();
	int varia1 = Integer.parseInt(var1);
	int varia2 = Integer.parseInt(var2);
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == add) {
		JOptionPane.showMessageDialog(null, add(varia1, varia2));
	}
	if(buttonPressed == subtract) {
		JOptionPane.showMessageDialog(null, subtract(varia1, varia2));
	}
	if(buttonPressed == multiply) {
		JOptionPane.showMessageDialog(null, multiply(varia1, varia2));
	}
	if(buttonPressed == divide) {
		JOptionPane.showMessageDialog(null, divide(varia1, varia2));
	}
}
}