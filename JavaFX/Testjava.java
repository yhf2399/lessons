import javafx.animation.Animation;
   import javafx.animation.ScaleTransition;
   import javafx.util.Duration;
   import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.Group;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Rectangle;
   public class Test extends Application {
   　   // main()
   　   // start()
   　   @Override
   　   public void start( Stage stage ) throws Exception {
   　     // いつもの4行
   　     View v = new View();
   　     Scene scene = new Scene( v, 400, 300 );
   　     stage.setScene( scene );
   　     stage.show();
   　     // マウス処理
   　     scene.setOnMouseClicked( e -> v.changeAnimation() );
   　   }
   　 }
   　code:View
   　 class View extends Group {
   　   // メンバー; member = データ
   　   Rectangle rect;
   　   ScaleTransition animation;
   　   int flagAnimation = 0;
   　   // メソッド; method = 処理
   　   public View() {
   　     rect = new Rectangle( 0, 0, 60, 50 );
   　     rect.setFill( Color.CYAN );
   　     animation = new ScaleTransition( Duration.seconds( 2 ), rect );
   　     animation.setFromX();
   　     animation.setFromY();
   　     animation.setToX();
   　     animation.setToY();
   　     animation.setCycleCount( Animation.INDEFINITE );
   　     animation.setAutoReverse( true );
   　     animation.play();
   　     getChildren().add( rect );
   　   }
   　   public void changeAnimation() {
   　     if ( flagAnimation == 0 ) {
   　       animation.pause();			// アニメーション止める
   　       flagAnimation = 1;		// flag を 1 にする
   　     } else {
   　       animation.play();			// アニメーション再開する
   　       flagAnimation = 0;		// flag を 0 にする
   　     }
   　   }
   　 }