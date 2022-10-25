package lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoxTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWordBox() {
		String word = "hello";
		Box<String> wordBox = new Box<String>(); //creates and new instance of the object
		wordBox.setContents(word);
		assertTrue(wordBox.getContents().equals("hello"));
		
	}
	
	@Test
	void testVocabBox() {
		String[] vocab = {"one", "fish", "two"};
		Box<String[]> vocabularyBox = new Box<String[]>();
		vocabularyBox.setContents(vocab);
		assertTrue(vocabularyBox.getContents() == vocab);
	}
	@Test
	void testCharacterBox() {
		Box<Character> characterBox = new Box<Character>();
		characterBox.setContents('a');
		assertTrue('a' == characterBox.getContents());
	}

}
