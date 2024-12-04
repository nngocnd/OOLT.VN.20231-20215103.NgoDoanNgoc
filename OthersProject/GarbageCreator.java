package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Path;

public class GarbageCreator {
	
	public static String get(String filename) {
		try {
			byte [] inputByte = Files.readAllBytes(Path.of(filename));
			StringBuilder outputBuilder = new StringBuilder();
			for (byte b : inputByte) {
				outputBuilder.append((char)b);
			}
			return outputBuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "test.exe";
		long startTime, endTime;

		startTime = System.currentTimeMillis();
		String outputString = get(filename);
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
