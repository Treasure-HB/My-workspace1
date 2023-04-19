package 폴리랜드;

public class ConstValue {
	
	public static final String BABY = "유아";
	public static final String CHILD = "소인";
	public static final String TEEN = "청소년";
	public static final String ADULT = "대인";
	public static final String GRAND = "경로";
	
	public static final int BABY_PRICE = 0;
	public static final int adultDayPrice = 56000;
	public static final int teenDayPrice = 47000; 
	public static final int childDayPrice = 44000;
	public static final int grandDayPrice= 44000;
	
	public static final int adultNightPrice = 46000;
	public static final int teenNightPrice = 40000;
	public static final int childNightPrice = 37000;
	public static final int grandNightPrice = 37000; 
	
	public static int input_ticket_type;
	public static int basic_ticketPrice; //->기본요금 
	public static int total_ticketPrice;//->기본요금 * 수량 
	public static int final_ticketPrice;//->기본요금 * 수량 * 우대사항 

	public static int ENDOPTION = 1; //종료
	
}
