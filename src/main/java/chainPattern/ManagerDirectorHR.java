package chainPattern;

public class ManagerDirectorHR implements LeaveProcess{

	private LeaveProcess nextProcess;

	@Override
	public void LeaveApply(LeaveProcess nextProcess) {
		// TODO Auto-generated method stub
		this.nextProcess = nextProcess;
	}

	public boolean Leave(int numberofleave) {
		System.out.println("Manager Director and HR Approved");
		if (numberofleave > 30 ) {
			return nextProcess.Leave(numberofleave);
		}
		
		return false;
	}

	
}
