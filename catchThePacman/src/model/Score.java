package model;

import java.io.Serializable;

public class Score implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String level;
	private int score;
	
	public Score(String nameN, int scoreS) {
		name = nameN;
		score = scoreS;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getLevel() {
		return level;
	}

}
