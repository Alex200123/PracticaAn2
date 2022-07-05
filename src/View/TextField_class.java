package View;

import javax.swing.JTextField;

public class TextField_class {
	private JTextField text_field_game_name;
	private JTextField text_field_game_description;
	private JTextField text_field_game_score;
	private JTextField text_field_game_tag;
	
	
	public TextField_class()
	{
		text_field_game_name = new JTextField();
		text_field_game_description = new JTextField();
		text_field_game_score =  new JTextField();
		text_field_game_tag = new JTextField();
		text_field_game_name.setBounds(200, 0, 300, 25);
		text_field_game_description.setBounds(200, 25, 300, 25);
		text_field_game_score.setBounds(200, 50, 300, 25);
		text_field_game_tag.setBounds(200, 75, 300, 25);
	}
	
	
	public JTextField Get_text_field_game_name()
	{
		return text_field_game_name;
	}
	
	public JTextField Get_text_field_game_description()
	{
		return text_field_game_description;
	}
	
	public JTextField Get_text_field_game_score()
	{
		return text_field_game_score;
	}
	
	public JTextField Get_text_field_game_tag()
	{
		return text_field_game_tag;
	}
}


