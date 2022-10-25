import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class genericLinkTest {
	package linkedlist;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
package LinkedList;

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
			//test link of string
			assertTrue(linkOne.getItem().equals("do"));
			assertNull(linkOne.getNext());
			assertNull(linkOne.getPrev());
			//test link of Integer
			assertTrue(1 == linkIntegerOne.getItem());
			assertNull(linkIntegerOne.getNext());
			assertNull(linkIntegerOne.getPrev());
		}

		@Test
		void testLinkOperations() {
			//link of string
			linkOne.setNext(linkTwo);
			assertTrue(linkOne.getNext() == linkTwo);
			linkTwo.setPrev(linkOne);
			assertTrue(linkTwo.getPrev() == linkOne);
			//link of integer
			linkIntegerOne.setNext(linkIntegerTwo);
			assertTrue(linkIntegerOne.getNext() == linkIntegerTwo);
			linkIntegerTwo.setPrev(linkIntegerOne);
			assertTrue(linkIntegerTwo.getPrev == linkIntegerOne);
		}

	}
