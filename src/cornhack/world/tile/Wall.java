package cornhack.world.tile;


public class Wall extends Tile{
		// Each wall is a list with thickness from smallest -> thickest
	
		private char[] top = {'\u2581', '\u2582', '\u2583', '\u2584'};
		private char[] side = {'\u258F', '\u258E', '\u258D', '\u258C'};
		private char[] topLeftCorner = {'\u250c', '\u250f', 'r'};
		private char[] topRightCorner = {'\u2510', '\u2513'};
		private char[] bottomLeftCorner = {'\u2514', '\u2517'};
		private char[] bottomRightCorner = {'\u2518', '\u251b'};
}
