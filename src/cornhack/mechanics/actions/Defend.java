package cornhack.mechanics.actions;

import cornhack.world.Map;

public class Defend extends Affect {
	
	private boolean defend = false;
	public boolean getDefend() {
		return this.defend;
	}
	public void setDefend(boolean value) {
		this.defend = value;
	}
	@Override
	public void act(Map map) {
		// TODO Auto-generated method stub
		
	}
}