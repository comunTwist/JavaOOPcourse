/*Реализуйте программу которая сопоставит каждой букве ее
представление в виде ASCII - art
Ваша программа должна дать возможность вывода произвольного
текста на экран в виде его ASCII-art представления.*/

package com.gmail.agentup;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input text:");
		String someText = sc.nextLine();
		File letters = new File("ASCII");
		System.out.println(createAsciiText(someText, createAsciiMap(letters)));
		sc.close();

	}

	public static Map<String, File> createAsciiMap(File file) {
		Map<String, File> map = new HashMap<>();
		for (File letter : file.listFiles()) {
			map.put(letter.getName().substring(0, 1), letter);
		}
		return map;
	}

	public static String createAsciiText(String string, Map<String, File> map) {
		StringBuilder sb = new StringBuilder();
		for (char symbol : string.toCharArray()) {
			try (BufferedReader br = new BufferedReader(new FileReader(map.get(String.valueOf(symbol)).toString()))) {
				String text = "";
				for (; (text = br.readLine()) != null;) {
					sb.append(text).append(System.lineSeparator());
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return sb.toString();
	}

}
