package challenge;

public class Unicorn {
	private static int previousLineNumber = -1;

	public static boolean pat() {
		int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        boolean isNewLineNumber = lineNumber != previousLineNumber;
        previousLineNumber = lineNumber;
        return isNewLineNumber;
	}

}
