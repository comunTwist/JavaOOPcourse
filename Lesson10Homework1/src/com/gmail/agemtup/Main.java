//Написать программу переводчик, которая будет переводить текст
//в файле English.in,написанный на английском языке, на украинский
//язык согласно заранее составленному словарю. Результат
//сохранить в файл Ukrainian.out.

package com.gmail.agemtup;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		File en = new File("English.in");
		File ua = new File("Ukrainian.out");
		writeUaText(ua, readEnText(en));
	}

	public static String readEnText(File file) {
		StringBuilder sbIn = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				sbIn.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return sbIn.toString();
	}

	public static void writeUaText(File file, String string) {
		StringBuilder sbOut = new StringBuilder();
		for (String word : string.split("[ " + System.lineSeparator() + "]")) {
			if (word.equals("hello")) {
				sbOut.append("привіт").append(" ");
			}
			if (word.equals("world")) {
				sbOut.append("світ").append(" ");
			}
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(sbOut.toString());
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

}
