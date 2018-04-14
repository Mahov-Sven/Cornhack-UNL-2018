package cornhack.world;

import cornhack.world.tile.Floor;

public class MapGenerator {

	public static Map generateEmpty(int height, int width) {
		Map map = new Map(height, width);
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				map.setTile(y, x, new Floor());
			}
		}

		return map;
	}
}
