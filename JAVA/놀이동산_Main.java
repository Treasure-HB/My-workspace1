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
		
		peoplecount = 0;
		
		do {
			
		//1.주간 vs 야간
		print.Print1();
		input.setINPUT_TICKET_TIME();
		run.Run1();
		
		//2.대인 vs 소인
		print.Print2();
		input.setINPUT_PEOPLE_AGE();
		run.Run2();
		
		//3.수량
		print.Print3();
		input.setINPUT_TICKET_COUNT();
		run.Run3();
		
		//5. 우대사항
		print.Print5();
		input.setINPUT_PRIORITY();
		run.Run5();
		
		//7. 종료
		print.Print7();
		input.setENDOPTION();
		peoplecount ++;
		
		//8. Orderlist
		run.InsertOrderList();//순서가 중요한거였음ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		
		print.Print_Orderlist(); //-> orderlist 출력
		print.Print8();
		
		
	}
	
	
	
	
	
	
	
	
	

	public static int getPeoplecount() {
		return peoplecount;
	}

	public static void setPeoplecount(int peoplecount) {
		Main.peoplecount = peoplecount;
	}
		


}
