package com.cgi.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PairSumTest {

	@Test
	void itShouldBuildTheSum() {
		//given
		List<Integer> l = List.of(1,2,3,4,5,6,7);

		//when
		 List<Integer> result = PairSum.calcSums(l);

		 //then
		assertEquals(List.of(3,7,11,7), result);

	}
}
