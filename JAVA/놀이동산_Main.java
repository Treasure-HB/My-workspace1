package 虹軒沓球;

public class Main {
		/* 1. orderlist 授辞 重井承 依
		 * 2. 敗呪研 幻級嬢亀 陥献員拭辞(五昔) 硲窒 or 叔楳聖 照馬檎 拙疑戚 照喫
		 */
		private static int peoplecount;
	
	public static void main(String[] args) {
		Input input = new Input();
		Run run = new Run();
		Print print = new Print();
		
		peoplecount = 0;
		
		do {
			
		//1.爽娃 vs 醤娃
		print.Print1();
		input.setINPUT_TICKET_TIME();
		run.Run1();
		
		//2.企昔 vs 社昔
		print.Print2();
		input.setINPUT_PEOPLE_AGE();
		run.Run2();
		
		//3.呪勲
		print.Print3();
		input.setINPUT_TICKET_COUNT();
		run.Run3();
		
		//5. 酔企紫牌
		print.Print5();
		input.setINPUT_PRIORITY();
		run.Run5();
		
		//7. 曽戟
		print.Print7();
		input.setENDOPTION();
		peoplecount ++;
		
		//8. Orderlist
		run.InsertOrderList();//授辞亜 掻推廃暗心製ばばばばばばばばばばば
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		
		print.Print_Orderlist(); //-> orderlist 窒径
		print.Print8();
		
		
	}
	
	
	
	
	
	
	
	
	

	public static int getPeoplecount() {
		return peoplecount;
	}

	public static void setPeoplecount(int peoplecount) {
		Main.peoplecount = peoplecount;
	}
		


}
