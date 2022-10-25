package enigma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Enigma {

	public static void encrypt(byte key, InputStream input, OutputStream output) throws IOException {
		output.write(key);
		int nextByte;
		while ((nextByte = input.read()) != -1) {
			output.write(key ^ nextByte);
		}
		output.flush();
	}

	public static void decrypt(InputStream input, OutputStream output) throws IOException {
		byte key = (byte) input.read();
		int nextByte;
		while ((nextByte = input.read()) != -1) {
			output.write(key ^ nextByte);
		}
		output.flush();
	}

	public static void decryptFile(String inputFile, String outputFile) throws IOException {
		FileReader input = null;
		FileWriter output = null;

		try {
			input = new FileReader(inputFile);
			output = new FileWriter(new File(outputFile));
			byte key = (byte) input.read();
			int nextByte;

			while ((nextByte = input.read()) != -1) {
				output.write(key ^ nextByte);
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

	public static List<String> vocabulary(String output) throws IOException {
		List<String> vocabList = null;
		Scanner input = null;
		try {
			Set<String> vocab = new HashSet<String>();
			input = new Scanner(new FileInputStream(output));
			input.useDelimiter("[ \r\n\t,!\\.\\?\\-]+");

			while (input.hasNext()) {
				vocab.add(input.next().toLowerCase());
			}
			vocabList = new ArrayList<String>(vocab);
			vocabList.sort(null);
		} finally {
			if (input != null) {
				input.close();
			}
		}

		return vocabList;
	}
}
