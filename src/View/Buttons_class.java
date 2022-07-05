package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.FPS;
import Model.List_of_games;
import Model.RPG;
import Model.RTS;
import Model.Video_game_genre;

public class Buttons_class
{

	private JButton button_quit_main;
	private JButton button_lets_start_main;
	
	private JButton add_game_to_list;
	private JButton find_a_good_game_based_on_preferance;
	private JButton rate_a_game;
	private Vector<JButton> list_of_buttons_for_games;
	private Vector<JButton> list_of_back_buttons_in_list_of_buttons_for_games;
	
	
	private JButton add_button_in_add_a_game;
	
	
	public Buttons_class(JFrame main_frame, JFrame the_3_options_frame, Vector<JFrame> list_of_games_description_frame, List_of_games existing_list, Labels_class labels,
			TextField_class text_fields, JFrame add_a_game_frame, Panels_class panels)
	{
		list_of_buttons_for_games = new Vector<JButton>();
		list_of_back_buttons_in_list_of_buttons_for_games = new Vector<JButton>();
		
		button_quit_main = new JButton("Exit");
		button_quit_main.setBounds(320, 500, 100, 100);
		Add_button_quit_main_functionality();
		
		
		button_lets_start_main = new JButton("Let's start");
		button_lets_start_main.setBounds(520, 500, 100, 100);
		Add_button_lets_start_main_functionality(main_frame, the_3_options_frame);
		
		
		add_game_to_list = new JButton("Add a game");
		add_game_to_list.setBounds(133, 300, 300, 100);
		Add_add_game_to_list_functionality(add_a_game_frame, the_3_options_frame);
		
		find_a_good_game_based_on_preferance = new JButton("Find me a game");
		find_a_good_game_based_on_preferance.setBounds(333, 100, 300, 100);
		
		
		rate_a_game = new JButton("I am going to rate a game");
		rate_a_game.setBounds(533, 300, 300, 100);
		
		for(int i = 0; i < existing_list.Get_number_of_elements_in_list(); i++)
		{
			JButton temp_list_of_buttons_for_games = new JButton(existing_list.Get_games_list().get(i).Get_name());
			list_of_buttons_for_games.add(temp_list_of_buttons_for_games);
			JButton temp_list_of_back_buttons_in_list_of_buttons_for_games = new JButton("Back");
			temp_list_of_back_buttons_in_list_of_buttons_for_games.setBounds(30, 100, 300, 100);
			list_of_back_buttons_in_list_of_buttons_for_games.add(temp_list_of_back_buttons_in_list_of_buttons_for_games);
			
		}
		Add_list_of_buttons_for_games_functionality(existing_list, labels, list_of_games_description_frame);
		Add_list_of_back_buttons_in_list_of_buttons_for_games_functionality(list_of_games_description_frame);
		
		
		add_button_in_add_a_game =  new JButton("Add game");
		add_button_in_add_a_game.setBounds(250, 400, 100, 50);
		Add_button_in_add_a_game_functionality(text_fields, existing_list, add_a_game_frame, labels, panels, the_3_options_frame, list_of_games_description_frame);
		
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
	
	private void Add_list_of_back_buttons_in_list_of_buttons_for_games_functionality(Vector<JFrame> list_of_games_description_frame)
	{
		for(int i = 0; i < list_of_back_buttons_in_list_of_buttons_for_games.size(); i ++)
		{	
			list_of_back_buttons_in_list_of_buttons_for_games.get(i).addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{	
					JButton temporar = (JButton) e.getSource();
					for(int i = 0; i < list_of_back_buttons_in_list_of_buttons_for_games.size(); i++)
					{
						if(Objects.equals(temporar, 
								list_of_back_buttons_in_list_of_buttons_for_games.get(i)))
						{
							list_of_games_description_frame.get(i).setVisible(false);
						}
					}
					
				}
			});
		}
	}
	
	
	private void Add_list_of_buttons_for_games_functionality(List_of_games existing_list, Labels_class labels,  Vector<JFrame> list_of_games_description_frame)
	{
		for(int i = 0; i < list_of_buttons_for_games.size(); i++)
		{	
			list_of_buttons_for_games.get(i).addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					JButton temporar = (JButton) e.getSource();
					for(int i = 0; i < list_of_buttons_for_games.size(); i++)
					{
						if(Objects.equals(temporar.getText(), 
								list_of_buttons_for_games.get(i).getText()))
						{
							list_of_games_description_frame.get(i).setVisible(true);
						}
					}
				}
			});
		}
	}
	
	private void Add_add_game_to_list_functionality(JFrame add_a_game_frame, JFrame the_3_options_frame)
	{
			add_game_to_list.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{ 
					 add_a_game_frame.setVisible(true);
					 the_3_options_frame.setVisible(false);
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
	
	private void Add_button_in_add_a_game_functionality(TextField_class text_fields, List_of_games existing_list, 
			JFrame add_a_game_frame, Labels_class labels, Panels_class panels, JFrame the_3_options_frame, 
			Vector<JFrame> list_of_games_description_frame)
	{	
			
			add_button_in_add_a_game.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					 
					 String name_of_game = text_fields.Get_text_field_game_name().getText();  
				     String description_of_game = text_fields.Get_text_field_game_description().getText();  
				     String score_of_game = text_fields.Get_text_field_game_score().getText(); 
				     String tag_of_game = text_fields.Get_text_field_game_tag().getText(); 
				     Video_game_genre game_to_be_added;
				     
				     long score = Long.parseLong(score_of_game);
				     
				     if(Objects.equals(tag_of_game, "Action"))
				     {
				    	 game_to_be_added = new FPS();
				    	 Utility_function_for_add_in_add_game_button( game_to_be_added, name_of_game,
				    				description_of_game, score,  tag_of_game, text_fields,  existing_list, 
				    				 add_a_game_frame,  labels,  panels,  the_3_options_frame, 
				    				 list_of_games_description_frame);
						 
				     }
				     else
				     {
				    	 if(Objects.equals(tag_of_game, "Fantasy"))
					     {
				    		 game_to_be_added = new RPG();
				    		 Utility_function_for_add_in_add_game_button( game_to_be_added, name_of_game,
					    				description_of_game, score,  tag_of_game, text_fields,  existing_list, 
					    				 add_a_game_frame,  labels,  panels,  the_3_options_frame, 
					    				 list_of_games_description_frame);
					     }
				    	 else
				    	 {
				    		 if(Objects.equals(tag_of_game, "Strategy"))
						     {
				    			 game_to_be_added = new RTS();
				    			 Utility_function_for_add_in_add_game_button( game_to_be_added, name_of_game,
						    				description_of_game, score,  tag_of_game, text_fields,  existing_list, 
						    				 add_a_game_frame,  labels,  panels,  the_3_options_frame, 
						    				 list_of_games_description_frame);
						     }
				    	 }
				     }
				     add_a_game_frame.setVisible(false);
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
	
	public JButton Get_add_button_in_add_a_game()
	{
		return add_button_in_add_a_game;
	}
	
	public Vector<JButton> Get_list_of_buttons_for_games()
	{
		return list_of_buttons_for_games;
	}
	
	public Vector<JButton> Get_list_of_back_buttons_in_list_of_buttons_for_games()
	{
		return list_of_back_buttons_in_list_of_buttons_for_games;
	}
	
	private void Utility_function_for_add_in_add_game_button(Video_game_genre game_to_be_added,String name_of_game,
			String description_of_game, long score, String tag_of_game,TextField_class text_fields, List_of_games existing_list, 
			JFrame add_a_game_frame, Labels_class labels, Panels_class panels, JFrame the_3_options_frame, 
			Vector<JFrame> list_of_games_description_frame)
	{
		game_to_be_added.Set(name_of_game, description_of_game, score, tag_of_game);
   	 existing_list.Add_game_to_list(game_to_be_added);
   	 
   	 JButton temp_button_to_be_shown_in_list = new JButton(game_to_be_added.Get_name());
   	 list_of_buttons_for_games.add(temp_button_to_be_shown_in_list);
   	 Add_list_of_buttons_for_games_functionality( existing_list,  labels, list_of_games_description_frame);
   	 panels.Get_list_of_games_panel().add(temp_button_to_be_shown_in_list);
   	 
   	 
   	 
   	 JLabel temp_description = new JLabel(description_of_game);
		 temp_description.setBounds(0, 0, 1000, 25);
		 temp_description.setFont(new Font("Serif", Font. BOLD, 20));
		 labels.Get_list_of_games_description_label().add(temp_description);
		 
		 
		 JButton temp_list_of_back_buttons_in_list_of_buttons_for_games = new JButton("Back");
		 temp_list_of_back_buttons_in_list_of_buttons_for_games.setBounds(30, 100, 300, 100);
		 list_of_back_buttons_in_list_of_buttons_for_games.add(temp_list_of_back_buttons_in_list_of_buttons_for_games);
		 Add_list_of_back_buttons_in_list_of_buttons_for_games_functionality(list_of_games_description_frame);
		 
		 
		 final String temp = score + "";
		 JLabel temp_score = new JLabel(temp);
		 temp_score = new JLabel("Score: " + temp);
		 temp_score.setBounds(0, 25, 150, 25);
		 temp_score.setFont(new Font("Serif", Font. BOLD, 20));
		 labels.Get_list_of_games_score_label().add(temp_score);
		 
		 JPanel temp_pop_up_panel = new JPanel();
		 temp_pop_up_panel.setLayout(null);
		 temp_pop_up_panel.add(temp_description);
		 temp_pop_up_panel.add(temp_score);
		 temp_pop_up_panel.add( temp_list_of_back_buttons_in_list_of_buttons_for_games);
		 panels.Get_pop_up_description_per_game().add(temp_pop_up_panel); 
		 
		 JScrollPane temp_scroll_description = new JScrollPane(temp_pop_up_panel);
		 temp_scroll_description.setBounds(0, 0, 1500, 300);
		 panels.Get_pop_up_description_per_game_scroll().add(temp_scroll_description);
		 
		 JFrame temp_list_of_games_description = new JFrame();
		 temp_list_of_games_description.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 temp_list_of_games_description.setTitle("Game information");
		 temp_list_of_games_description.setSize(1500, 300);
		 temp_list_of_games_description.add(panels.Get_pop_up_description_per_game_scroll().get(panels.Get_pop_up_description_per_game_scroll().size()-1));
		 list_of_games_description_frame.add(temp_list_of_games_description);
		 the_3_options_frame.add(panels.Get_list_of_games_scroll_panel());
	}
}
