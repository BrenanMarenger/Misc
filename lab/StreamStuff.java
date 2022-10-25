package lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class StreamStuff {

	public static int occurrencesOf(char aLetter, Reader input) throws IOException {
		int count = 0;
		int nextChar;
		while ((nextChar = input.read()) != -1) {
			if (aLetter == nextChar) {
				++count;
			}
		}
		return count;
	}

	public static int fileOccurencesOf(char aLetter, String fileName) throws IOException {
		Reader input = null;
		try {
			input = new FileReader(fileName);
			return occurrencesOf(aLetter, input);
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static int averageByteValue(String fileName) throws IOException {
		InputStream input = null;
		try {
			input = new FileInputStream(fileName);
			int count = 0;
			int sum = 0;
			int nextByte;
			while ((nextByte = input.read()) != -1) {
				++count;
				sum = sum + nextByte;
			}
			return sum / count;
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static void writeAllByteValue(String fileName) throws IOException {
		OutputStream output = null;
		try {
			output = new FileOutputStream(fileName);
			for (byte value = -128; value < 127; ++value) {
				if (value == 126) {
					System.out.println("almost there..");
				}
				output.write(value);
			}
			output.write(127);
		} finally {
			if (output != null) {
				output.close();
			}
		}
	}

	public static void joinWords(String[] words, String fileName) throws IOException {
		Writer output = null;
		try {
			output = new FileWriter(fileName);
			for (String eachWord : words) {
				output.write(eachWord);
				output.write(' ');
			}
		} finally {
			if (output != null) {
				output.close();
			}
		}

	}

	public static void copyFile(String sample, String copySample) throws IOException {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(sample);
			output = new FileOutputStream(copySample);
			int nextByte;
			while ((nextByte = input.read()) != -1) {
				output.write(nextByte);
			}
		} finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
		}
	}

//	public static void shoutToFile(String sample, String shoutSample) throws IOException {
//		InputStream input = null;
//		OutputStream output = null;
//		try {
//			input = new FileInputStream(sample);
//			output = new FileOutputStream(shoutSample);
//			int nextByte;
//			while ((nextByte = input.read()) != -1) {
//				output.write(nextByte.toUpperCase());
//			}
//		} finally {
//			if (input != null) {
//				input.close();
//			}
//			if (output != null) {
//				output.close();
//			}
//		}
//	}

}
