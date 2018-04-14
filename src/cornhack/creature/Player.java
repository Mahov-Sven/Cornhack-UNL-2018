package cornhack.creature;

public class Player {
	
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
	public Player(String name, String profession) {
		super();
		this.name = name;
		this.profession = profession;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
