package test;

public interface InvocationCountMBean {
    public void setNumInvocations(int numInvocations);
    public int getNumInvocations();
    public void incrementNumInvocations();
}