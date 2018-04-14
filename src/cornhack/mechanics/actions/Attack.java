package cornhack.mechanics.actions;

import java.util.Random;

import cornhack.creature.Creature;
import cornhack.util.Matrix;
import cornhack.world.Map;
import cornhack.world.tile.Tile;

public class Attack extends Action {

	private String name;
	private int hit; // to hit bonus
	private int dmg; // max dmg, i.e. d8 = 8
	private boolean ranged;

	public int rollDamage(int strMod) {
		return new Random().nextInt(getDmg()) + 1 + strMod;
	}

	public boolean getRanged() {
		return ranged;
	}

	public void setRanged(boolean ranged) {
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

	public void attackSomething(Map map, Creature initiator, int direction) {
		Matrix<Creature> creatures = map.getCreatures();
		int[] initiatorLocation = creatures.find(initiator);
		int rowsNum = 0;
		int colsNum = 0;

		switch (direction) {

			case 1:
				rowsNum = 1;
				colsNum = -1;
				break;
			case 2:
				rowsNum = 1;
				colsNum = 0;
				break;
			case 3:
				rowsNum = 1;
				colsNum = 1;
				break;
			case 4:
				rowsNum = 0;
				colsNum = -1;
				break;
			case 5:
				rowsNum = 0;
				colsNum = 0;
				break;
			case 6:
				rowsNum = 0;
				colsNum = 1;
				break;
			case 7:
				rowsNum = -1;
				colsNum = -1;
				break;
			case 8:
				rowsNum = -1;
				colsNum = 0;
				break;
			case 9:
				rowsNum = -1;
				colsNum = 1;
				break;
			default:
				break;
		}
		int hitResult = (new Random().nextInt(20)+1) + this.hit;
		int[] targetLocation = {initiatorLocation[0] + rowsNum, initiatorLocation[1] + colsNum};
		Creature targetCreature = creatures.get(targetLocation[0], targetLocation[1]);
		if(targetCreature != null) {
			if(targetCreature.getAC() <= hitResult) {
				targetCreature.setCurrentHP(targetCreature.getCurrentHP() - rollDamage(initiator.getStr()));
				if(targetCreature.getCurrentHP() <= 0) {
					map.setCreature(targetLocation[0], targetLocation[1], null);
				}
			}
		}else {
			return;
		}
	}
}
