package cornhack.world;

import cornhack.creature.Creature;
import cornhack.util.Matrix;
import cornhack.world.tile.Tile;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class Map {

	private Matrix<Tile> background;
	private Matrix<Tile> field;
	private Matrix<Creature> creatures;

	public Map(int width, int height) {
		this.background = new Matrix<Tile>(width, height);
		this.field = new Matrix<Tile>(width, height);
		this.creatures = new Matrix<Creature>(width, height);
	}

	public void render(GridPane fieldPane, GridPane backgroundPane) {
		backgroundPane.getChildren().clear();

		for (int y = 0; y < field.height(); y++) {
			for (int x = 0; x < field.width(); x++) {
				field.width();
				Node tile = background.get(y, x) == null ? null : background.get(y, x).render(this, x, y);
				if (tile != null)
					backgroundPane.add(tile, x, y);
			}
		}

		fieldPane.getChildren().clear();

		for (int y = 0; y < field.height(); y++) {
			for (int x = 0; x < field.width(); x++) {
				field.width();
				Node tile = null;
				if (creatures.get(y, x) != null) {
					tile = creatures.get(y, x).render(this, x, y);
				} else if (field.get(y, x) != null) {
					tile = field.get(y, x).render(this, x, y);
				}
				if (tile != null)
					fieldPane.add(tile, x, y);
			}
		}
	}

	public void setFieldTile(int x, int y, Tile tile) {
		field.set(y, x, tile);
	}

	public void setBackgroundTile(int x, int y, Tile tile) {
		background.set(y, x, tile);
	}

	public Matrix<Tile> getBackgroundTiles() {
		return background;
	}

	public Matrix<Tile> getFieldTiles() {
		return field;
	}

	public void setCreature(int x, int y, Creature c) {
		creatures.set(x, y, c);
	}

	public Matrix<Creature> getCreatures() {
		return creatures;
	}
}
