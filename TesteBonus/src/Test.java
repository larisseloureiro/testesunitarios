import static org.junit.Assert.*;

public class Test {
	
	@org.junit.Test
	public void testarDivisorPorTres() throws Exception {
		int fizz = 6 % 3;
		assertEquals(0,fizz,0.0001);
	}
	
	@org.junit.Test
	public void testarDivisorPorTresECinco() throws Exception {
		int fizzbuzz = 30;
		int x = fizzbuzz % 3;
		int y = fizzbuzz % 5;
		
		assertEquals(0, x, 0.0001);
		assertEquals(0, y,0.0001);
	}
	
	@org.junit.Test
	public void testarDivisorPorCinco() throws Exception {
		int buzz = 15 % 5;
		assertEquals(0,buzz,0.0001);
	}

}
