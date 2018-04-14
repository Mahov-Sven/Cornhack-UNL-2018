package cornhack.mechanics.actions;


import cornhack.creature.Creature;
import cornhack.world.Map;

public class Movement extends Action {

	public void moveSomewhere(Map map, Creature initiator, int direction){

		int[] c = map.getCreatures().find(initiator);
		map.setCreature(c[0], c[1], null);
		
		int rowsNum = 0;
		int colsNum = 0;
		
	        switch (direction) {

        	case 1:	rowsNum = 1;
        			colsNum = -1;
					break;
        	case 2:	rowsNum = 1;
        			colsNum = 0;
					break;
        	case 3:	rowsNum = 1;
        			colsNum = 1;
        			break;
        	case 4:	rowsNum = 0;
        			colsNum = -1;
					break;
        	case 5:	rowsNum = 0;
        			colsNum = 0;
        			break;
        	case 6:	rowsNum = 0;
        			colsNum = 1;
					break;
        	case 7:	rowsNum = -1;
        			colsNum = -1;
        			break;
        	case 8:	rowsNum = -1;
        			colsNum = 0;
        			break;
        	case 9:	rowsNum = -1;
        			colsNum = 1;
        			break;
        	default: break;
	        }		
		
		rowsNum = c[1] + rowsNum;
		colsNum = c[0] + colsNum;
				
		map.setCreature(colsNum, rowsNum, initiator);	
	
	}
	
}