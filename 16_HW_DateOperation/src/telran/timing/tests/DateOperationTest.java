package telran.timing.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.timing.model.DateOperation;

class DateOperationTest {
	String[] dates = { "2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05" };
	String[] expecteds = { "1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05" };

	@Test
	void testSortStringDates() {
		String[] actuals = DateOperation.sortStringDates(dates);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	void testGetAge() {
		assertEquals(59, DateOperation.getAge("12/04/1961"));
		assertEquals(60, DateOperation.getAge("1961-01-10"));
	}

}
