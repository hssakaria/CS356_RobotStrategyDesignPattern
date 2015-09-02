package RobotUI;

import javax.swing.JFrame;

import Interfaces.IBehaviour;

/*****************************************************
 * NormalBehaviour Class
 * @author hetu
 *
 *****************************************************/
class NormalBehaviour implements IBehaviour{
	
	JFrame frame;
	
	public NormalBehaviour(JFrame frame){
		this.frame = frame;
	}
	
	public String moveCommand(){
		
		return "Normal Behaviour: if find another robot ignore it";
		
	}
	
	public String titleCommand(){
		return "Normal Behaviour";
	}
}