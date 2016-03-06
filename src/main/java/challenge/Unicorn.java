package challenge;

public class Unicorn {
    private static int previousLineNumber = -1;
    private final static int LOGGER_METHOD_CALL_LOCATION = 2;

	public static boolean pat() {
	    int lineNumber = Thread.currentThread().getStackTrace()[LOGGER_METHOD_CALL_LOCATION].getLineNumber();
        boolean isNewLineNumber = lineNumber != previousLineNumber;
        previousLineNumber = lineNumber;
        return isNewLineNumber;
	}

}
