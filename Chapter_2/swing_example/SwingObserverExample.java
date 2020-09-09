import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
	SwingObserverExample example = new SwingObserverExample();
	example.go();
    }

    public void go() {
	frame = new JFrame();
	JButton button = new JButton("Should I do it?");
	button.addActionListener(new AngelListener());
	button.addActionListener(new DevilListener());
	button.setBounds(0,0,300,40);
	frame.getContentPane().add(BorderLayout.CENTER, button);
	frame.setSize(400,500);
	frame.setLayout(null);
	frame.setVisible(true);
    }

    class AngelListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
	    System.out.println("Don't do it, you might regret it!");
	}
    }

    class DevilListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
	    System.out.println("Come on, do it!");
	}
    }
}

	
      
