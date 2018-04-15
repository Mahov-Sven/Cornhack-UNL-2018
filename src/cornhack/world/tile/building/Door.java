package cornhack.world.tile.building;

import cornhack.world.Map;
import cornhack.world.tile.Wall;
import javafx.scene.text.Text;

public class Door extends Wall{
	
	@Override
	public Text render(Map map, int x, int y) {
		Text tile = super.render(map, x, y);
		tile.getStyleClass().add("Door");
		return tile;
	}
}
