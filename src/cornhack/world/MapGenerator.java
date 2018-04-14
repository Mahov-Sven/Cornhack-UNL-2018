package cornhack.world;

import cornhack.world.tile.Floor;
import cornhack.world.tile.Wall;

public class MapGenerator {

	private static void generateRoom(Map map, int xPos, int yPos, int width, int height) {
		int yMax = yPos + height;
		int xMax = xPos + width;
		for (int y = yPos; y < yMax; y++) {
			for (int x = xPos; x < xMax; x++) {
				if (y == yPos || x == xPos || y + 1 == yMax || x + 1 == xMax)
					map.setTile(x, y, new Wall());
			}
		}
	}

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

	public static Map generateBasicFloor() {
		int width = 45;
		int height = 35;
		Map map = new Map(width, height);

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				map.setTile(x, y, new Floor());
			}
		}

		generateRoom(map, 0, 0, 17, 17);
		generateRoom(map, 0, 16, 27, 5);

		generateRoom(map, 0, 20, 7, 8);
		generateRoom(map, 0, 27, 7, 8);

		generateRoom(map, 6, 20, 6, 15);

		generateRoom(map, 11, 20, 7, 8);
		generateRoom(map, 11, 27, 7, 8);

		generateRoom(map, 17, 20, 28, 13);

		generateRoom(map, 26, 2, 19, 19);

		return map;
	}
}
