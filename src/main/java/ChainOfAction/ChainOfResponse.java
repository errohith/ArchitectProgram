package ChainOfAction;

public class ChainOfResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveProcess manager =  new ManagerAppProcess();
		LeaveProcess director =  new DirectorAppProcess();
		LeaveProcess hr =  new HRAppProcess();
		
		manager.setNextApproval(director);
		director.setNextApproval(hr);
		manager.process(2);
		

	}

}
