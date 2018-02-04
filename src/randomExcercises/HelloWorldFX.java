package randomExcercises;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {
	DropShadow shadow = new DropShadow();
	final Button button = new Button();

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane root = new StackPane();

		primaryStage.setTitle("Hello Wold Test");
		button.setText("press");
		root.getChildren().add(button);
		primaryStage.setScene(new Scene(root, 300, 250));
		button.setStyle(" -fx-background-color:#64EE64;");

		button.setOnAction(actionEvent -> {
			root.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
			System.out.println("Hello there :) ");
			button.setEffect(new DropShadow());

		});

		root.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, null, null)));
		primaryStage.show();
	}

}
