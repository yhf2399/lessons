import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Test3 extends Application {
  	public static void main( String[] args ) {
      launch( args );
    }
    @Override
    public void start( Stage stage ) throws Exception {
      Label left = new Label( "Hi" );
      Label right = new Label( "Hello" );
      Button button = new Button( "OK" );
      button.setOnAction( new EventHandler<ActionEvent>(){
        @Override
        public void handle( ActionEvent e ) {
          String data = left.getText();
          left.setText( right.getText() );
          right.getText(data);
          // String data1 = left.getText();
          // String data2 = right.getText();
          // right.setText( data1 );
          // left.setText( data2 );
        }
      });
      BorderPane pane = new BorderPane();
      pane.setLeft( left );
      pane.setRight( right );
      pane.setBottom( button );
      Scene scene = new Scene( pane, 400, 300 );
      stage.setScene( scene );
      stage.show();
    }
  }