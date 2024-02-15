package test;

public class InvocationCount implements InvocationCountMBean {
    private int numInvocations = 0;

    public InvocationCount() {
    }

    public void setNumInvocations(int message) {
        this.numInvocations = numInvocations;
    }

    public int getNumInvocations() {
        return numInvocations;
    }

    public void incrementNumInvocations() {
        numInvocations++;
    }

}