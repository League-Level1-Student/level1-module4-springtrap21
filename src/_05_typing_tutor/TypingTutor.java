package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
JFrame frame;
JPanel panel;
JLabel label;
char currentLetter = generateRandomLetter();
public void setup() {
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.setVisible(true);
	frame.setTitle("Type or Die!");
	frame.add(panel);
	panel.add(label);
	frame.pack();
	
}
char generateRandomLetter() {
	Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}
