package bubblePopper;

import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.shape.Circle;

import java.util.Stack;

/**
 * Created by brian on 3/12/2015.
 */
public class Level extends Parent {
    private Stack<Circle> circles;
    private Timeline timeline;

    public Level(int Difficulty){

    }

    private void initializeLevelTimeline(){

    }

    public void start(){
        GifCreator.startRecording();


    }

    public void stop(){
        GifCreator.stopRecording();
    }

    public void initializeLevel(){

    }

    private void incrementScore(){

    }

    private int calcScoreRatio(Circle myCirle){
        return 0;
    }
    //    public void init(Stage primaryStage) throws Exception {
//        // TODO Auto-generated method stub
//
//        BorderPane root = new BorderPane();
//        ToolBar toolbar = new ToolBar();
//        //toolbar.setLayoutX(100);
//        toolbar.autosize();
//        //HBox statusbar = new HBox();
//        //Node appContent = new AppContentNode();
//        root.setTop(toolbar);
//        //Scene scene = new Scene(root, 1200, 900, Color.GRAY);
//        Group myGroup = new Group();
//        root.setCenter(myGroup);
//
//        scaleTransition = new ArrayList<ScaleTransition>();
//        Scene scene = new Scene(root, 300, 250, Color.WHITE);
//        Random rand = new Random(System.currentTimeMillis());
//        for (int i = 0; i < 100; i++) {
//            int x = rand.nextInt((int) scene.getWidth());
//            int y = rand.nextInt((int) scene.getHeight());
//            int red = rand.nextInt(255);
//            int green = rand.nextInt(255);
//            int blue = rand.nextInt(255);
//            Circle circle = new Circle(25, 25, 25);
//            circle.setCenterX(x);
//            circle.setCenterY(y);
//            circle.setFill(Color.ORANGE);
//
//            ScaleTransition myTransition = ScaleTransitionBuilder.create()
//                    .node(circle)
//                    .duration(Duration.seconds(4))
//                    .toX(3)
//                    .toY(3)
//                    .cycleCount(Timeline.INDEFINITE)
//                    .autoReverse(true)
//                    .build();
//
//            scaleTransition.add(i,myTransition);
//
//            //int rot = rand.nextInt(360);
//            //text.setFill(Color.rgb(red, green, blue, .99));
//            //text.setRotate(rot);
//            myGroup.getChildren().add(circle);
//        }
//
//
//        //Scene scene = new Scene(root, 1200, 900, Color.GRAY);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//        primaryStage.show();
//
//    }
//
//    public void play() {
//        for (ScaleTransition transitions:scaleTransition){
//            transitions.play();
//        }
//    }
//
//    @Override public void stop() {
//        for (ScaleTransition transitions:scaleTransition){
//            transitions.stop();
//        }
//    }

}
