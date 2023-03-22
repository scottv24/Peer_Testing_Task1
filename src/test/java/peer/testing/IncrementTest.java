package peer.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class IncrementTest {

	@Test
	void test() {
		Increment inc = new Increment(0);
		int expected = 1;
		int actual = inc.increment();
		assertEquals(expected,actual);
	}

}
