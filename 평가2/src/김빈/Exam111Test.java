	package ±èºó;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exam111Test {
	
	@Test
	void testAdd() {
		Exam111 Exam111 = new Exam111();
		assertEquals(3, Exam111.add(1,2));
	}

	@Test
	void testSub() {
		Exam111 Exam111 = new Exam111();
		assertEquals(-1.0, Exam111.sub(1,2));
	}

	@Test
	void testGob() {
		Exam111 Exam111 = new Exam111();
		assertEquals(2, Exam111.gob(1,2));
	}

	@Test
	void testDiv() {
		Exam111 Exam111 = new Exam111();
		assertEquals(0.5, Exam111.div(1,2));
	}

	@Test
	void testTf() {
		Exam111 Exam111 = new Exam111();
		assertEquals(true, Exam111.tf(1,2));
	}

}
