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
	
	private JButton add_game_to_list;
	private JButton find_a_good_game_based_on_preferance;
	private JButton rate_a_game;
	
	
	public Buttons_class(JFrame main_frame, JFrame the_3_options_frame)
	{
		button_quit_main = new JButton("Exit");
		button_quit_main.setBounds(320, 500, 100, 100);
		Add_button_quit_main_functionality();
		
		
		button_lets_start_main = new JButton("Let's start");
		button_lets_start_main.setBounds(520, 500, 100, 100);
		Add_button_lets_start_main_functionality(main_frame, the_3_options_frame);
		
		
		add_game_to_list = new JButton("Add a game");
		add_game_to_list.setBounds(133, 300, 300, 100);
		
		
		find_a_good_game_based_on_preferance = new JButton("Find me a game");
		find_a_good_game_based_on_preferance.setBounds(333, 100, 300, 100);
		
		
		rate_a_game = new JButton("I am going to rate a game");
		rate_a_game.setBounds(533, 300, 300, 100);
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
	
	private void Add_button_lets_start_main_functionality(JFrame main_frame, JFrame the_3_options_frame)
	{
		button_lets_start_main.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					main_frame.setVisible(false);
					the_3_options_frame.setVisible(true);
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
	
	
	public JButton Get_add_game_to_list()
	{
		return add_game_to_list;
	}
	
	public JButton Get_find_a_good_game_based_on_preferance()
	{
		return find_a_good_game_based_on_preferance;
	}
	
	public JButton Get_rate_a_game()
	{
		return rate_a_game;
	}
}
