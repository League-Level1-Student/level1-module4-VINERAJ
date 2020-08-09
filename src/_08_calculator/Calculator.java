package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
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
	panel.add(subtract);
	subtract.setText("Subtract");
	panel.add(multiply);
	multiply.setText("Multiply");
	panel.add(divide); 
	divide.setText("Divide");
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
}