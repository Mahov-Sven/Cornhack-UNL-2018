package cornhack.world.tile;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.world.Map;
import javafx.scene.text.Text;

public class Wall extends Tile {
	// Each wall is a list with thickness from smallest -> thickest

	private char[] top = { '\u2581', '\u2582', '\u2583', '\u2584' };
	private char[] side = { '\u258F', '\u258E', '\u258D', '\u258C' };
	private char[] topLeftCorner = { '\u250c', '\u250f' };
	private char[] topRightCorner = { '\u2510', '\u2513' };
	private char[] bottomLeftCorner = { '\u2514', '\u2517' };
	private char[] bottomRightCorner = { '\u2518', '\u251b' };

	@Override
	public Text render(Map map) {
		Text tile = new Text();
		switch (this.miningTier) {
			case 0:
				tile.getStyleClass().add("miningTierZero");
				break;
			case 1:
				tile.getStyleClass().add("miningTierOne");
				break;
			case 2:
				tile.getStyleClass().add("miningTierTwo");
				break;
			case 3:
				tile.getStyleClass().add("miningTierThree");
				break;
			case 4:
				tile.getStyleClass().add("miningTierFour");
				break;
			default:
				tile.getStyleClass().add("miningTierDefault");
				break;
		}
		// TODO Get Map Value and Set text to value.

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
		if (this == obj) {
			return true;
		}
		return false;
	}
}
