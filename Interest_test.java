package interests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Interest_test {

	@Test
	public void test() {
		Interest test = new Interest();
		assertEquals(400, test.simpleInterest(10000, 2, 2),0.0);
		assertEquals(4, test.simpleInterest(400, 1, 1),0.0);
		assertEquals(615.99, test.compoundInterest(10000, 3, 2), 0.0);
	}

}
