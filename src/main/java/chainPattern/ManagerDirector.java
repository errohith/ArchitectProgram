package chainPattern;

public class ManagerDirector implements LeaveProcess{

	private LeaveProcess nextProcess;

	@Override
	public void LeaveApply(LeaveProcess nextProcess) {
		// TODO Auto-generated method stub
		this.nextProcess = nextProcess;
	}

	public boolean Leave(int numberofleave) {
		System.out.println("Manager and Director Approved");
		if (numberofleave > 10 ) {
			return nextProcess.Leave(numberofleave);
		}
		
		return false;
	}

	
}
