import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
   public class Test2 extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     @Override
     public void start( Stage stage ) throws Exception {
      Label label=new Label("hello");
    TextField field =new TextField();
    Button button=new Button("ok");
    button.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent e){
        String msg=field.getText();
        label.setText(msg);
      }
    });
     	BorderPane pane=new BorderPane();
     	pane.setTop(label);
      pane.setCenter(field);
     	pane.setBottom(button);
     	Scene  scene=new Scene(pane,300,200);
     	stage.setScene(scene);
       stage.show();
     }
   }