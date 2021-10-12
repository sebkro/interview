package com.cgi.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ListReverseTest {

	@Test
	void itShouldReverseList() {
		//given
		List<Integer> l = List.of(1,2,3,4,5,6,7);

		//when
		 List<Integer> result = ReverseList.reverse(l);

		 //then
		assertEquals(List.of(7,6,5,4,3,2,1), result);

	}
}
