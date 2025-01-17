package View;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.List_of_games;
import Model.Video_game_genre;


public class Interface 
{
	private JFrame main_frame;
	private JFrame the_3_options_frame;
	private Panels_class panels;
	private Labels_class labels;
	private List_of_games list;
	private TextField_class text_fields;
	private Buttons_class buttons;
	private Vector<JFrame> list_of_games_description_frame;
	private JFrame add_a_game_frame;
	private JFrame find_me_a_game_frame;
	
	private JFrame rate_a_game_frame;
	
	
	
	
	public Interface(List_of_games existing_list)
	{
		list = new List_of_games(existing_list);
		list_of_games_description_frame = new Vector<JFrame>();
		rate_a_game_frame = new JFrame();
		for(int i = 0; i < existing_list.Get_number_of_elements_in_list(); i++)
		{
			JFrame temp_list_of_games_description_frame = new JFrame();
			
			list_of_games_description_frame.add(temp_list_of_games_description_frame);
			
			
		}
		
		
		
		
		text_fields = new TextField_class(list);
		main_frame = new JFrame();
		add_a_game_frame = new JFrame();
		find_me_a_game_frame = new JFrame();
		the_3_options_frame = new JFrame();
		panels = new Panels_class(existing_list);
		labels = new Labels_class(existing_list);
		the_3_options_frame.setLayout(null);
		
		buttons = new Buttons_class(main_frame, the_3_options_frame, list_of_games_description_frame, list, 
				labels, text_fields, add_a_game_frame, panels, find_me_a_game_frame,  
				rate_a_game_frame); 
		
		panels.Add_components_to_main_panel(buttons, labels);
		panels.Add_components_to_the_3_options_panell(buttons, labels);
		panels.Add_components_to_list_of_games_panel(buttons, existing_list, labels);
		panels.Add_components_to_add_a_game_panel(buttons, labels,text_fields);
		panels.Add_components_to_find_me_a_game_panel(buttons, labels, text_fields);
		
		panels.Add_components_to_rate_a_game_panel(buttons, existing_list, text_fields, labels);
		
		main_frame.add(panels.Get_main_panel());
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setTitle("Game Review");
		main_frame.setSize(1000,1000);
		main_frame.setVisible(true);
		
		the_3_options_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		the_3_options_frame.setTitle("Game Review");
		the_3_options_frame.setSize(1000,650);
		the_3_options_frame.add(panels.Get_the_3_options_panel());
		the_3_options_frame.add(panels.Get_list_of_games_scroll_panel());
		
		for(int i = 0; i < existing_list.Get_number_of_elements_in_list(); i++)
		{
			list_of_games_description_frame.get(i).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			list_of_games_description_frame.get(i).setTitle(list.Get_games_list().get(i).Get_name());
			list_of_games_description_frame.get(i).setSize(1500, 300);
			list_of_games_description_frame.get(i).add(panels.Get_pop_up_description_per_game_scroll().get(i));
			
			
			
		}
	
		rate_a_game_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rate_a_game_frame.setTitle("Rate");
		rate_a_game_frame.setSize(600,600);
		rate_a_game_frame.add(panels.Get_rate_a_game_panell());
		
		add_a_game_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add_a_game_frame.setTitle("Game Review");
		add_a_game_frame.setSize(600,600);
		add_a_game_frame.add(panels.Get_add_a_game_panel());
		
		find_me_a_game_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		find_me_a_game_frame.setTitle("Game Review");
		find_me_a_game_frame.setSize(600,600);
		find_me_a_game_frame.add(panels.Get_find_me_a_game_panel());
		
		
		
		
		
	}

	
}
