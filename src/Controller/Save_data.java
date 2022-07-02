package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONArray;
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
		
		JSONArray obj_list = new JSONArray();
		
		for(int i = 0; i < list.Get_number_of_elements_in_list(); i++)
		{
			JSONObject obj_atributes = new JSONObject();
			
			obj_atributes.put("name", list.Get_games_list().get(i).Get_name());
			obj_atributes.put("description", list.Get_games_list().get(i).Get_description());
			obj_atributes.put("score", list.Get_games_list().get(i).Get_score());
			obj_atributes.put("tag", list.Get_games_list().get(i).Get_tag());
			
			obj_list.add(obj_atributes);
			
		}
		
		try(FileWriter file = new FileWriter("saved_list.json"))
		{
			
			file.write(obj_list.toJSONString());
			file.close();
		}
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
		
}

