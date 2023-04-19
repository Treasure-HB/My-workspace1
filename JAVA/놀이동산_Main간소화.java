package 폴리랜드;

public class Main {
		/* 1. orderlist 순서 신경쓸 것
		 * 2. 함수를 만들어도 다른곳에서(메인) 호출 or 실행을 안하면 작동이 안됨
		 */
		private static int peoplecount;
	
	public static void main(String[] args) {
		Input input = new Input();
		Run run = new Run();
		Print print = new Print();
		Repeat repeat = new Repeat();
		
		peoplecount = 0;
		
		do {
			repeat.repeat();
			peoplecount ++;
		
		run.InsertOrderList();
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		
		print.Print_Orderlist();
		print.Print8();
	}
	
	
	public static int getPeoplecount() {
		return peoplecount;
	}

	public static void setPeoplecount(int peoplecount) {
		Main.peoplecount = peoplecount;
	}
}
