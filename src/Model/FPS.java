package Model;

public class FPS implements Video_game_genre
{

	private String name;
	private String description;
	private int score;
	
	@Override
	public void Set(String n, String d, int s) 
	{
		this.name = n;
		this.description = d;
		this.score = s;
		
	}

	@Override
	public String Get_name() 
	{
		return this.name;
	}

	@Override
	public String Get_description() 
	{
		return this.description;
	}

	@Override
	public int Get_score() 
	{
		return this.score;
	}

}
