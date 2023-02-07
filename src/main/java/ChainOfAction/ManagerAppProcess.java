package ChainOfAction;

public class ManagerAppProcess implements LeaveProcess{
	
	private LeaveProcess nextprocess;
			

	@Override
	public void setNextApproval(LeaveProcess nextProcess) {
		this.nextprocess = nextProcess;
		
	}

	@Override
	public boolean process(int numberOfLeave) {
		System.out.println("Manager has Approved");
		if (numberOfLeave >7) {
		
			return nextprocess.process(numberOfLeave);
		}
		return false;
	}
	
	

}
