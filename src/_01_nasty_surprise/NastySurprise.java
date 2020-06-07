package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
public void run() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	trick.addActionListener(this);
	treat.addActionListener(this);
	trick.setText("Trick");
	treat.setText("Treat");
	panel.add(trick);
	panel.add(treat);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	
	if(buttonPressed==trick) {
		showPictureFromTheInternet("https://cdn.iflscience.com/images/4748c3fa-92dc-59d4-b1b2-f16d63a1ddf6/extra_large-1464355116-624-desert-rain-frog-dangerous-beast-or-adorable-squeaky-toy.jpg");
	}
	
	if(buttonPressed==treat) {
		showPictureFromTheInternet("https://i.pinimg.com/474x/23/2a/b2/232ab23e7598d3ef62c7e61abf7598f9.jpg");
	}
	}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}


