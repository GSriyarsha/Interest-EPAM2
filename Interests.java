/**
 * 
 */
package interests;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Sriyarsha
 *
 */
public class Interests {

	/**
	 * Test method for {@link interests.Interest#simpleInterest(int, int, int)}.
	 */
	@Test
	public void testSimpleInterest() {
		Interest test = new Interest();
		double output = test.simpleInterest(1000, 10, 1);
		assertEquals(100.0, output);
	}

	/**
	 * Test method for {@link interests.Interest#compounInterest(int, int, int)}.
	 */
	@Test
	public void testCompounInterest() {
		Interest t = new Interest();
		double o = t.compoundInterest(1000, 10, 1);
		assertEquals(11000.0, o);
	}

}
