package com.gmail.agentup;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Alphabet {
	private ArrayList<LetterStats> alphaArray = new ArrayList<>();
	private ArrayList<String> textArray = new ArrayList<>();

	public void createLettersList(String alphabet) {
		for (char symbol : alphabet.toCharArray()) {
			alphaArray.add(new LetterStats(String.valueOf(symbol), 0));
		}
	}

	public void createSymbolList(File text) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(text))) {
			String str = "";
			for (; (str = br.readLine()) != null;) {
				sb.append(str).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		for (char symbol : sb.toString().toCharArray()) {
			textArray.add(String.valueOf(symbol));
		}
	}

	public void getStatistic() {
		for (int i = 0; i < alphaArray.size(); i++) {
			Iterator<String> iterText = textArray.iterator();
			for (; iterText.hasNext();) {
				if (alphaArray.get(i).getLetter().equalsIgnoreCase(iterText.next())) {
					int tmp = alphaArray.get(i).getCount();
					tmp++;
					alphaArray.get(i).setCount(tmp);
				}
			}
		}
		alphaArray.sort(Alphabet::myComp);
	}

	private static int myComp(LetterStats a, LetterStats b) {
		if (CheckNull.checkNull(a, b) != CheckNull.NOT_NULL) {
			return CheckNull.checkNull(a, b);
		}
		if (a.getCount() - b.getCount() != 0) {
			return b.getCount() - a.getCount();
		}
		return a.getLetter().charAt(0) - b.getLetter().charAt(0);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (LetterStats letter : alphaArray) {
			if (letter != null) {
				sb.append(letter);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

}
