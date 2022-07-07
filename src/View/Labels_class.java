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
	
	private JLabel list_of_games_label_in_3_options_panel;
	
	private JLabel name_label_for_text_field;
	private JLabel description_label_for_text_field;
	private JLabel score_label_for_text_field;
	private JLabel tag_label_for_text_field;
	private JLabel tag_label_for_text_field_to_be_found;
	
	
	private Vector<JLabel> list_of_games_description_label;
	private Vector<JLabel> list_of_games_score_label;
	
	private JLabel list_of_games_score_label_in_rate_a_game;
	private JLabel list_of_games_name_label_in_rate_a_game;
	
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
		
		list_of_games_label_in_3_options_panel = new JLabel("The list of games you can interact with: ");
		list_of_games_label_in_3_options_panel.setBounds(330, 650, 400, 25);
		list_of_games_label_in_3_options_panel.setFont(new Font("Serif", Font. BOLD, 20));
		
		list_of_games_description_label = new Vector<JLabel>();
		list_of_games_score_label = new Vector<JLabel>();
		
		list_of_games_score_label_in_rate_a_game = new JLabel("Score");
		list_of_games_score_label_in_rate_a_game.setBounds(100, 275, 100, 25);
		list_of_games_score_label_in_rate_a_game.setFont(new Font("Serif", Font. BOLD, 20));
		
		list_of_games_name_label_in_rate_a_game = new JLabel("Name");
		list_of_games_name_label_in_rate_a_game.setBounds(100, 250, 100, 25);
		list_of_games_name_label_in_rate_a_game.setFont(new Font("Serif", Font. BOLD, 20));
		
		name_label_for_text_field = new JLabel("Name");
		name_label_for_text_field.setBounds(100, 200, 100, 25);
		name_label_for_text_field.setFont(new Font("Serif", Font. BOLD, 20));
		
		description_label_for_text_field = new JLabel("Description");
		description_label_for_text_field.setBounds(50, 225, 100, 25);
		description_label_for_text_field.setFont(new Font("Serif", Font. BOLD, 20));
		
		score_label_for_text_field = new JLabel("Score");
		score_label_for_text_field.setBounds(100, 250, 100, 25);
		score_label_for_text_field.setFont(new Font("Serif", Font. BOLD, 20));
		
		tag_label_for_text_field = new JLabel("Tag");
		tag_label_for_text_field.setBounds(100, 275, 100, 25);
		tag_label_for_text_field.setFont(new Font("Serif", Font. BOLD, 20));
		
		tag_label_for_text_field_to_be_found = new JLabel("Tag");
		tag_label_for_text_field_to_be_found.setBounds(100, 275, 100, 25);
		tag_label_for_text_field_to_be_found.setFont(new Font("Serif", Font. BOLD, 20));
		
		
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
	
	public JLabel Get_list_of_games_name_label_in_rate_a_game()
	{
		return list_of_games_name_label_in_rate_a_game;
	}
	
	public JLabel Get_list_of_games_score_label_in_rate_a_game()
	{
		return list_of_games_score_label_in_rate_a_game;
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
	
	public JLabel Get_list_of_games_label_in_3_options_panel()
	{
		return list_of_games_label_in_3_options_panel;
	}
	
	public JLabel Get_tag_label_for_text_field_to_be_found()
	{
		return tag_label_for_text_field_to_be_found;
	}

	public JLabel Get_name_label_for_text_field()
	{
		return name_label_for_text_field;
	}

	public JLabel Get_description_label_for_text_field()
	{
		return description_label_for_text_field;
	}
	
	public JLabel Get_score_label_for_text_field()
	{
		return score_label_for_text_field;
	}

	public JLabel Get_tag_label_for_text_field()
	{
		return tag_label_for_text_field;
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
