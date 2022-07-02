package com.chainsys.springproject.beans;

public class ScoreBoard {
	public int targetScore;

	private ScoreBoard() {
		System.out.println("Score Board Object created");
	}
	private ScoreBoard(int runs) {
		targetScore = runs;
		System.out.println("Score Board Object created");
	}

	// Factory method
	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
		public static ScoreBoard createObject(int runs) {
			return new ScoreBoard(runs);
		}
}