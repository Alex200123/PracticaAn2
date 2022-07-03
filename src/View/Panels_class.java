package View;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panels_class 
{
	private JPanel main_panel;
	
	Panels_class()
	{
		main_panel = new JPanel();
		main_panel.setLayout(null);
		main_panel.setBorder(BorderFactory.createBevelBorder(1));	
	}
	
	
	public void Add_components_to_main_panel(Buttons_class buttons, Labels_class labels)
	{
		main_panel.add(buttons.Get_button_quit_main());
		main_panel.add(labels.Get_main_label1());
		main_panel.add(labels.Get_main_label2());
		main_panel.add(labels.Get_main_label3());
	}
	
	public JPanel Get_main_panel()
	{
		return main_panel;
	}
}
