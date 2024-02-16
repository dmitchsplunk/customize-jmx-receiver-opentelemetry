package test;

public class InvocationCount implements InvocationCountMBean {
    private static Integer numInvocations = 0;

    public InvocationCount() {
    }

    @Override
    public Integer getNumInvocations() {
        return numInvocations;
    }

    public static void incrementNumInvocations() {
        numInvocations += 1;
    }

}