package Model;

public interface Video_game_genre {

	public void Set(String name, String description, long score, String tag);
	public String Get_name();
	public String Get_description();
	public long Get_score();
	public String Get_tag();
	public void Print_content();
}
