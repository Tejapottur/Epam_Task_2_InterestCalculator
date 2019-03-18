import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestcalculaterTest {

	@Test
	void testSimple() {
		Interestcalculator a=new Interestcalculator();
		assertEquals(1,a.simple(1, 1, 1));
	}

	@Test
	void testCompound() {
		Interestcalculator a=new Interestcalculator();
		assertEquals(2,a.compound(1, 1, 1, 1));
	}

}
