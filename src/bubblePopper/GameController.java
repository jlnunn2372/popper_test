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
import java.util.Random;

public class GameController{
	
	private BorderPane root; //Instance of scene game node
	private int lifePoints;  //Users life points
	private int score; //Users Score
	private int difficulty;
	private Level level;
	
	GameController(BorderPane game){
		this.root = game;
	}
	
	
	public void setScore(int score) {
        this.score = score;
    }
	
	public int getScore(){
		return score;
	}
	
	public int getLifePoints(){
		return lifePoints;
	}
	
	public int getDifficulty(){
		return difficulty;
	}
	
	public void setDifficulty(){
		this.difficulty = difficulty;
	}
	
	public void decreaseLifePoints(){
		lifePoints--;
	}
	
	public void gameStart(){
		lifePoints=10;
		score = 0;
		difficulty = 1; //Need to make this set by user with default of 1(easy)
		changeState(1);
	}
	
	


	public void increaseScore(){
		
	}

	public void changeState(int i) {
		Group myGroup = new Group();
		root.setCenter(new Level(0));
		//root.setCenter(myGroup);

		//border.setCenter();
	}
	
	

}
