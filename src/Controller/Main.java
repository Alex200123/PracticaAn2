package Controller;

import Model.FPS;
import Model.List_of_games;
import Model.Video_game_genre;
import View.Interface;

public class Main {

	public static void main(String[] args) {
		Load_data test = new Load_data();
		List_of_games list = new List_of_games();
		Save_data saved = new Save_data();
		
		
		test.Read_games_from_JSON(list);
		//test.Read_games_from_JSON_saved_list(list);
		list.Write_games();
		saved.Create_JSON(list);
		Interface gui = new Interface(list);
		
	}

}
