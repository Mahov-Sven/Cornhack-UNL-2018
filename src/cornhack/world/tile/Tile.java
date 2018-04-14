package cornhack.world.tile;

import java.util.ArrayList;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.world.Map;
import javafx.scene.text.Text;

public abstract class Tile {
	
	private int miningTier;
	
	private int terrainDifficultyTier;
	
	private int terrainVisibilityTier;
	
	private ArrayList<Tile> notifyTiles;
	
	private boolean beenSeen;

	public abstract void render(Text screen, Map map);
	
	public abstract boolean tryMove(Map map, Creature creature, Action action);
	
	@Override
	public abstract boolean equals(Object obj);
}
