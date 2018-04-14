package cornhack.world.tile;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.util.Util;
import cornhack.world.Map;
import javafx.scene.text.Text;

public class Floor extends Tile {
	
	private char[] floors = { '\u2588' };

	@Override
	public Text render(Map map, int x, int y) {
		Text tile = new Text();
		tile.getStyleClass().add("Floor-Basic");
		tile.setText(Util.charToString(floors[0]));
		return tile;
	}

	@Override
	public boolean tryMove(Map map, Creature creature, Action action) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
