package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField text = new JTextField(5);
JButton button = new JButton();
JLabel label = new JLabel();


public void run() {
	frame.add(panel);
	panel.add(text);
	panel.add(button);
	button.setText("Translate");
	panel.add(label);
	frame.pack();
	frame.setVisible(true);
}
