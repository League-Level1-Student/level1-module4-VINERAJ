package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckleclicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
public void makeButtons(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	joke.addActionListener(this);
	punchline.addActionListener(this);
	panel.add(joke);
	joke.setText("Joke");
	panel.add(punchline);
	punchline.setText("Punchline");
	frame.setVisible(true);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == joke) {
		JOptionPane.showMessageDialog(null, "What's the best thing about Switzerland?");
	}
	
	if(buttonPressed == punchline) {
		JOptionPane.showMessageDialog(null, "I don't know, but the flag is a big plus.");
	}
}
}


