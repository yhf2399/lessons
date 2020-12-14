import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
   public class Test extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     @Override
     public void start( Stage stage ) throws Exception {
      String name="ウカイホウ";
     	String cls="IG12";
     	String msg="Hello,JavaFX!";
     	Label n1=new Label(name);
     	Label c1=new Label(cls);
     	Label m1=new Label(msg);
    
     	BorderPane pane=new BorderPane();
     	pane.setCenter(n1);
     	pane.setTop(m1);
     	pane.setBottom(c1);
     	Scene  scene=new Scene(pane,300,200);
     	stage.setScene(scene);
       stage.show();
     }
   }