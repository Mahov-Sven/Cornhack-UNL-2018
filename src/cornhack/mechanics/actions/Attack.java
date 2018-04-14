package cornhack.mechanics.actions;

import java.util.Random;

import cornhack.world.Map;

public class Attack extends Affect {
	
	private String name;
	private int hit;	//to hit bonus
	private int dmg;	//max dmg, i.e. d8 = 8
	private boolean ranged;
	
	public int rollDamage(int strMod){
		return new Random().nextInt(getDmg()) + 1 + strMod;
	}

	public boolean getRanged() {
		return ranged;
	}
	
	public void setRanged(boolean ranged){
		this.ranged = ranged;
	}
	
	public Attack(String name, int hit, int dmg, boolean ranged) {
		super();
		this.name = name;
		this.hit = hit;
		this.dmg = dmg;
		this.ranged = ranged;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	@Override
	public void act(Map map) {
		// TODO Auto-generated method stub
		
	}
	
}
