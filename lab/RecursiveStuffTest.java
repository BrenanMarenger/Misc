package lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursiveStuffTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testStars() {
		System.out.println("Start testStars()");
		RecursiveStuff.stars(3);
		System.out.println();
		RecursiveStuff.stars(6);
		System.out.println();

	}
	
	@Test
	void testUpTriangle() {
		System.out.println("Start upTriangle()");
		RecursiveStuff.downTriangle(8);
		System.out.println();
		RecursiveStuff.upTriangle(8);
		System.out.println();
		
	}

}
