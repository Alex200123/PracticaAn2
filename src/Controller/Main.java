package Controller;

import Model.FPS;
import Model.List_of_games;
import Model.Video_game_genre;
import View.Interface;

public class Main {

	public static void main(String[] args) {
		Load_data load = new Load_data();
		List_of_games list = new List_of_games();
		
		
		
		load.Read_games_from_JSON(list);
		//test.Read_games_from_JSON_saved_list(list);
		
		
		Interface gui = new Interface(list);
		
	}

}
