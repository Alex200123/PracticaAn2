package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Model.List_of_games;

public class Panels_class 
{
	private JPanel main_panel;
	
	private JPanel list_of_games_panel;
	
	private JScrollPane list_of_games_scroll_panel;
	
	private JPanel the_3_options_panel;
	
	private Vector<JPanel> pop_up_description_per_game;
	
	private Vector<JScrollPane> pop_up_description_per_game_scroll;
	
	private JPanel add_a_game_panel;
	
	private JPanel find_me_a_game_panel;
	
	
	private JPanel rate_a_game_panel;

	
	Panels_class(List_of_games existing_list)
	{
		main_panel = new JPanel();
		main_panel.setLayout(null);
		main_panel.setBorder(BorderFactory.createBevelBorder(1));	
		list_of_games_panel = new JPanel(new GridLayout());
		
		pop_up_description_per_game = new Vector<JPanel>();
		pop_up_description_per_game_scroll = new Vector<JScrollPane>();
		
		
		
		the_3_options_panel = new JPanel();
		the_3_options_panel.setBounds(0, 0, 1000, 350);
		the_3_options_panel.setLayout(null);
		
		for(int i = 0; i < existing_list.Get_number_of_elements_in_list(); i++)
		{
			JPanel temp_description = new JPanel();
			temp_description.setLayout(null);
			pop_up_description_per_game.add(temp_description);
		}
		
		add_a_game_panel = new JPanel();
		add_a_game_panel.setLayout(null);
		
		find_me_a_game_panel = new JPanel();
		find_me_a_game_panel.setLayout(null);
		
		
		
		rate_a_game_panel = new JPanel();
		rate_a_game_panel.setLayout(null);
		
	}
	
	
	public void Add_components_to_rate_a_game_panel(Buttons_class buttons, List_of_games existing_list, TextField_class text_field, Labels_class labels)
	{
		
			rate_a_game_panel.add(buttons.Get_rate_a_game_in_rate_a_game_button());
			rate_a_game_panel.add(buttons.Get_rate_a_game_back_button());
			rate_a_game_panel.add(labels.Get_list_of_games_name_label_in_rate_a_game());
			rate_a_game_panel.add(labels.Get_list_of_games_score_label_in_rate_a_game());
			rate_a_game_panel.add(text_field.Get_text_field_game_score_to_be_rated());
			rate_a_game_panel.add(text_field.Get_text_field_game_name_to_be_rated());
		
	}
	
	
	public void Add_components_to_main_panel(Buttons_class buttons, Labels_class labels)
	{
		main_panel.add(buttons.Get_button_quit_main());
		main_panel.add(buttons.Get_button_lets_start_main());
		main_panel.add(labels.Get_main_label1());
		main_panel.add(labels.Get_main_label2());
		main_panel.add(labels.Get_main_label3());
	}
	
	public void Add_components_to_list_of_games_panel(Buttons_class buttons, List_of_games existing_list, Labels_class labels)
	{
		
		for(int i = 0; i < existing_list.Get_number_of_elements_in_list(); i++)
		{
			list_of_games_panel.add(buttons.Get_list_of_buttons_for_games().get(i));
			
			pop_up_description_per_game.get(i).add(labels.Get_list_of_games_description_label().get(i));
			pop_up_description_per_game.get(i).add(labels.Get_list_of_games_score_label().get(i));
			pop_up_description_per_game.get(i).add(buttons.Get_list_of_back_buttons_in_list_of_buttons_for_games().get(i));
			
			JScrollPane temp_scroll_description = new JScrollPane(pop_up_description_per_game.get(i));
			temp_scroll_description.setBounds(0, 0, 1500, 300);
			pop_up_description_per_game_scroll.add(temp_scroll_description);
		}
		
		
		list_of_games_scroll_panel = new JScrollPane(list_of_games_panel);
		list_of_games_scroll_panel.setBounds(0, 351, 985, 263);
		list_of_games_scroll_panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}
	
	public void Add_components_to_the_3_options_panell(Buttons_class buttons, Labels_class labels)
	{
		
		the_3_options_panel.add(buttons.Get_add_game_to_list());
		the_3_options_panel.add(buttons.Get_find_a_good_game_based_on_preferance());
		the_3_options_panel.add(buttons.Get_rate_a_game());
		the_3_options_panel.add(buttons.Get_button_back_main());
		the_3_options_panel.add(buttons.Get_button_save_list());
		the_3_options_panel.add(buttons.Get_button_load_list());
		the_3_options_panel.add(labels.Get_list_of_games_label_in_3_options_panel());
	}
	
	public void Add_components_to_panel_that_pops_up_per_game(Buttons_class buttons)
	{
		
		the_3_options_panel.add(buttons.Get_add_game_to_list());
		the_3_options_panel.add(buttons.Get_find_a_good_game_based_on_preferance());
		the_3_options_panel.add(buttons.Get_rate_a_game());
	}
	
	public void Add_components_to_add_a_game_panel(Buttons_class buttons, Labels_class labels, TextField_class text_field)
	{
		add_a_game_panel.add(buttons.Get_add_button_in_add_a_game());
		add_a_game_panel.add(buttons.Get_add_game_to_list_back());
		add_a_game_panel.add(text_field.Get_text_field_game_name());
		add_a_game_panel.add(text_field.Get_text_field_game_description());
		add_a_game_panel.add(text_field.Get_text_field_game_score());
		add_a_game_panel.add(text_field.Get_text_field_game_tag());
		add_a_game_panel.add(labels.Get_name_label_for_text_field());
		add_a_game_panel.add(labels.Get_description_label_for_text_field());
		add_a_game_panel.add(labels.Get_score_label_for_text_field());
		add_a_game_panel.add(labels.Get_tag_label_for_text_field());
	}
	
	public void Add_components_to_find_me_a_game_panel(Buttons_class buttons, Labels_class labels, TextField_class text_field)
	{
		find_me_a_game_panel.add(buttons.Get_find_game_in_find_a_good_game_based_on_preferance());
		find_me_a_game_panel.add(buttons.Get_find_a_good_game_based_on_preferance_back());
		find_me_a_game_panel.add(text_field.Get_text_field_game_tag_to_be_found());
		find_me_a_game_panel.add(labels.Get_tag_label_for_text_field_to_be_found());
	}
	

	
	
	
	public JPanel Get_rate_a_game_panell()
	{
		return rate_a_game_panel;
	}
	
	
	
	public JPanel Get_main_panel()
	{
		return main_panel;
	}
	
	public JPanel Get_add_a_game_panel()
	{
		return add_a_game_panel;
	}
	
	public JPanel Get_find_me_a_game_panel()
	{
		return find_me_a_game_panel;
	}
	
	public JPanel Get_list_of_games_panel()
	{
		return list_of_games_panel;
	}
	
	public JPanel Get_the_3_options_panel()
	{
		return the_3_options_panel;
	}
	
	public JScrollPane Get_list_of_games_scroll_panel()
	{
		return list_of_games_scroll_panel;
	}
	
	public Vector<JScrollPane> Get_pop_up_description_per_game_scroll()
	{
		return pop_up_description_per_game_scroll;
	}
	
	public Vector<JPanel> Get_pop_up_description_per_game()
	{
		return pop_up_description_per_game;
	}
	
	
}
