package cornhack.creature;

import java.util.List;

import cornhack.mechanics.actions.Action;
import cornhack.world.Map;
import javafx.scene.text.Text;

public abstract class Creature {
	
	protected int str;
	protected int dex;
	protected int con;
	protected int ntl;
	protected int wis;
	protected int cha;
	protected int maxHP;
	protected int currentHP;
	protected int AC;
	protected int AP;
	protected List<Action> actions;

	
	public int getStr() {
		return str;
	}


	public void setStr(int str) {
		this.str = str;
	}


	public int getDex() {
		return dex;
	}


	public void setDex(int dex) {
		this.dex = dex;
	}


	public int getCon() {
		return con;
	}


	public void setCon(int con) {
		this.con = con;
	}

	public Creature(int str, int dex, int con, int ntl, int wis, int cha, int maxHP, int currentHP, int aC, int aP,
			List<Action> actions) {
		super();
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.ntl = ntl;
		this.wis = wis;
		this.cha = cha;
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.AC = aC;
		this.AP = aP;
		this.actions = actions;
	}


	public Creature() {
		super();
		this.str = 0;
		this.dex = 0;
		this.con = 0;
		this.ntl = 0;
		this.wis = 0;
		this.cha = 0;
		this.maxHP = 0;
		this.currentHP = 0;
		AC = 0;
		AP = 0;
		this.actions = null;
	}
	
	public int getNtl() {
		return ntl;
	}


	public void setNtl(int ntl) {
		this.ntl = ntl;
	}


	public int getWis() {
		return wis;
	}


	public void setWis(int wis) {
		this.wis = wis;
	}


	public int getCha() {
		return cha;
	}


	public void setCha(int cha) {
		this.cha = cha;
	}


	public int getMaxHP() {
		return maxHP;
	}


	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}


	public int getCurrentHP() {
		return currentHP;
	}


	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}


	public int getAC() {
		return AC;
	}


	public void setAC(int aC) {
		AC = aC;
	}


	public int getAP() {
		return AP;
	}


	public void setAP(int aP) {
		AP = aP;
	}


	public List<Action> getActions() {
		return actions;
	}


	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	
	
	public abstract Text render(Map map, int x, int y);
}
