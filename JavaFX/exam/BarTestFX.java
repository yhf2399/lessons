import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
public class BarTestFX extends Application{
private BreakoutThread breakoutthread;
public static void main(String[] args) {
	launch(args);
}
@Override
public void start(Stage stage){
	Key key = new Key();
	stage.setTitle("Ball Test");
	Pane pane = new Pane();
	Scene scene = new Scene(pane);
	stage.setScene(scene);
	scene.setOnKeyPressed(
		new EventHandler<KeyEvent>(){
			public void handle(KeyEvent e){
				key.keyPressed(e);
			}
		});
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
	private Ball ball;
	public BreakoutThread(GraphicsContext gc){
		this.gc = gc;
		ball=new Ball();
	}
	@Override
	public void handle(long time ){
		gc.clearRect(0,0,640,480);
		ball.draw(gc);
		ball.move();
	}
}
class Ball{
	private int x;
	private int y;
	private int x_speed;
	private int y_speed;
	public Ball(){
		this.x=20;
		this.y=20;
		this.x_speed=5;
		this.y_speed=5;
	}
class Bar{
	private int xx;
	private int yy;
	private int xx_width;
	private int yy_height;
	public Bar(){
		this.xx=20;
		this.yy=20;
		this.xx_width=20;
		this.yy_height=60;
	}
	public void draw(GraphicsContext gc){
		gc.setFill(Color.BLUE);
		gc.fillOval(x,y,20,20);
		gc.setFill(Color.RED);
		gc.fillRect(xx,yy,20,60);
	}
	public void move(){
		this.x+=this.x_speed;
		this.y+=this.y_speed;
	}
}
class Key{
	public void keyPressed(KeyEvent e){
		switch(e.getCode()){
			case LEFT:
			System.out.println("LEFT pressed");
			break;
			case RIGHT:
			System.out.println("RIGHT pressed");
			break;
			default:
			break;
		}
	}
}