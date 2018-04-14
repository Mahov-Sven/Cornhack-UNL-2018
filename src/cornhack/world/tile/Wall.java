package cornhack.world.tile;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.util.Matrix;
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
		Matrix<Tile> mapTiles = map.getTiles();
		// TODO get current row and column.
		int currentRow = 0;
		int currentCol = 0;
		// Top Right Bottom Left
		int adjacent = 0b0000;

		if (this.equals(mapTiles.get(currentRow + 1, currentCol))) {
			adjacent = adjacent | 0b1000;
		}
		if (this.equals(mapTiles.get(currentRow, currentCol + 1))) {
			adjacent = adjacent | 0b0100;
		}
		if (this.equals(mapTiles.get(currentRow - 1, currentCol))) {
			adjacent = adjacent | 0b0010;
		}
		if (this.equals(mapTiles.get(currentRow, currentCol - 1))) {
			adjacent = adjacent | 0b0001;
		}

		switch (adjacent) {
			case 0b0000:
				switch(this.miningTier) {
					case 0:
						tile.setText(this.side[0]);
						break;
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					default:
						break;
				}
				break;
			case 0b1000:
				break;
			case 0b0100:
				break;
			case 0b0010:
				break;
			case 0b0001:
				break;
			case 0b1100:
				break;
			case 0b1010:
				break;
			case 0b1001:
				break;
			case 0b0110:
				break;
			case 0b0101:
				break;
			case 0b0011:
				break;
			case 0b1110:
				break;
			case 0b1101:
				break;
			case 0b0111:
				break;
			case 0b1011:
				break;
			case 0b1111:
				break;
			default:
				break;
		}

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
		if (obj instanceof Wall) {
			return true;
		}
		return false;
	}
}
