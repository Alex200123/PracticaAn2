package Controller;

import java.io.Serializable;
import java.util.Objects;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Model.FPS;
import Model.List_of_games;
import Model.RPG;
import Model.RTS;

public class Load_data {
	
	public static String Get_JSON_As_Text(String filename) {
        String jsonText = "";
        try {		
            BufferedReader bufferedReader = 
                          new BufferedReader(new FileReader(filename));
        
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }
        
            bufferedReader.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return jsonText;
    }
	
	public void Read_games_from_JSON(List_of_games list)
	{
		try {
			
			
			String strJson = this.Get_JSON_As_Text("data.json");
			
			JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONArray mainJsonObject = (JSONArray) object;
            
            Add_objects_from_JSON(mainJsonObject, list);
             
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}
	
	public void Add_objects_from_JSON(JSONArray mainJsonObject,List_of_games list)
	{
		for (int i = 0; i < mainJsonObject.size(); i++) 
        {
        	JSONObject jsonObject = (JSONObject) mainJsonObject.get(i);
        	String game_name;
        	String game_description;
        	long game_score;
        	String game_tag;
        	
        	game_name = (String) jsonObject.get("name");
        	game_description = (String) jsonObject.get("description");
        	game_score = (long) jsonObject.get("score");
        	game_tag = (String) jsonObject.get("tag");
        	
        	if(Objects.equals(game_tag, "Action"))
        	{
        		FPS temp = new FPS();
        		temp.Set(game_name, game_description, game_score, game_tag);
        		list.Add_game_to_list(temp);
        	}
        	
        	if(Objects.equals(game_tag, "Fantasy"))
        	{
        		RPG temp = new RPG();
        		temp.Set(game_name, game_description, game_score, game_tag);
        		list.Add_game_to_list(temp);
        	}
        	
        	if(Objects.equals(game_tag, "Strategy"))
        	{
        		RTS temp = new RTS();
        		temp.Set(game_name, game_description, game_score, game_tag);
        		list.Add_game_to_list(temp);
        	}
        }
	}
	
	public void Read_games_from_JSON_saved_list(List_of_games list)
	{
		try {
			
			
			String strJson = this.Get_JSON_As_Text("saved_list.json");
			
			JSONParser parser = new JSONParser();
	        Object object = parser.parse(strJson);
	        JSONArray mainJsonObject = (JSONArray) object;
	        
	        Add_objects_from_JSON(mainJsonObject, list);
	         
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}
}


