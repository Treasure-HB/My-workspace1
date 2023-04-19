package 폴리랜드;

import java.util.Scanner;

public class Input {
	static Scanner scanner = new Scanner(System.in);
	private static int INPUT_TICKET_TIME;
	private static String INPUT_PEOPLE_AGE;
	private static int INPUT_TICKET_COUNT;
	private static int INPUT_PRIORITY;
	private static int ENDOPTION;
	
	//setter
	public static void setINPUT_TICKET_TIME() {
		INPUT_TICKET_TIME = scanner.nextInt();
	}
	public static void setINPUT_PEOPLE_AGE() {
		INPUT_PEOPLE_AGE = scanner.next();	
	}
	public static void setINPUT_TICKET_COUNT() {
		INPUT_TICKET_COUNT = scanner.nextInt();
	}
	public static void setINPUT_PRIORITY() {
		INPUT_PRIORITY = scanner.nextInt();
	}
	public static void setENDOPTION() {
		ENDOPTION = scanner.nextInt();
	}	
	
	//getter
	public static int getINPUT_TICKET_TIME() {
		return INPUT_TICKET_TIME;
	}
	
	public static String getINPUT_PEOPLE_AGE() {
		return INPUT_PEOPLE_AGE;
	}
	
	public static int getINPUT_TICKET_COUNT() {
		return INPUT_TICKET_COUNT;
	}
	
	public static int getINPUT_PRIORITY() {
		return INPUT_PRIORITY;
	}
	
	public static int getENDOPTION() {
		return ENDOPTION;
	}
}	
	


