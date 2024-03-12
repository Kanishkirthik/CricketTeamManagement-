
public class Score extends Teammembers {
	private int score;
   private int totalscore=0;
	public Score(String playersname, int age, String type, int score) {
		super(playersname, age, type);
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTotalscore() {
		return totalscore;
	}
	
	public void add(int score){	
	  totalscore+=score;
	}
	
}


