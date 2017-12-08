//Сделать ф-ю ручного наполнения словаря и возможность его
//сохранения на диск.

package com.gmail.agentup;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File en = new File("English.in");
		File ua = new File("Ukrainian.out");
		File to = new File("Translator.to");
		Translator enToUa = new Translator(en, ua, to);
		enToUa.writeUaText();
	}

}
