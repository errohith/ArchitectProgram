package chainPattern;

public class Manager implements LeaveProcess{

	private LeaveProcess nextProcess;

	@Override
	public void LeaveApply(LeaveProcess nextProcess) {
		// TODO Auto-generated method stub
		this.nextProcess = nextProcess;
	}

	public boolean Leave(int numberofleave) {
		System.out.println("Manager Approved");
		if (numberofleave > 7 ) {
			return nextProcess.Leave(numberofleave);
		}
		
		return false;
	}

	
}
