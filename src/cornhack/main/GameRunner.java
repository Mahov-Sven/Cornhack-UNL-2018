package cornhack.main;

import cornhack.creature.Creature;
import cornhack.util.Queue;
import cornhack.world.Map;
import cornhack.world.MapGenerator;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameRunner {

	private Map map;
	private Queue<Creature> turnQueue;

	public void init(Stage stage) {
		this.map = MapGenerator.generateBasicFloor();

		GridPane fieldPane = new GridPane();
		GridPane backgroundPane = new GridPane();
		StackPane stack = new StackPane();
		stack.getChildren().addAll(fieldPane, backgroundPane);
		map.render(backgroundPane, fieldPane);

		// Creating a scene object
		Scene scene = new Scene(stack);

		// Set theme
		scene.getStylesheets().add(getClass().getResource("../themes/dark.css").toExternalForm());

		// Setting title to the Stage
		stage.setTitle("Game");

		// Adding scene to the stage
		stage.setScene(scene);

		// Displaying the contents of the stage
		stage.show();
	}

	public void start(Stage stage) {

	}
}
