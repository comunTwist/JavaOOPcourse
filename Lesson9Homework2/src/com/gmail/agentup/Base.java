package com.gmail.agentup;

import java.io.*;

public class Base {
	public static void saveObject(Object obj, File file) {
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Object readObject(File file) {
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (Exception e) {
			return null;
		}
	}
}
