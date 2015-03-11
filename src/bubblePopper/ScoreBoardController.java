package bubblePopper;

import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScoreBoardController extends Parent {

	private Group scoreBoard;
	private int highScore;
	private int score;
	private int difficulty; //Not sure if we want this as int or a string
	private List<Scores> allScores = new ArrayList<Scores>(); //Store all scores here
	
	
	//class to create object for allScores list
	public class Scores{
		private int scores;
		private int difficulty;
		
		Scores(int scores, int difficulty){
			this.scores=scores;
			this.difficulty = difficulty;
		}
	}
	
	ScoreBoardController(Group scoreBoard){
		this.scoreBoard = scoreBoard;
	}
	
	
	//Get Methods
	public int getHighScore(){
		return highScore;
		}
	
	public List<Scores> getAllScores(){
		return allScores;
	}
	
	//Set Methods
	public void setScore(int score){
		this.score = score;
	}
	
	public void setHighScore(int highScore){
		this.highScore = highScore;
		}
	
	
	public int comapreScore(int newScore){
		//setup method to compare current highScore to newScore
		return highScore;
	}
	
	//Adds score with difficulty setting to list
	public void addScoreToList(int score, int difficulty){
		allScores.add(new Scores(score, difficulty));
	}
}
