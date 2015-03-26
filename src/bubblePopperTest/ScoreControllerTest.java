package bubblePopperTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import bubblePopper.ScoreBoardController;
import static org.junit.Assert.*;

public class ScoreControllerTest {
	private static ScoreBoardController scoreBoardController;
	
	@Before
	public void setup() {
	scoreBoardController = new ScoreBoardController(null);
	throw new RuntimeException();
	}
	
	//Some test classes for GUI will be auto-created using WindowTester
	
	@Test
	public void testScoreboardCreate() {
		//test for if scoreboard is created when button to view is clicked
		throw new RuntimeException();
	}
	
	@Test
	public void testAddLastScore() {
		//after game ends, should add new score to scoreboard
		//scoreBoardController.addScoreToList(10, 1);
		//assertSame((10,1), ScoreBoardController.getAllScores());
		throw new RuntimeException();
	}
	
	@Test
	public void testUpdateHighScore() {
		
		scoreBoardController.setHighScore(10);
		int newScoreLower = 5;
		int newScoreHigher = 20;
		scoreBoardController.comapreScore(newScoreLower);
		assertEquals("Should be 10", 10, scoreBoardController.getHighScore() );
		
		scoreBoardController.comapreScore(newScoreHigher);
		assertEquals("Should be 20",20, scoreBoardController.getHighScore() );
		
	}
	 
}
