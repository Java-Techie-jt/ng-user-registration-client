package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DeleteFile {
	public static void main(String[] arg) {
		String source = "C:\\Users\\ACTURIS\\lib\\00224C05.pdf";
		String destination = "C:\\Users\\ACTURIS\\lib\\Dest\\vijay.pdf";
		if (!fileMove(source, destination)) {
			System.out.println("Unable to move to ICC");

		}
File file = new File("C:\\Users\\ACTURIS\\lib\\Dest");
		if (file == null) {
			System.out.println("null");
		}
		try {
			if (file.isDirectory()) {
//				cleanDirectory(file);
				System.out.println("this is a directory");
			}
		} catch (final Exception ignored) {
			ignored.printStackTrace();
		}

		try {
			System.out.println("File Deleted:"+ file.delete());
		} catch (final Exception ignored) {
			ignored.printStackTrace();
		}

	}

	public static Boolean fileMove(String source, String destination) {
		File Source = new File(source);
		File destiNation = new File(destination);
		try {
			FileUtils.copyFile(Source, destiNation);
			// return FileUtils.deleteQuietly(Source);

		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println(e);
			return false;
		}
		return true;
	}
}
