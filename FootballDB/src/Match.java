// class that contain all the information in of the current match
public class Match {
	private String FirstTeam;
	private String SecondTeam;
	private int score_fteam; // score first team
	private int score_steam; // score second team
	private String date; 
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
}
