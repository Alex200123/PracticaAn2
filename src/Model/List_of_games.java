package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class List_of_games implements ActionListener{

	private Vector <Video_game_genre> games;
	
	public List_of_games()
	{
		this.games = new Vector<Video_game_genre>();
	}
	
	public List_of_games(List_of_games existing_list)
	{
		this.games = existing_list.Get_games_list();
	}
	
	public void Add_game_to_list(Video_game_genre game)
	{
		games.add(game);
	}
	
	public void Write_games()
	{
		for(int i = 0; i < games.size(); i++ )
		{
			games.get(i).Print_content();
		}
	}
	
	public int Get_number_of_elements_in_list()
	{
		return games.size();
	}
	
	public Vector <Video_game_genre> Get_games_list()
	{
		return games;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Write_games();
		
	}
	
}
