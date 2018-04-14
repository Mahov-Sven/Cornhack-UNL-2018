package cornhack.mechanics.actions;

import cornhack.creature.Creature;
import cornhack.world.Map;

public class Defend extends Action {
	
	private boolean defend = false;
	public boolean getDefend() {
		return this.defend;
	}
	public void setDefend(boolean value) {
		this.defend = value;
	}
}