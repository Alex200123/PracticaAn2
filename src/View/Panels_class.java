package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

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
	private int index = 0;

	
	Panels_class()
	{
		main_panel = new JPanel();
		main_panel.setLayout(null);
		main_panel.setBorder(BorderFactory.createBevelBorder(1));	
		list_of_games_panel = new JPanel();
		
		
		the_3_options_panel = new JPanel();
		the_3_options_panel.setBounds(0, 0, 1000, 700);
		the_3_options_panel.setLayout(null);
	}
	
	
	public void Add_components_to_main_panel(Buttons_class buttons, Labels_class labels)
	{
		main_panel.add(buttons.Get_button_quit_main());
		main_panel.add(buttons.Get_button_lets_start_main());
		main_panel.add(labels.Get_main_label1());
		main_panel.add(labels.Get_main_label2());
		main_panel.add(labels.Get_main_label3());
	}
	
	public void Add_components_to_list_of_games_panel(Buttons_class buttons, List_of_games existing_list)
	{
		
		for(int i = 0; i < existing_list.Get_number_of_elements_in_list(); i++)
		{
			list_of_games_panel.add(buttons.Get_list_of_buttons_for_games()[i]);
		}
		
		
		list_of_games_scroll_panel = new JScrollPane(list_of_games_panel);
		list_of_games_scroll_panel.setBounds(0, 700, 1000, 300);
	}
	
	public void Add_components_to_the_3_options_panell(Buttons_class buttons)
	{
		
		the_3_options_panel.add(buttons.Get_add_game_to_list());
		the_3_options_panel.add(buttons.Get_find_a_good_game_based_on_preferance());
		the_3_options_panel.add(buttons.Get_rate_a_game());
	}
	
	public JPanel Get_main_panel()
	{
		return main_panel;
	}
	
	public JPanel Get_the_3_options_panel()
	{
		return the_3_options_panel;
	}
	
	public JScrollPane Get_list_of_games_scroll_panel()
	{
		return list_of_games_scroll_panel;
	}
	
	
	
	
	
}
