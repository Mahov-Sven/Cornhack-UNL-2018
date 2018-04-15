package cornhack.world.tile;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.util.Matrix;
import cornhack.util.Util;
import cornhack.world.Map;
import javafx.scene.text.Text;

public class Wall extends Tile {
	// Each wall is a list with thickness from smallest -> thickest

	private char[] top = { '\u2500', '\u2501' };
	private char[] side = { '\u2502', '\u2503' };
	private char[] topLeftCorner = { '\u250c', '\u250f' };
	private char[] topRightCorner = { '\u2510', '\u2513' };
	private char[] bottomLeftCorner = { '\u2514', '\u2517' };
	private char[] bottomRightCorner = { '\u2518', '\u251b' };
	private char[] tee = { '\u252c', '\u2533' };
	private char[] teeRight = { '\u251c', '\u2523' };
	private char[] teeLeft = { '\u2524', '\u252b' };
	private char[] teeUp = { '\u2534', '\u253b' };
	private char[] plus = { '\u253c', '\u254b' };

	@Override
	public Text render(Map map, int x, int y) {
		Text tile = new Text();
		tile.getStyleClass().add("Tile");
		tile.getStyleClass().add("Wall");
		switch (this.miningTier) {
			case 0:
				tile.getStyleClass().add("miningTierZero");
				break;
			case 1:
				tile.getStyleClass().add("miningTierOne");
				break;
			default:
				tile.getStyleClass().add("miningTierDefault");
				break;
		}
		// TODO Get Map Value and Set text to value.
		Matrix<Tile> mapTiles = map.getFieldTiles();
		// TODO get current row and column.
		int currentRow = y;
		int currentCol = x;
		// Top Right Bottom Left
		int adjacent = 0b0000;

		if (currentRow != 0 && this.equals(mapTiles.get(currentRow - 1, currentCol))) {
			adjacent = adjacent | 0b1000;
		}
		if (currentCol + 1 != mapTiles.width() && this.equals(mapTiles.get(currentRow, currentCol + 1))) {
			adjacent = adjacent | 0b0100;
		}
		if (currentRow + 1 != mapTiles.height() && this.equals(mapTiles.get(currentRow + 1, currentCol))) {
			adjacent = adjacent | 0b0010;
		}
		if (currentCol != 0 && this.equals(mapTiles.get(currentRow, currentCol - 1))) {
			adjacent = adjacent | 0b0001;
		}

		switch (adjacent) {
			case 0b0000:
				// Side
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.side[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.side[1]));
						break;
					default:
						tile.setText(Util.charToString(this.side[0]));
						break;
				}
				break;
			case 0b1000:
				// Side
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.side[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.side[1]));
						break;
					default:
						tile.setText(Util.charToString(this.side[0]));
						break;
				}
				break;
			case 0b0100:
				// Top
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.top[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.top[1]));
						break;
					default:
						tile.setText(Util.charToString(this.top[0]));
						break;
				}
				break;
			case 0b0010:
				// Side
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.side[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.side[1]));
						break;
					default:
						tile.setText(Util.charToString(this.side[0]));
						break;
				}
				break;
			case 0b0001:
				// Top
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.top[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.top[1]));
						break;
					default:
						tile.setText(Util.charToString(this.top[0]));
						break;
				}
				break;
			case 0b1100:
				// Bottom Left Corner
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.bottomLeftCorner[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.bottomLeftCorner[1]));
						break;
					default:
						tile.setText(Util.charToString(this.bottomLeftCorner[0]));
						break;
				}
				break;
			case 0b1010:
				// Vertical
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.side[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.side[1]));
						break;
					case 2:
						tile.setText(Util.charToString(this.side[2]));
						break;
					case 3:
						tile.setText(Util.charToString(this.side[3]));
						break;
					default:
						tile.setText(Util.charToString(this.side[0]));
						break;
				}
				break;
			case 0b1001:
				// Bottom Right Corner
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.bottomRightCorner[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.bottomRightCorner[1]));
						break;
					default:
						tile.setText(Util.charToString(this.bottomRightCorner[0]));
						break;
				}
				break;
			case 0b0110:
				// Top left corner
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.topLeftCorner[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.topLeftCorner[1]));
						break;
					default:
						tile.setText(Util.charToString(this.topLeftCorner[0]));
						break;
				}
				break;
			case 0b0101:
				// horizontal
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.top[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.top[1]));
						break;
					case 2:
						tile.setText(Util.charToString(this.top[2]));
						break;
					case 3:
						tile.setText(Util.charToString(this.top[3]));
						break;
					default:
						tile.setText(Util.charToString(this.top[0]));
						break;
				}
				break;
			case 0b0011:
				// Top right corner
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.topRightCorner[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.topRightCorner[1]));
						break;
					default:
						tile.setText(Util.charToString(this.topRightCorner[0]));
						break;
				}
				break;
			case 0b1110:
				// Right T
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.teeRight[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.teeRight[1]));
						break;
					default:
						tile.setText(Util.charToString(this.teeRight[0]));
						break;
				}
				break;
			case 0b1101:
				// Up T
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.teeUp[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.teeUp[1]));
						break;
					default:
						tile.setText(Util.charToString(this.teeUp[0]));
						break;
				}
				break;
			case 0b0111:
				// T
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.tee[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.tee[1]));
						break;
					default:
						tile.setText(Util.charToString(this.tee[0]));
						break;
				}
				break;
			case 0b1011:
				// Left T
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.teeLeft[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.teeLeft[1]));
						break;
					default:
						tile.setText(Util.charToString(this.teeLeft[0]));
						break;
				}
				break;
			case 0b1111:
				// +
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.plus[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.plus[1]));
						break;
					default:
						tile.setText(Util.charToString(this.plus[0]));
						break;
				}
				break;
			default:
				// Side
				switch (this.miningTier) {
					case 0:
						tile.setText(Util.charToString(this.side[0]));
						break;
					case 1:
						tile.setText(Util.charToString(this.side[1]));
						break;
					default:
						tile.setText(Util.charToString(this.side[0]));
						break;
				}
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
