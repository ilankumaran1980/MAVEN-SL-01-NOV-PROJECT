package sl.vcs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MyCalcTest {
	
	
	MyCalc calc = new MyCalc();

	@Test
	public void test_sum() {
		
		assertEquals(30, calc.sum(20, 10));
		
	}
	
	@Test
	public void test_diff() {
		
		assertEquals(10, calc.diff(20, 10));
		
	}

}
