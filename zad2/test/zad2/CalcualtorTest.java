package zad2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zad2.Calculator;

public class CalcualtorTest {
	Calculator calcTest;

	@Before
	public void setUp(){		
		calcTest = new Calculator();
	}
	@Test
	public void testAdd1() {
		assertEquals(calcTest.add(3, 4),7);
	}
	@Test
	public void testAdd2() {
		assertEquals(calcTest.add(-6, 4),-2);
	}
	@Test
	public void testSub1() {
		assertEquals(calcTest.sub(8, 4),4);
	}
	@Test
	public void testSub2() {
		assertEquals(calcTest.sub(0, 4),-4);
	}
	@Test
	public void testMulti1() {
		assertEquals(calcTest.multi(3, 4),12);
	}
	@Test
	public void testMulti2() {
		assertEquals(calcTest.multi(-3, 4),-12);
	}
	@Test
	public void testDiv1() {
		assertEquals(calcTest.div(12, 4),3);
	}
	@Test
	public void testDiv2() {
		assertEquals(calcTest.div(-12, -4),3);
	}
	@Test
	public void testGreater1() {
		assertEquals(calcTest.greater(6, 4),true);
	}
	@Test
	public void testGreater2() {
		assertEquals(calcTest.greater(2, 4),false);
	}
	@Test
	public void testGreater3() {
		assertEquals(calcTest.greater(0, 0),false);
	}
	@Test
	public void testLess1() {
		assertEquals(calcTest.less(3, 4),true);
	}
	@Test
	public void testLess2() {
		assertEquals(calcTest.less(8, 4),false);
	}
	@Test
	public void testLess3() {
		assertEquals(calcTest.less(0, 0),false);
	}
	@Test
	public void testEq1() {
		assertEquals(calcTest.equality(3, 3),true);
	}
	@Test
	public void testEq2() {
		assertEquals(calcTest.equality(4, 3),false);
	}
	@Test
	public void testEq3() {
		assertEquals(calcTest.equality(-3, -3),true);
	}
	@Test
	public void testDivNotNull(){
		assertNotNull(calcTest.div(8, 2));
	}
	
	@After
	public void tearDown(){
		calcTest = null;
	}

}
