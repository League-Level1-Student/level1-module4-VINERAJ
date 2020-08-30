package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField text = new JTextField(5);
JButton button = new JButton();
JLabel label = new JLabel();
PigLatinTranslator translator = new PigLatinTranslator();


public void run() {
	frame.add(panel);
	panel.add(text);
	panel.add(button);
	button.setText("Translate");
	button.addActionListener(this);
	panel.add(label);
	frame.pack();
	frame.setVisible(true);
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String theText = text.getText();
	String word = translator.translate(theText);
	label.setText(word);
}
}