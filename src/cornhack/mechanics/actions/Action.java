package cornhack.mechanics.actions;

import cornhack.world.Map;

public abstract class Action {
	protected int cost;
	public abstract void act(Map map);
}
