import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;

public class A1 extends Application{
	private BreakoutThread breakoutthread;
	public static void main(String args[]){
		launch(args);
	}
	@Override
	public void start(Stage stage){
		stage.setTitle("BREAKOUT");
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		Canvas canvas = new Canvas(640,480);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);
		breakoutthread = new BreakoutThread(gc);
		breakoutthread.start();
		stage.show();
	}
}
class BreakoutThread extends AnimationTimer{
	private GraphicsContext gc;
	private int count;
	BreakoutThread(GraphicsContext gc){
		this.gc = gc;
		count = 0;
	}
	@Override
	public void handle(long time){
		gc.clearRect(0,0,640,480);
		gc.fillText("count = " + count,450,450);
		count++;
	}
}