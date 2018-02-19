package zad1;

import static org.junit.Assert.*;

import org.junit.*;

public class NWWTest {
	
	NWW nwwTest;

	@Before
	public void setUp(){		
		 nwwTest = new NWW();
	}
	@Test
	public void test() {
		int nww1 = 4;
		assertEquals(nwwTest.nww(4,2),nww1);
	}
	@Test
	public void test2(){
		int nww2 = 10;
		assertEquals(nwwTest.nww(-10,-5),nww2);
	}
	@Test
	public void test3(){
		int nwd3 = 0;
		assertEquals(nwwTest.nww(7,0),nwd3);
	}
	
	@After
	public void tearDown(){
		nwwTest = null;
	}
}
