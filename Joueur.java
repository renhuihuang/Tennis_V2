
public class Joueur {
	private String name;
	private int score;
	private boolean win;
	private int nb_win;

	
	public Joueur(String name, int score, int nb_win, boolean win){
		this.name = name;
		this.score = score;
		this.win = win;
		this.nb_win = nb_win;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isWin() {
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}

	public int getNb_win() {
		return nb_win;
	}

	public void setNb_win(int nb_win) {
		this.nb_win = nb_win;
	}
	
}
