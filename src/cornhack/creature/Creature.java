package cornhack.creature;

import cornhack.world.Map;
import javafx.scene.text.Text;

public abstract class Creature {
	
	public abstract Text render(Map map);
}
