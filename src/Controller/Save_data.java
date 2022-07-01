package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;

import Model.List_of_games;

public class Save_data {

	private static FileWriter file;
	
	public void Create_JSON(List_of_games list) 
	{
		try {
			file = new FileWriter("saved_list.json");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JSONObject obj = new JSONObject();
		
		for(int i = 0; i < list.Get_number_of_elements_in_list(); i++)
		{
			obj.put("name", list.Get_games_list().get(i).Get_name());
			obj.put("description", list.Get_games_list().get(i).Get_description());
			obj.put("score", list.Get_games_list().get(i).Get_score());
			obj.put("tag", list.Get_games_list().get(i).Get_tag());
			
			try 
			{
				file = new FileWriter("saved_list.json", true);
				file.write(obj.toJSONString());
				file.close();
			}
			catch (IOException e) 
			{
	            e.printStackTrace();
	        }
        }
		
	}
}
