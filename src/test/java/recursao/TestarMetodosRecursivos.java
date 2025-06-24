package recursao;
import recursao.MetodosRecursivos;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestarMetodosRecursivos {
	
	private MetodosRecursivos mR;

	@Before
	public void setUp() {
		mR = new MetodosRecursivos();
	}

	@Test
	public void testCalculaSomaArray() {
		int[] arrai = {0};
		assertEquals(0, mR.calcularSomaArray(arrai, 0));
	}

	@Test 
	public void testCalculaFatorial() {
		assertEquals(mR, mR);
	}

	@Test
	public void testCalculaFibonacci() {

	}

	@Test
	public void testCalculaCountNullArray() {

	}

	@Test
	public void testCalculaPA() {

	}

	@Test
	public void testCalculaPG() {

	}

	}
