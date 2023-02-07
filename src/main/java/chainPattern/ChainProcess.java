package chainPattern;

public class ChainProcess {
	
	public static void main(String[] args) {
		
		LeaveProcess manager = new Manager();
		LeaveProcess managerDR = new ManagerDirector();
		LeaveProcess managerDHR = new ManagerDirectorHR();
		
		manager.LeaveApply(managerDR);
		managerDR.LeaveApply(managerDHR);
		
		Leave leave =  new Leaveinfo();
		leave.numberofleaves(10);
	}

}
