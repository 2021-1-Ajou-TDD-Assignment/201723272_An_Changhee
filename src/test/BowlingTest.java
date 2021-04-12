package test;

import static org.junit.Assert.assertEquals;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import BowlingGame.Game;

public class BowlingTest {
	private Game g;
	
	@Test
	public void testGutterGame() {
		Game g = new Game();
		for (int i=0; i<20; i++)
			g.roll(0);
		assertEquals(0,g.score());
	}
	
	
}
