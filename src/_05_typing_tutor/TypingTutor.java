package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JLabel Label = new JLabel();
	JFrame frame = new JFrame();
public void run() {
	frame.setTitle("Type or D I E");
	frame.setVisible(true);
	currentLetter = generateRandomLetter();
	frame.add(Label);
	frame.addKeyListener(this);
	String letterString = Character.toString(currentLetter);
	Label.setText(letterString);
	Label.setFont(Label.getFont().deriveFont(200.0f));
	Label.setHorizontalAlignment(JLabel.CENTER);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	Label.setSize(200, 200);
//	frame.pack();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	char typedChar = e.getKeyChar();
	System.out.println(e.getKeyChar());
	if(typedChar == currentLetter) {
		System.out.println("correct");
		frame.setBackground(Color.GREEN);
	}
	else {
		frame.setBackground(Color.RED);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	String letterString = Character.toString(currentLetter);
	Label.setText(letterString);
	Label.setFont(Label.getFont().deriveFont(200.0f));
	Label.setHorizontalAlignment(JLabel.CENTER);
}
}
