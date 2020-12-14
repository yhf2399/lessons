import javafx.application.Application;
  import javafx.scene.Group;
  import javafx.scene.ParallelCamera;
  import javafx.scene.Scene;
  import javafx.scene.SubScene;
  import javafx.scene.paint.Color;
  import javafx.scene.shape.Rectangle;
  import javafx.stage.Stage;
  public class Game1 extends Application {
    public static void main( String[] args ) {
      launch( args );
    }
    @Override
    public void start( Stage stage ) throws Exception {
      Group root = new Group();
      Scene scene = new Scene( root, 400, 300 );
      Rectangle rect01 = new Rectangle( 220, 125, 50, 50 );

      rect01.setFill( Color.RED );
      root.getChildren().add( rect01 );
      Group grp = new Group();
      SubScene sub = new SubScene( grp, 400, 300 );
      Rectangle rect02 = new Rectangle( 220, 125, 50, 50 );
      rect02.setFill( Color.BLUE );
      grp.getChildren().add( rect02 );
      ParallelCamera cam = new ParallelCamera();
      cam.setTranslateX( 100 );
      sub.setCamera( cam );
      root.getChildren().add( sub );
      stage.setScene( scene );
      stage.show();
    }
  }