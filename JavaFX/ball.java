import javafx.application.Application;
　 import javafx.stage.Stage;
　 import javafx.scene.Scene;
　 import javafx.scene.layout.Pane;
　 import javafx.scene.paint.Color;
　 import javafx.scene.canvas.Canvas;
　 import javafx.scene.canvas.GraphicsContext;
　 import javafx.animation.AnimationTimer;
public class BreakoutMain extends Application {
　   private BreakoutThread breakoutthread;
　   public static void main( String[] args ) {
　     launch( args );
　   }
@Override
public void handle(long time){
	gc.clearRect(0,0,640,480);
	ball.draw(gc);
}