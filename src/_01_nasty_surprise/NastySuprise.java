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

	public class NastySuprise implements ActionListener {
JButton lb = new JButton();
JButton rb = new JButton();
JPanel p = new JPanel();
JFrame f = new JFrame();


	public void run() {
	lb.setText("Trick");
	rb.setText("Treat");
	f.add(p);
	p.add(lb);
	p.add(rb);
	lb.addActionListener(this);
	rb.addActionListener(this);
	f.setVisible(true);
	f.pack();
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == lb) {
			showPictureFromTheInternet("www.google.com/imgres?imgurl=https%3A%2F%2Flive.staticflickr.com%2F4112%2F5170590074_714d36db83_b.jpg&imgrefurl=https%3A%2F%2Fwww.flickr.com%2Fphotos%2F27587002%40N07%2F5170590074&tbnid=31OhNhKk7CiB6M&vet=12ahUKEwjT562-o9roAhWJAjQIHaUhDqcQMygOegUIARC4Ag..i&docid=c0KI6K67s0XnVM&w=1023&h=812&q=puppy&safe=strict&ved=2ahUKEwjT562-o9roAhWJAjQIHaUhDqcQMygOegUIARC4Ag");	
			}
		if (arg0.getSource() == rb) {
			
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