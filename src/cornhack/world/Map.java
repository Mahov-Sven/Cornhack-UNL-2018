package cornhack.world;

import cornhack.creature.Creature;
import cornhack.util.Matrix;
import cornhack.world.tile.Tile;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Map {
	
	private Matrix<Tile> map;
	private Matrix<Creature> creatures;
	
	public Map(int width, int height) {
		this.map = new Matrix<Tile>(width, height);
		this.creatures = new Matrix<Creature>(width, height);
	}

	public TextFlow render() {
		TextFlow tiles = new TextFlow();
		
		for (int y = 0; y < map.height(); y++) {
			for (int x = 0; x < map.width(); x++) {
				map.width();
				if (creatures.get(y, x) != null) {
					tiles.getChildren().add(creatures.get(y, x).render(this, x, y));
				} else if (map.get(y, x) != null) {
					tiles.getChildren().add(map.get(y, x).render(this, x, y));
				}
			}
			if (y != map.height() - 1)
				tiles.getChildren().add(new Text("\n"));
		}

		return tiles;
	}

	public void setTile(int x, int y, Tile tile) {
		map.set(y, x, tile);
	}
	public Matrix<Tile> getTiles() {
		return map;
	}
	
	public void setCreature(int x, int y, Creature c){
		creatures.set(x, y, c);
	}

	
	public Matrix<Creature> getCreatures() {
		return creatures;
	}
}
