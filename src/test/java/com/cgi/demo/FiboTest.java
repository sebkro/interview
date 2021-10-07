package com.cgi.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FiboTest {

	@Test
	void itShouldCalcFibo1() {
		int result = Fibo.calc(1);

		assertEquals(0, result);
	}

	@Test
	void itShouldCalcFibo2() {
		int result = Fibo.calc(2);

		assertEquals(1, result);
	}

	@Test
	void itShouldCalcFibo3() {
		int result = Fibo.calc(3);

		assertEquals(1, result);
	}

	@Test
	void itShouldCalcFibo4() {
		int result = Fibo.calc(4);

		assertEquals(2, result);
	}

	@Test
	void itShouldCalcFibo10() {
		int result = Fibo.calc(10);

		assertEquals(34, result);
	}
}