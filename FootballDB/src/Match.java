// class that contain all the information in of the current match
public class Match {
	private String FirstTeam;
	private String SecondTeam;
	private int score_fteam; // score first team
	private int score_steam; // score second team 
	private int month;
	private int year;
	private int day;
	
	public void insert_fteam (String team) {
		this.FirstTeam = team;
	}
	
	public void insert_steam (String team) {
		this.SecondTeam = team;
	}
	
	public void insert_fscore(int score) {
		this.score_fteam = score;
	}
	
	public void insert_sscore (int score) {
		this.score_steam = score;
	} 
	
	public void insert_day (int day_input) {
		this.day = day_input;
	}
	public void insert_month (int month_input){
		this.month = month_input;
	}
	
	public void insert_year (int year_input) {
		this.year = year_input;
	}
	
}
