package cornhack.world;

import cornhack.creature.Creature;
import cornhack.util.Matrix;
import cornhack.world.tile.Tile;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Map {
	
	private Matrix<Tile> map;
	private Matrix<Creature> creatures;
	
	public Map(int height, int width) {
		this.map = new Matrix<Tile>(height, width);
		this.creatures = new Matrix<Creature>(height, width);
	}

	public TextFlow render() {
		Text[] tiles = new Text[map.length()];
		
		for (int y = 0; y < map.height(); y++) {
			for (int x = 0; x < map.width(); x++) {
				int index = y * map.width() + x;
				if (creatures.get(y, x) != null) {
					tiles[index] = creatures.get(y, x).render(this);
				} else if (map.get(y, x) != null) {
					tiles[index] = map.get(y, x).render(this);
				}
			}
		}
		
		return new TextFlow(tiles);
	}

	public Matrix<Tile> getTiles() {
		return map;
	}

	public Matrix<Creature> getCreatures() {
		return creatures;
	}
}
