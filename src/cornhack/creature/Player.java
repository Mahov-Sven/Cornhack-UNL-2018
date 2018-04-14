package cornhack.creature;

import java.util.List;

import cornhack.mechanics.actions.Action;
import cornhack.mechanics.actions.Attack;
import cornhack.world.Map;
import javafx.scene.text.Text;

public class Player extends Creature {
	
	private String name;
	//ChrisChristie, TerryCrews, DwayneJohnson, RayCharles
	private String profession;
	//Boxer, Spy, ChosenOne, Wizard
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Player(int str, int dex, int con, int ntl, int wis, int cha, int maxHP, int currentHP, int aC, int aP,
			List<Action> actions, String name, String profession) {
		super(str, dex, con, ntl, wis, cha, maxHP, currentHP, aC, aP, actions);
		this.name = name;
		this.profession = profession;
	}
	public Player() {
		super();
		this.name = null;
		this.profession = null;
	}

	public static Player playerFactory(String name, String profession){
		Player p = new Player();
		p.setName(name);
		p.setProfession(profession);

		p.setAP(5);
		
		if( p.getName().equals("ChrisChristie")){
			p.setStr(17);
			p.setDex(13);
			p.setCon(16);
			p.setNtl(12);
			p.setWis(8);
			p.setCha(10);
			p.setMaxHP(((p.getCon()*5)-10)/2);
			p.setAC(10+p.getDex());
		}
		if( p.getName().equals("TerryCrews")){
			p.setStr(14);
			p.setDex(11);
			p.setCon(13);
			p.setNtl(9);
			p.setWis(15);
			p.setCha(16);
			p.setMaxHP(((p.getCon()*5)-10)/2);
			p.setAC(10+p.getDex());
		}
		if( p.getName().equals("DwayneJohnson")){
			p.setStr(16);
			p.setDex(12);
			p.setCon(17);
			p.setNtl(10);
			p.setWis(13);
			p.setCha(8);
			p.setMaxHP(((p.getCon()*5)-10)/2);
			p.setAC(10+p.getDex());
		}
		if( p.getName().equals("RayCharles")){
			p.setStr(8);
			p.setDex(16);
			p.setCon(13);
			p.setNtl(17);
			p.setWis(12);
			p.setCha(10);
			p.setMaxHP(((p.getCon()*5)-10)/2);
			p.setAC(10+p.getDex());
		}		
		if( p.getProfession().equals("Boxer")){
			p.setMaxHP(p.getMaxHP()+40);
			p.setCurrentHP(p.getMaxHP());
			p.actions.add(new Attack("dummy", 1, 2, false));
			
		}
		if( p.getProfession().equals("Spy")){
			p.setMaxHP(p.getMaxHP()+34);
			p.setCurrentHP(p.getMaxHP());
			p.actions.add(new Attack("dummy", 1, 2, false));

		}
		if( p.getProfession().equals("ChosenOne")){
			p.setMaxHP(p.getMaxHP()+28);
			p.setCurrentHP(p.getMaxHP());
			p.actions.add(new Attack("dummy", 1, 2, false));
			
		}
		if( p.getProfession().equals("Wizard")){
			p.setMaxHP(p.getMaxHP()+22);
			p.setCurrentHP(p.getMaxHP());
			p.actions.add(new Attack("dummy", 1, 2, false));
			
		}
		return p;
	}
	
	public Text render(Map map){
		return new Text();
	}
	
	
}
