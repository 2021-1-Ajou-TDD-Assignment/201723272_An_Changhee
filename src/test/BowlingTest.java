package test;

import static org.junit.Assert.assertEquals;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import BowlingGame.Game;

public class BowlingTest {
	private Game g;
	
	@Before
	public void setUp() {
		g = new Game();
	}
	
	private void rollMany(int n, int pins) {
		for (int i=0; i<n; i++)
			g.roll(pins);
	}
	
	@Test
	public void testGutterGame() {
		int n = 20;
		int pins = 0;
		rollMany(n,pins);
		assertEquals(0,g.score());
	}

	@Test
	public void testAllOnes() {
		rollMany(20,1);
		assertEquals(20,g.score());
	}
	
	
	@Test public void testOneSpare() {
		rollSpare();
		g.roll(3);
		rollMany(17,0);
		assertEquals(16,g.score());
	}

	private void rollSpare() {
		g.roll(5);
		g.roll(5);
		
	}
	
	
	
}
