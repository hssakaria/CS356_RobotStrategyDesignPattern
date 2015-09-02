package RobotUI;

import javax.swing.JFrame;

import Interfaces.IBehaviour;

/*****************************************************
* DefensiveBehaviour Class
* @author hetu
*
*****************************************************/

class DefensiveBehaviour implements IBehaviour{
	
	JFrame frame;
	
	public DefensiveBehaviour(JFrame frame){
		this.frame = frame;
	}
	public String moveCommand(){
		
		return "Defensive Behaviour: if find another robot run from it";
	}
	
	public String titleCommand(){
		return "Defensive Behaviour";
	}
}