package lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HighlyUnstableTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGoBoom() {
		try {
		HighlyUnstable.goBoom();
		fail("Should have thrown an exception");
		} catch(Exception ex) {
			System.out.println("Caught an expected exception");
		}
	}
	
	@Test
	void testChaosMagicBomb() {
		try {
			HighlyUnstable.probabilityHex(false);
			System.out.println("the bomb didn't go off");
			HighlyUnstable.probabilityHex(true);
			fail("Should have thrown an exception");
			
		}catch(ChaosMagicBomb ex) {
			System.out.println("Caught an exception");
		}catch(Exception ex) {
			System.out.println("unknown exception");
		} finally {
			System.out.println("Finished");
		}
		
	}

}
