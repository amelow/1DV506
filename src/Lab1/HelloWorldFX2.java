package Lab1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldFX2 extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button();
		primaryStage.setTitle("Hello Wold Test");
		button.setText("press");
		MyEventHandler meh = new MyEventHandler();
		button.setOnAction(meh);
		StackPane root = new StackPane();
		root.getChildren().add(button);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

}

class MyEventHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hello world");
	}
	
}
