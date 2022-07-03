package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons_class
{

	private JButton button_quit_main;
	private JButton button_lets_start_main;
	
	
	
	public Buttons_class()
	{
		button_quit_main = new JButton("Exit");
		button_quit_main.setBounds(320, 500, 100, 100);
		Add_button_quit_main_functionality();
		
		
		button_lets_start_main = new JButton("Let's start");
		
		
	}
	
	private void Add_button_quit_main_functionality()
	{
			button_quit_main.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					System.exit(0);
				}
			});
	}
	
	private void Add_button_lets_start_main_functionality()
	{
			button_quit_main.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					
				}
			});
	}
	
	public JButton Get_button_quit_main()
	{
		return button_quit_main;
	}
	
	public JButton Get_button_lets_start_main()
	{
		return button_lets_start_main;
	}
	
}
