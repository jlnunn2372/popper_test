package bubblePopper;

import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
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

public class Main extends Application {

    private ArrayList<ScaleTransition> scaleTransition;


    public void init(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        BorderPane root = new BorderPane();
        ToolBar toolbar = new ToolBar();
        //toolbar.setLayoutX(100);
        toolbar.autosize();
        //HBox statusbar = new HBox();
        //Node appContent = new AppContentNode();
        root.setTop(toolbar);
        //Scene scene = new Scene(root, 1200, 900, Color.GRAY);
        Group myGroup = new Group();
        root.setCenter(myGroup);

        scaleTransition = new ArrayList<ScaleTransition>();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt((int) scene.getWidth());
            int y = rand.nextInt((int) scene.getHeight());
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            Circle circle = new Circle(25, 25, 25);
            circle.setCenterX(x);
            circle.setCenterY(y);
            circle.setFill(Color.ORANGE);

            ScaleTransition myTransition = ScaleTransitionBuilder.create()
                    .node(circle)
                    .duration(Duration.seconds(4))
                    .toX(3)
                    .toY(3)
                    .cycleCount(Timeline.INDEFINITE)
                    .autoReverse(true)
                    .build();

            scaleTransition.add(i,myTransition);

            //int rot = rand.nextInt(360);
            //text.setFill(Color.rgb(red, green, blue, .99));
            //text.setRotate(rot);
            myGroup.getChildren().add(circle);
        }


        //Scene scene = new Scene(root, 1200, 900, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();


        primaryStage.show();

    }

    public void play() {
        for (ScaleTransition transitions:scaleTransition){
            transitions.play();
        }
    }

    @Override public void stop() {
        for (ScaleTransition transitions:scaleTransition){
            transitions.stop();
        }
    }

    public double getSampleWidth() { return 150; }

    public double getSampleHeight() { return 150; }

    @Override public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
        play();
    }
    public static void main(String[] args) { launch(args); }



}
