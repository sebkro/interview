package com.cgi.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class MapTest {

	@Test
	void itShouldCalc() {
		//given
		Map<Integer, Object> inner2 = new HashMap<>();
		inner2.put(1, 2);
		inner2.put(2, 5);

		Map<Integer, Object> inner1 = new HashMap<>();
		inner1.put(1, 2);
		inner1.put(2, 5);
		inner1.put(3, inner2);

		Map<Integer, Object> outer = new HashMap<>();
		outer.put(1, 2);
		outer.put(2, 3);
		outer.put(3, inner1);

		//when
		int result = MapCalc.calc(outer);

		//then
		assertEquals(152, result);
	}
}
