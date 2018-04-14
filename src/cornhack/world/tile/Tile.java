package cornhack.world.tile;

import java.util.ArrayList;

public abstract class Tile {
	
	private int miningTier;
	
	private int terrainDifficultyTier;
	
	private int terrainVisibilityTier;
	
	private ArrayList<Tile> notifyTiles;
	
	private boolean beenSeen;
	
}
