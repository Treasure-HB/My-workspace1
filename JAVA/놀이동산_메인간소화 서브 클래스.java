package 폴리랜드;

public class Repeat {
	Input input = new Input();
	Run run = new Run();
	Print print = new Print();
	
	public void repeat() {
		
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
	}
}
