package chainPattern;

public interface LeaveProcess {

	public void LeaveApply(LeaveProcess nextProcess);
	public boolean Leave (int numberofleave);
	
}
