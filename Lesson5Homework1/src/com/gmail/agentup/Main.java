//Напишите программу которая скопирует файлы (с заранее
//определенным расширением — например только doc) из
//каталога источника в каталог приемник

package com.gmail.agentup;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File dirOut = new File("dirOut");
		File dirIn = new File("dirIn");
		dirOut.mkdirs();
		dirIn.mkdirs();

		File fileOne = new File(dirOut.getName() + "/a.txt");
		File fileTwo = new File(dirOut.getName() + "/b.doc");
		File fileThree = new File(dirOut.getName() + "/c.txt");
		File fileFour = new File(dirOut.getName() + "/d.pdf");
		try {
			fileOne.createNewFile();
			fileTwo.createNewFile();
			fileThree.createNewFile();
			fileFour.createNewFile();
		} catch (IOException e) {
			System.out.println("Error");
		}
		copyFileExt("txt", dirOut, dirIn);

	}

	public static void copyFileExt(String ext, File dirOut, File dirIn) {
		for (String string : dirOut.list()) {
			if (string.substring(string.lastIndexOf(".") + 1).equals(ext)) {
				try {
					FileWork.copyFile(new File(dirOut.getName() + "/" + string),
							new File(dirIn.getName() + "/" + string));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
