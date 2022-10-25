package lab;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StreamStuffTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testStringReader() {
		Reader input = new StringReader("hello");
		try {
			int answer = StreamStuff.occurrencesOf('l', input);
			assertTrue(answer == 2);
		} catch (IOException ex) {
			fail("Caught an unexpected IOException.");
		}
	}

	@Test
	void testFileReader() {
		try {
			int answer = StreamStuff.fileOccurencesOf('z', "sample.txt");
			assertTrue(answer == 1);
		} catch (IOException ex) {
			fail("Caught an unexpected IOException.");
		}
	}

	@Test
	void testInputStream() {
		try {
			int answer = StreamStuff.averageByteValue("sample.txt");
			assertTrue(answer == 93);
		} catch (IOException ex) {
			fail("Caught an unexpected IOException.");
		}

	}

	@Test
	void testOutputStream() throws IOException {
		InputStream input = null;
		try {
			StreamStuff.writeAllByteValue("byteValues.dat");
			input = new FileInputStream("byteValues.dat");
			List<Byte> data = new ArrayList<Byte>();
			int nextByte;
			while ((nextByte = input.read()) != -1) {
				data.add((byte) nextByte);
			}
			assertTrue(data.size() == 256);
			assertTrue(data.get(0) == -128);
			assertTrue(data.get(255) == 127);

		} catch (IOException ex) {
			fail("Caught an unexpected IOException.");
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	@Test
	void testWriter() {
		try {
			String[] words = { "Read", "the", "fine", "manual." };
			StreamStuff.joinWords(words, "readme.txt");
		} catch (IOException ex) {
			fail("Caught an unexpected IOException");
		}
	}

	@Test
	void testFileCopy() {
		try {
			StreamStuff.copyFile("sample.txt", "copyOfSample.txt");
		} catch (IOException ex) {
			fail("Caught an unexpected IOException");
		}
	}

//	@Test
//	void testShoutToFile() {
//		try {
//			StreamStuff.shoutToFile("sample.txt", "loudSample.txt");
//		} catch (IOException ex) {
//			fail("Caught an unexpected IOException");
//		}
//
//	}

	@Test
	void testScanPrimitiveValues() {
		String rawData = "  3.14159  false  42  2.7  ";
		Scanner input = null;
		try {
			input = new Scanner(rawData);
			assertTrue(input.hasNext());
			assertTrue(input.nextDouble() == 3.14159);
			assertTrue(input.hasNext());
			assertFalse(input.nextBoolean());
			assertTrue(input.hasNext());
			assertTrue(input.nextInt() == 42);
			assertTrue(input.hasNext());
			assertTrue(input.nextFloat() == 2.7f);
			assertFalse(input.hasNext());

		} finally {
			if (input != null) {
				input.close();
			}

		}
	}

	@Test
	void testSimpleReadWords() {
		List<String> words = new ArrayList<String>();
		Scanner input = null;
		try {
			input = new Scanner(new FileInputStream("sample.txt"));
			while (input.hasNext()) {
				words.add(input.next());
			}
			assertTrue(words.size() == 9);
			assertTrue("The".equals(words.get(0)));
			assertTrue("dog.".equals(words.get(8)));
		} catch (IOException ex) {
			fail("Caught an unexpected IOException");
		} finally {
			if (input != null) {
				input.close();
			}

		}
	}

	@Test
	void testUniqueWords() {
		Set<String> uniqueWords = new HashSet<String>();
		Scanner input = null;
		try {
			input = new Scanner(new FileInputStream("manywords.txt"));
			input.useDelimiter("[ \r\n\t,!\\.\\?\\-]+");
			while(input.hasNext()) {
				uniqueWords.add(input.next().toLowerCase());
			}
			assertTrue(uniqueWords.size() == 4);
		} catch (IOException ex) {
			fail("Caught an unexpected IOException");
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
