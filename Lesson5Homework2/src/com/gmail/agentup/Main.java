//Напишите программу которая примет на вход 2 текстовых
//файла, а вернет один. Содержимым этого файла должны
//быть слова которые есть и в первом и во втором файле

package com.gmail.agentup;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		File fileOne = new File("a.txt");
		File fileTwo = new File("b.txt");
		File fileThree = new File("c.txt");
		String[] strOne = fileToString(fileOne).split("[.!?, ]");
		String[] strTwo = fileToString(fileTwo).split("[.!?, ]");
		stringToFile(stringResult(strOne, strTwo), fileThree);
		System.out.println(stringResult(strOne, strTwo));
	}

	public static void stringToFile(String string, File file) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(string);
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public static String stringResult(String[] strOne, String[] strTwo) {
		String result = "";
		for (int i = 0; i < strOne.length; i++) {
			for (int j = 0; j < strTwo.length; j++) {
				if (strOne[i].equals(strTwo[j])) {
					result += strOne[i] + " ";
				}
			}
		}
		return result;
	}

	public static String fileToString(File file) {
		String result = "";
		// StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str = "";
			for (; (str = br.readLine()) != null;) {
				result += str + " ";
				// sb.append(str).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		return result;
		// return sb.toString();
	}
	
}
