package cornhack.mechanics.actions;

import java.util.Random;

import cornhack.creature.Creature;
import cornhack.world.Map;

public class Attack extends Action {
	
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

	public void attackSomething(Map map, Creature initiator, int direction){
		
//		int hitResult = (new Random().nextInt(20)+1) + hit;
//		int acResult = target.getAC();
//		if( hitResult >= acResult ){
//			//hit!
//		}
//		else{
//			//miss!
//		}
		
	}
/*	
	public int[] find(T elem) {
		for (int row = 0; row < matrix.size(); row++) {
			for (int col = 0; col < matrix.get(row).size(); col++) {
				T curr = matrix.get(row).get(col);
				if (elem == curr || elem.equals(curr))
					return new int[] { row, col };
			}
		}
		return null;
	}

	public T remove(int row, int col) {
		return this.set(row, col, null);
	}

	public T set(int row, int col, T elem) {
		return matrix.get(row).set(col, elem);
	}
*/
	
	
	
}
