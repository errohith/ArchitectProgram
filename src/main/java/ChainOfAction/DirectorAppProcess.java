package ChainOfAction;

public class DirectorAppProcess implements LeaveProcess{

	private LeaveProcess nextprocess;
	

	@Override
	public void setNextApproval(LeaveProcess nextProcess) {
		this.nextprocess = nextProcess;
		
	}

	@Override
	public boolean process(int numberOfLeave) {
		System.out.println("Director has prooved");
		if (numberOfLeave >30) {
		
			return nextprocess.process(numberOfLeave);
		}
		return false;
	}
	
	
}