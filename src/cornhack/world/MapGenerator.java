package cornhack.world;

import cornhack.world.tile.Floor;
import cornhack.world.tile.Wall;

public class MapGenerator {

	public static Map generateEmpty(int width, int height) {
		Map map = new Map(width, height);
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				map.setTile(x, y, new Floor());
			}
		}

		return map;
	}

	public static Map generateSingleRoom(int width, int height) {
		Map map = new Map(width, height);
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				map.setTile(x, y, new Floor());
			}
		}

		if (width > 10 && height > 10) {
			for (int y = 3; y < 9; y++) {
				for (int x = 3; x < 8; x++) {
					map.setTile(x, y, new Wall());
				}
			}
		}

		return map;
	}
}
