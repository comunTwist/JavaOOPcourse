//Считайте из файла текст на английском языке, вычислите
//относительную частоту повторения каждой буквы и выведите на
//экран результат в порядке убывания относительной частоты
//повторения

package com.gmail.agentup;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Alphabet alphaArr = new Alphabet();
		alphaArr.createLettersList(alphabet);
		
		File text = new File("en.txt");
		alphaArr.createSymbolList(text);
		
		alphaArr.getStatistic();
		System.out.println(alphaArr);

	}

}
