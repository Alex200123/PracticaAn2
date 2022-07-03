package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.List_of_games;


public class Interface implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private List_of_games list;
	int count = 0;
	
	public Interface()
	{
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Number_of clicks: " + count);
		
		JButton button = new JButton("test1");
		ActionListener listener = new List_of_games();
		
		
		button.addActionListener(this);
		JButton button1 = new JButton("test2");
		
		button1.addActionListener(new ActionListener()
			{
		
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println(1);
			}
			});
		
		
		
		
		panel.setBorder(BorderFactory.createBevelBorder(1));
		panel.add(button);
		panel.add(button1);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Game Review");
		frame.setSize(1000,1000);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		count ++;
		label.setText("Number_of clicks: " + count);
	}
}
