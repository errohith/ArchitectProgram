package ChainOfActionPOM;

public interface CreateLeadFunction {
	
	public void createLead(CreateLeadFunction nextProcess);
	public boolean process();
}