package Model;

import java.util.Vector;

public class List_of_games {

	private Vector <Video_game_genre> games;
	
	public List_of_games()
	{
		this.games = new Vector<Video_game_genre>();
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
	
}
