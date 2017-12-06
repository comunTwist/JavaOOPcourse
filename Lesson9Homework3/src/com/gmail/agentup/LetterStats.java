package com.gmail.agentup;

public class LetterStats {
	private String letter;
	private int count;

	public LetterStats(String letter, int count) {
		super();
		this.letter = letter;
		this.count = count;
	}

	public LetterStats() {
		super();
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "LetterStats [letter=" + letter + ", count=" + count + "]";
	}

}
