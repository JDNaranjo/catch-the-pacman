package model;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private String level;
	
	private List<Pacman> pacmans;
	private List<Score> scores;
	
	public Game() {
		pacmans = new ArrayList<Pacman>();
		scores = new ArrayList<Score>();
	}
	
	
	
}
