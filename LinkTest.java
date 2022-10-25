package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkTest {
	private Link<String> linkOne;
	private Link<String> linkTwo;
	private Link<Integer> linkIntegerOne;
	private Link<Integer> linkIntegerTwo;
	
	@BeforeEach
	void setUp() throws Exception {
		linkOne = new Link<String>("do");
		linkTwo = new Link<String>("re");
		linkIntegerOne = new Link<Integer>(1);
		linkIntegerTwo = new Link<Integer>(2);
	}

	@AfterEach
	void tearDown() throws Exception {
		linkOne = null;
		linkTwo = null;
		linkIntegerOne = null;
		linkIntegerTwo = null;
	}

	@Test
	void testConstructor() {
		// test Link of String
		assertTrue(linkOne.getItem().equals("do"));
		assertNull(linkOne.getNext());
		assertNull(linkOne.getPrev());
		// test Link of Integer
		assertTrue(1 == linkIntegerOne.getItem());
		assertNull(linkIntegerOne.getNext());
		assertNull(linkIntegerOne.getPrev());
	}
	
	@Test
	void testLinkOperations() {
		// Link of String
		linkOne.setNext(linkTwo);
		assertTrue(linkOne.getNext() == linkTwo);
		linkTwo.setPrev(linkOne);
		assertTrue(linkTwo.getPrev() == linkOne);
		// Link of Integer
		linkIntegerOne.setNext(linkIntegerTwo);
		assertTrue(linkIntegerOne.getNext() == linkIntegerTwo);
		linkIntegerTwo.setPrev(linkIntegerOne);
		assertTrue(linkIntegerTwo.getPrev() == linkIntegerOne);
	}

}
