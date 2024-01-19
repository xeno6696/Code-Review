import java.util.*;

// javac OutOfMemoryErrorExamples.java && java OutOfMemoryErrorExamples thecontrol

public class OutOfMemoryErrorExamples {

	private static void doOutOfMemory() throws Exception {
		Integer[] array = new Integer[100000 * 100000];
	}

	private static void printMethodName(final int depth) {
		final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		final String methodName = ste[ste.length - 1 - depth].getMethodName();
		System.out.println(methodName);
	}

	private static void theControl() throws Exception {
		printMethodName(1);
		doOutOfMemory();
	}

	private static void catchException() {
		printMethodName(1);
		try {
			doOutOfMemory();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	private static void catchThrowable() {
		printMethodName(1);
		try {
			doOutOfMemory();
		} catch (Throwable t) {
			System.out.println(t.toString());
		}
	}

	private static void catchOutOfMemoryError() throws Exception {
		printMethodName(1);
		try {
			doOutOfMemory();
		} catch (OutOfMemoryError t) {
			System.out.println(t.toString());
		}
	}

	private static void catchRuntimeException() throws Exception {
		printMethodName(1);
		try {
			doOutOfMemory();
		} catch (RuntimeException ex) {
			System.out.println(ex.toString());
		}
	}

	public static void printHelp(){
		final String help =     "--Help--\n" +
					"java OutOfMemoryErrorExamples <method>\n" +
					"Application demonstrates that out of memory exceptions are only\n" +
					"caught under specific conditions.\n\n" +
					"method:\n" +
					"- thecontrol OR 1: causes an OutOfMemoryError to be thrown\n" +
					"- catchexception OR 2: attempts to catch OutOfMemoryError in a\n" +
					"\ttry/catch block as type \"Exception\"\n" +
					"- catchthrowable OR 3: attempts to catch OutOfMemoryError in a\n" +
					"\ttry/catch block as type \"Throwable\"\n" +
					"- catchoutofmemoryerror OR 4: attempts to catch OutOfMemoryError in a\n" +
					"\ttry/catch block as type \"OutOfMemoryError\"\n" +
					"- catchruntimeexception OR 5: attempts to catch OutOfMemoryError in a\n" +
					"\ttry/catch block as type \"RuntimeException\"\n";
		System.out.println(help);
	}

	public static void main(String args[]) throws Exception{
		String option = "";
		if (args.length > 0) {
			option = args[0].toLowerCase();
			switch(option) {
				case "thecontrol":
				case "1":
					theControl();
					break;
				case "catchexception":
				case "2":
					catchException();
					break;
				case "catchthrowable":
				case "3":
					catchThrowable();
					break;
				case "catchoutofmemoryerror":
				case "4":
					catchOutOfMemoryError();
					break;
				case "catchruntimeexception":
				case "5":
					catchRuntimeException();
					break;
				case "":
				case "help":
				case "-h":
				case "-?":
					option = "";
					break;
				default:
					System.out.println(String.format("\nERROR: \"%s\" is not a valid method!\n\n", option));
					option = "";
					break;
			}
			if (option != "") {
				System.out.println("exception caught");
			}
		} 

		if (option == "") {
			printHelp();
		}
	}
}
