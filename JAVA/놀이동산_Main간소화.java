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
