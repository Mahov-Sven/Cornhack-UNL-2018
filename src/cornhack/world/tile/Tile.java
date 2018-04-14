package cornhack.world.tile;

import java.util.ArrayList;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.world.Map;
import javafx.scene.text.Text;

public abstract class Tile {
	
	protected int miningTier;
	
	protected int terrainDifficultyTier;
	
	protected int terrainVisibilityTier;
	
	protected ArrayList<Tile> notifyTiles;
	
	protected boolean beenSeen;

	public abstract Text render(Map map, int x, int y);
	
	public abstract boolean tryMove(Map map, Creature creature, Action action);
	
	@Override
	public abstract boolean equals(Object obj);
}
