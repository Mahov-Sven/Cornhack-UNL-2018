package cornhack.main;

import cornhack.creature.Creature;
import cornhack.util.Queue;
import cornhack.world.Map;
import cornhack.world.MapGenerator;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameRunner {

	private Map map;
	private Queue<Creature> turnQueue;

	public void init(Stage stage) {
		this.map = MapGenerator.generateSingleRoom(20, 30);

		// Creating a Grid Pane
		Group root = new Group(map.render());

		// Creating a scene object
		Scene scene = new Scene(root);

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
