package ��������;

public class Main {
		/* 1. orderlist ���� �Ű澵 ��
		 * 2. �Լ��� ���� �ٸ�������(����) ȣ�� or ������ ���ϸ� �۵��� �ȵ�
		 */
		private static int peoplecount;
	
	public static void main(String[] args) {
		Input input = new Input();
		Run run = new Run();
		Print print = new Print();
		
		peoplecount = 0;
		
		do {
			
		//1.�ְ� vs �߰�
		print.Print1();
		input.setINPUT_TICKET_TIME();
		run.Run1();
		
		//2.���� vs ����
		print.Print2();
		input.setINPUT_PEOPLE_AGE();
		run.Run2();
		
		//3.����
		print.Print3();
		input.setINPUT_TICKET_COUNT();
		run.Run3();
		
		//5. ������
		print.Print5();
		input.setINPUT_PRIORITY();
		run.Run5();
		
		//7. ����
		print.Print7();
		input.setENDOPTION();
		peoplecount ++;
		
		//8. Orderlist
		run.InsertOrderList();//������ �߿��Ѱſ����ФФФФФФФФФФ�
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		
		print.Print_Orderlist(); //-> orderlist ���
		print.Print8();
		
		
	}
	
	
	
	
	
	
	
	
	

	public static int getPeoplecount() {
		return peoplecount;
	}

	public static void setPeoplecount(int peoplecount) {
		Main.peoplecount = peoplecount;
	}
		


}
