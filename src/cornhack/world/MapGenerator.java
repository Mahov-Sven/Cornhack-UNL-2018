package cornhack.world;

import cornhack.world.tile.Floor;
import cornhack.world.tile.Wall;
import cornhack.world.tile.building.Door;

public class MapGenerator {

	private static void generateRoom(Map map, int xPos, int yPos, int width, int height) {
		int yMax = yPos + height;
		int xMax = xPos + width;
		for (int y = yPos; y < yMax; y++) {
			for (int x = xPos; x < xMax; x++) {
				if (y == yPos || x == xPos || y + 1 == yMax || x + 1 == xMax)
					map.setFieldTile(x, y, new Wall());
			}
		}
	}

	private static void generateDoor(Map map, int xPos, int yPos, int width, boolean horizontal) {
		int xMax = xPos + width;
		int yMax = yPos + width;
		if (horizontal) {
			for (int x = xPos; x < xMax; x++) {
				map.setFieldTile(x, yPos, new Door());
			}
		} else {
			for (int y = yPos; y < yMax; y++) {
				map.setFieldTile(xPos, y, new Door());
			}
		}
	}

	public static Map generateEmpty(int width, int height) {
		Map map = new Map(width, height);
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				map.setFieldTile(x, y, new Floor());
			}
		}

		return map;
	}

	public static Map generateSingleRoom(int width, int height) {
		Map map = new Map(width, height);
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				map.setFieldTile(x, y, new Floor());
			}
		}

		if (width > 10 && height > 10) {
			for (int y = 3; y < 9; y++) {
				for (int x = 3; x < 8; x++) {
					map.setFieldTile(x, y, new Wall());
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
				map.setBackgroundTile(x, y, new Floor());
			}
		}

		generateRoom(map, 0, 0, 18, 17);
		generateRoom(map, 0, 16, 27, 5);

		generateRoom(map, 0, 20, 7, 8);
		generateRoom(map, 0, 27, 7, 8);

		generateRoom(map, 6, 20, 6, 15);

		generateRoom(map, 11, 20, 7, 8);
		generateRoom(map, 11, 27, 7, 8);

		generateRoom(map, 17, 20, 28, 13);

		generateRoom(map, 26, 2, 19, 19);

		generateDoor(map, 8, 16, 2, true);
		generateDoor(map, 6, 26, 1, false);
		generateDoor(map, 6, 28, 1, false);
		generateDoor(map, 8, 20, 2, true);
		generateDoor(map, 11, 26, 1, false);
		generateDoor(map, 11, 28, 1, false);
		generateDoor(map, 21, 20, 2, true);
		generateDoor(map, 34, 20, 2, true);

		return map;
	}
}
