package bubblePopperTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class LevelTest {
	
	@Before
	public void setup() throws RuntimeException{
			//put setup info here
		
	}
	
	@Test
	public void testBubbleCreate() throws RuntimeException{
		// Test for creating a bubble
		//Should create bubble of radius=RADIUS at coordinates supplied

	}
	
	@Test
	public void testBubbleMinBoundries() throws RuntimeException{
		//Test for minimum distance from walls and other bubbles
		//before creating bubble at locations
		
	}
	
	@Test
	public void testBubbleClicked() throws RuntimeException{
		//Test for bubble when user clicks it
		//Bubble should pop and user be awarded points
		
	}
	
	@Test
	public void testBubbleHitsWall() throws RuntimeException{
		//Test for when bubble hits a wall
		//Bubbble should pop and user loses life
		
	}
	
	@Test
	public void testBubbleHitsBubble() throws RuntimeException{
		//Test for when bubbble hits another bubble
		//Both bubbles should pop and user loses life twice
		
	}
	
	@Test
	public void testRandom() throws RuntimeException{
		//Test random points creation
		//Should not receive same points over and over again
		
	}
}
