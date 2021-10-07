package com.cgi.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ListTest {

	@Test
	void itShouldCalc() {
		//given
		List<Integer> l = List.of(1,2,3,4,5,6,7,8);

		//when
		int result = ListCalc.calulate(l);

		//then
		assertEquals(4 + 16 + 36 + 64, result);
	}
}
