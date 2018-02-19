package zad1;

import static org.junit.Assert.*;

import org.junit.*;

public class NWDTest {
	
	NWD nwdTest;

	@Before
	public void setUp(){		
		 nwdTest = new NWD();
	}
	@Test
	public void test() {
		int nwd1 = 2;
		assertEquals(nwdTest.nwd(4,2),nwd1);
	}
	@Test
	public void test2(){
		int nwd2 = -5;
		assertEquals(nwdTest.nwd(-10,-5),nwd2);
	}
	@Test
	public void test3(){
		int nwd3 = 7;
		assertEquals(nwdTest.nwd(7,0),nwd3);
	}
	
	@After
	public void tearDown(){
		nwdTest = null;
	}

}
