//Считайте из файла текст на английском языке, вычислите
//относительную частоту повторения каждой буквы и выведите на
//экран результат в порядке убывания относительной частоты
//повторения

package com.gmail.agentup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		ArrayList<LetterStats> alphaArray = new ArrayList<>();
		for (char symbol : alphabet.toCharArray()) {
			alphaArray.add(new LetterStats(String.valueOf(symbol), 0));
		}

		File text = new File("en.txt");
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(text))) {
			String str = "";
			for (; (str = br.readLine()) != null;) {
				sb.append(str).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		List<String> textArray = new ArrayList<>();
		for (char symbol : sb.toString().toCharArray()) {
			textArray.add(String.valueOf(symbol));
		}

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
//		Arrays.sort(alphaArray.toArray(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
//				: a.getCount() - b.getCount());
		System.out.println(alphaArray);
	}

}
