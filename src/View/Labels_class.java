package View;

import java.awt.Font;

import javax.swing.JLabel;

public class Labels_class 
{
	private JLabel main_label1;
	private JLabel main_label2;
	private JLabel main_label3;
	private JLabel list_of_games_name_label;
	private JLabel list_of_games_description_label;
	private JLabel list_of_games_score_label;
	
	
	Labels_class()
	{
		main_label1 = new JLabel("Find the best games that fit your preference");
		main_label1.setBounds(300, 100, 400, 25);
		main_label1.setFont(new Font("Serif", Font. BOLD, 20));
		main_label2 = new JLabel("Rate existing games");
		main_label2.setBounds(300, 125, 400, 25);
		main_label2.setFont(new Font("Serif", Font. BOLD, 20));
		main_label3 = new JLabel("Add games that we don't have here");
		main_label3.setBounds(300, 150, 400, 25);
		main_label3.setFont(new Font("Serif", Font. BOLD, 20));
	}
	
	
	public JLabel Get_main_label1()
	{
		return main_label1;
	}
	
	public JLabel Get_main_label2()
	{
		return main_label2;
	}
	
	public JLabel Get_main_label3()
	{
		return main_label3;
	}


	public JLabel Get_list_of_games_name_label() 
	{
		return list_of_games_name_label;
	}


	public void Set_list_of_games_name_label(JLabel list_of_games_name_label) 
	{
		this.list_of_games_name_label = list_of_games_name_label;
	}


	public JLabel Get_list_of_games_description_label() 
	{
		return list_of_games_description_label;
	}


	public void Set_list_of_games_description_label(JLabel list_of_games_description_label)
	{
		this.list_of_games_description_label = list_of_games_description_label;
	}


	public JLabel Get_list_of_games_score_label() 
	{
		return list_of_games_score_label;
	}


	public void Set_list_of_games_score_label(JLabel list_of_games_score_label)
	{
		this.list_of_games_score_label = list_of_games_score_label;
	}
}
