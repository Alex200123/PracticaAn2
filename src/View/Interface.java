package View;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.List_of_games;
import Model.Video_game_genre;


public class Interface 
{
	private JFrame main_frame;
	private Panels_class panels;
	private Labels_class labels;
	private List_of_games list;
	private Buttons_class buttons;
	
	public Interface(List_of_games existing_list)
	{
		main_frame = new JFrame();
		panels = new Panels_class();
		labels = new Labels_class();
		list = new List_of_games(existing_list);
		buttons = new Buttons_class(); 
		
		panels.Add_components_to_main_panel(buttons, labels);
		
		
		main_frame.add(panels.Get_main_panel());
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setTitle("Game Review");
		main_frame.setSize(1000,1000);
		main_frame.setVisible(true);
		
	}

	
}
