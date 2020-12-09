import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFacteursPremiers {
	
	private DecompositionEnFacteursPremiers d;
	
	@Before
	public void setUp() throws Exception {
		this.d = new DecompositionEnFacteursPremiers();
	}
	
	@After
	public void tearDown() throws Exception {
		this.d = null;
	}
	
	@Test
	public void UnNapasDeFacteursPremiers() {
		assertEquals(Arrays.asList(), d.compute(1));
	}
	
	@Test
	public void DeuxAUnFacteurPremierDeux() {
		assertEquals(Arrays.asList(2), d.compute(2));
	}
	
	@Test
	public void DeuxAUnFacteurPremierTrois() {
		assertEquals(Arrays.asList(3), d.compute(3));
	}
	
	@Test
	public void DeuxAUnFacteurPremierQuatre() {
		assertEquals(Arrays.asList(2,2), d.compute(4));
	}
	
	@Test
	public void DeuxAUnFacteurPremierCinq() {
		assertEquals(Arrays.asList(5), d.compute(5));
	}
	
	@Test
	public void DeuxAUnFacteurPremierSix() {
		assertEquals(Arrays.asList(2,3), d.compute(6));
	}
	
	@Test
	public void DeuxAUnFacteurPremier42t() {
		assertEquals(Arrays.asList(2,3,7), d.compute(42));
	}
}
