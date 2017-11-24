package com.gmail.agentup;

import java.io.*;

public class FileWork {
	public static void copyFile(File fileIn, File fileOut) throws IOException {
		if (fileIn == null || fileOut == null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		try (InputStream in = new FileInputStream(fileIn); OutputStream out = new FileOutputStream(fileOut)) {
			byte[] buffer = new byte[1024 * 1024];
			int readByte = 0;
			for (; (readByte = in.read(buffer)) > 0;) {
				out.write(buffer, 0, readByte);
			}
		} catch (IOException e) {
			throw e;
		}
	}
}
