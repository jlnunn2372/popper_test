package bubblePopperTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameControllerTest {
	
	@Before
	public static void setup() throws RuntimeException{
		//put setup info here
		
	}
	
	@Test
	public void testEasyDifficultySettings() throws RuntimeException{
		//Test if setting changed correctly based on difficulty selected
		//Settings should match those that correspond to chosen difficulty
	
	}
	
	@Test
	public void testNormalDifficultySettings() throws RuntimeException{
		//Test if setting changed correctly based on difficulty selected
		//Settings should match those that correspond to chosen difficulty
	
	}
	
	@Test
	public void testHardDifficultySettings() throws RuntimeException{
		//Test if setting changed correctly based on difficulty selected
		//Settings should match those that correspond to chosen difficulty
		
	}
	
	@Test
	public void testLifeDecrease() throws RuntimeException{
		//test for life decreasing when bubbles poped
		//life should decrease only if bubbles pop due to hitting other bubbles
		//hitting the wall
	
	}
	
	@Test
	public void testIncreaseScore() throws RuntimeException{
		//give conditions for bubble poped, should increase score properly
	}
	
	@Test
	public void testLifePointstoZero() throws RuntimeException{
		//game should end
	}
	
	@Test
	public void testUserEndsGame() throws RuntimeException{
		//test for when user ends game manually
	}

}
