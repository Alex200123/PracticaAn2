package Model;

public class RTS implements Video_game_genre {

	private String name;
	private String description;
	private long score;
	private String tag;
	
	@Override
	public void Set(String n, String d, long s, String t) 
	{
		this.name = n;
		this.description = d;
		this.score = s;
		this.tag = t;
		
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
	public long Get_score() 
	{
		return this.score;
	}

	@Override
	public String Get_tag() {
	
		return this.tag;
	}

	@Override
	public void Print_content()
	{
		System.out.println( this.Get_name());
		System.out.println(this.Get_description());
		System.out.println(this.Get_score());
		System.out.println(this.Get_tag() + "\n");
		
	}

	@Override
	public void Set_tag() {
		this.tag = "Strategy";
		
	}

}
