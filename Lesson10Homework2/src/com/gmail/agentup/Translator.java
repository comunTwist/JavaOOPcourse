package com.gmail.agentup;

import java.io.*;
import java.util.*;

public class Translator {
	private File fileIn;
	private File fileOut;
	private File translate;
	private Map<String, String> lexicon = new HashMap<>();

	public Translator(File fileIn, File fileOut, File translate) {
		super();
		this.fileIn = fileIn;
		this.fileOut = fileOut;
		this.translate = translate;
	}

	public File getFileIn() {
		return fileIn;
	}

	public void setFileIn(File fileIn) {
		this.fileIn = fileIn;
	}

	public File getFileOut() {
		return fileOut;
	}

	public void setFileOut(File fileOut) {
		this.fileOut = fileOut;
	}

	public Map<String, String> getLexicon() {
		return lexicon;
	}

	public void setLexicon(Map<String, String> lexicon) {
		this.lexicon = lexicon;
	}

	public String readEnText() {
		StringBuilder sbIn = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				sbIn.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return sbIn.toString();
	}

	public void writeUaText() {
		readTranslate();
		StringBuilder sbOut = new StringBuilder();
		for (String word : readEnText().split("[ " + System.lineSeparator() + "]")) {
			if (lexicon.get(word) != null) {
				sbOut.append(lexicon.get(word)).append(" ");
			} else {
				Scanner sc = new Scanner(System.in);
				System.out.println("Input translate \"" + word + "\" (UA):");
				String ua = sc.nextLine();
				newWord(word, ua);
				sbOut.append(lexicon.get(word)).append(" ");
			}
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
			bw.write(sbOut.toString());
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public void newWord(String key, String value) {
		readTranslate();
		lexicon.put(key, value);
		saveTranslate();
	}

	public void saveTranslate() {
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(translate))) {
			oos.writeObject(lexicon);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Map<String, String> readTranslate() {
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream(translate))) {
			lexicon = (Map) ois.readObject();
			return lexicon;
		} catch (Exception e) {
			return null;
		}
	}
}
