package ChainOfAction;

public interface LeaveProcess {
	
	public void setNextApproval(LeaveProcess nextLeaveProcess);
	public boolean process(int numberOfLeave);

}