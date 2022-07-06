package View;

import javax.swing.JTextField;

public class TextField_class {
	private JTextField text_field_game_name;
	private JTextField text_field_game_description;
	private JTextField text_field_game_score;
	private JTextField text_field_game_tag;
	private JTextField text_field_game_tag_to_be_found;
	
	
	public TextField_class()
	{
		text_field_game_name = new JTextField();
		text_field_game_description = new JTextField();
		text_field_game_score =  new JTextField();
		text_field_game_tag = new JTextField();
		text_field_game_tag_to_be_found = new JTextField();
		text_field_game_name.setBounds(150, 200, 300, 25);
		text_field_game_description.setBounds(150, 225, 300, 25);
		text_field_game_score.setBounds(150, 250, 300, 25);
		text_field_game_tag.setBounds(150, 275, 300, 25);
		text_field_game_tag_to_be_found.setBounds(150, 275, 300, 25);
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
	
	public JTextField Get_text_field_game_tag_to_be_found()
	{
		return text_field_game_tag_to_be_found;
	}
}


