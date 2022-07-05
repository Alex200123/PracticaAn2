package View;

import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;

import Model.List_of_games;

public class Labels_class 
{
	private JLabel main_label1;
	private JLabel main_label2;
	private JLabel main_label3;
	
	private Vector<JLabel> list_of_games_description_label;
	private Vector<JLabel> list_of_games_score_label;
	
	
	Labels_class(List_of_games existing_list)
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
		
		list_of_games_description_label = new Vector<JLabel>();
		list_of_games_score_label = new Vector<JLabel>();
		
		
		
		for(int j = 0; j < existing_list.Get_number_of_elements_in_list(); j++)
		{
			JLabel temp_description = new JLabel(existing_list.Get_games_list().get(j).Get_description());
			temp_description.setBounds(0, 0, 1000, 25);
			temp_description.setFont(new Font("Serif", Font. BOLD, 20));
			list_of_games_description_label.add(temp_description);
			
			final String temp = existing_list.Get_games_list().get(j).Get_score() + "";
			JLabel temp_score = new JLabel(temp);
			temp_score = new JLabel("Score: " + temp);
			temp_score.setBounds(0, 25, 150, 25);
			temp_score.setFont(new Font("Serif", Font. BOLD, 20));			
			list_of_games_score_label.add(temp_score);
		}
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


	


	public Vector<JLabel> Get_list_of_games_description_label() 
	{
		return list_of_games_description_label;
	}


	


	public Vector<JLabel> Get_list_of_games_score_label() 
	{
		return list_of_games_score_label;
	}


	
}
