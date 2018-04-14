package cornhack.world.tile;

import cornhack.creature.Creature;
import cornhack.mechanics.actions.Action;
import cornhack.world.Map;
import javafx.scene.text.Text;

public class Floor extends Tile{
	
	@Override
	public void render(Text screen, Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tryMove(Map map, Creature creature, Action action) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
