package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExampleTest {
	private Example example;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void init() {
		this.example = new Example();
	}

	@Test
	public void negatePositive() {
		int value = 42;
		int result;
		try {
			result = example.negate(value);
			assertEquals(-42, result);
		} catch (Exception e) {
			fail("Unexpected exception negating a normal value");
		}
	}

	@Test
	public void negateZero() {
		int value = 0;
		int result;
		try {
			result = example.negate(value);
			assertEquals(value, result);
		} catch (Exception e) {
			fail("Unexpected exception negating zero");
		}
	}

	@Test
	public void increasePositive() {
		int value = 42;
		int result = example.increase(value);

		assertEquals(43, result);
	}

	@Test
	public void increaseMax() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Can't increase MAX_VALUE");

		int value = Integer.MAX_VALUE;
		example.increase(value);
	}

	@Test
	public void negateMin() throws Exception {
		thrown.expect(Exception.class);
		thrown.expectMessage("Can't negate MIN_VALUE");

		int value = Integer.MIN_VALUE;
		example.negate(value);
	}

	@Test
	public void largestPlain() {
		int[] values = new int[] { 42, 12, 98, 3 };
		int result = example.largestValue(values);

		assertEquals(98, result);
	}

	@Test
	public void largestNull() {
		int[] values = null;

		thrown.expect(IllegalArgumentException.class);

		example.largestValue(values);
	}

	@Test
	public void largestEmpty() {
		thrown.expect(IllegalArgumentException.class);
		int[] values = new int[] {};

		example.largestValue(values);
	}

}
