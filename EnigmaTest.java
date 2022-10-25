package enigma;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnigmaTest {

	private byte[] plainText = { 0x3C, 0x6A, (byte) 0xF1 };
	private byte[] cryptText = { (byte) 0xC3, (byte) 0xFF, (byte) 0xA9, 0x32 };
	private byte key = (byte) 0xC3;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEncryption() throws IOException {
		InputStream input = null;
		ByteArrayOutputStream output = null;
		try {
			input = new ByteArrayInputStream(plainText);
			output = new ByteArrayOutputStream();
			Enigma.encrypt(key, input, output);
			byte[] data = output.toByteArray();
			assertTrue(data.length == 4);
			assertTrue(data[0] == key);
			assertTrue(data[1] == cryptText[1]);
			assertTrue(data[2] == cryptText[2]);
			assertTrue(data[3] == cryptText[3]);

		} finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
		}
	}

	@Test
	void testDecryption() throws IOException {
		InputStream input = null;
		ByteArrayOutputStream output = null;
		try {
			input = new ByteArrayInputStream(cryptText);
			output = new ByteArrayOutputStream();
			Enigma.decrypt(input, output);
			byte[] data = output.toByteArray();
			assertTrue(data.length == 3);
			assertTrue(data[0] == plainText[0]);
			assertTrue(data[1] == plainText[1]);
			assertTrue(data[2] == plainText[2]);
		} finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
		}

	}
	
	@Test
	void testDecryptfile() throws IOException {
		Enigma.decryptFile("crypt.txt", "novel.txt");
		Reader input = null;
				try {
					input = new FileReader("novel.txt");
					assertTrue('O' ==(char)input.read());
					assertTrue('n' == (char)input.read());
				} finally {
					if(input != null) {
						input.close();
					}
				}
		//Refresh the project and see if you can read the novel
		
	}
	
	@Test
	void testVocabulary() throws IOException {
		List<String> vocab = Enigma.vocabulary("novel.txt");
		assertTrue(vocab.size() == 70);
		assertTrue(vocab.get(0).equals("a"));
		assertTrue(vocab.get(69).equals("woke"));
	}

}
