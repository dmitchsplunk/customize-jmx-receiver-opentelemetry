// Query the target JMX server for the desired MBean and create a helper representing the first result
def loadMBean = otel.mbean("jmx-java-app:name=InvocationCountBean")

// Create a LongValueCallback which will set the instrument value to the
// loadMBean's most recent `Count` attribute's long value.  The instrument will have a
// name of "invocation.count" and the specified description and unit, respectively.
otel.instrument(
        loadMBean, "invocation.count",
        "The number of invocations",
        "By", "NumInvocations", otel.&longCounterCallback
)