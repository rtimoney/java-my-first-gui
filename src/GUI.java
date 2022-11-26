import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	int count =0;
	JLabel label;
	JFrame frame;
	JButton button;
	JPanel panel;
	
	
	

		public GUI() {
			
			// Frame 
			frame = new JFrame();
			
			// Button
			button = new JButton("Click Me");
			button.addActionListener(this);
			
			//Label
			
			label = new JLabel("Number of clicks: ");
			
			
			
			
		
			// Panel 
			panel = new JPanel();
			
			panel.setBorder(BorderFactory.createEmptyBorder(60,60,20,60));
			panel.setLayout(new GridLayout(0,1));
			panel.add(button);
			panel.add(label);
			
			// frame 
			frame.add(panel,BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("MY FIRST GUI");
			frame.pack();
			frame.setVisible(true);
			
			
			
			
			
			
		}
	
	public static void main(String[] args) {
		// making my first GUI
		
		new GUI();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of Clicks "+count);
		
	}

}
