package ��������;

public class Print {
	Run run = new Run();
	Main main = new Main();
	private static int getPrice = 0;
	

	public void Print1() {
		System.out.println("������ �Է��ϼ���");
		System.out.println("1. �� �� ��");
		System.out.println("2. �� �� ��");
	}
	
	public void Print2() {
		System.out.println("��������� �Է��ϼ��� ex)1900-01-01");
	}
	
	public void Print3() {
		System.out.println("�� �� �ֹ��Ͻðڽ��ϱ�(�ִ� 10��)");
	}

	public void Print5() {
		System.out.println("�������� �����ϼ���");
		System.out.println("1. ����(���̿��� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
	}
	
	public void Print7() {
		System.out.println("����Ͻðڽ��ϱ�  1. ���  2.����");	
	}
	
	//<OderList - 6> orderlist������ Ŭ���� �ҷ��ͼ� for�� �̿��� �ֱ� 
	public void Print_Orderlist() {
		System.out.println("-------------------------------------------------");
		System.out.printf("%3s%8s%6s%6s%10s\n","�ð�","����","����","����","������");
		System.out.println("-------------------------------------------------");
		
		//orderlist
		Listsaving data = new Listsaving();
		for(OrderList order : Listsaving.data) {
			System.out.printf("%3s%7s%6d%10d%10s\n", order.getTicketTime(), order.getTicketType(), 
					order.getTicketCount(),order.getFinal_ticketPrice(), order.getTicket_priority());
					
			getPrice += order.getFinal_ticketPrice(); //getPrice ���������� ����Ʈ�� ����
			}
	}
	
	 public void Print8() {
		int total = 0;
		int orderTotal = 0;
			for(int i = 0; i < main.getPeoplecount() ; i++) { //main�Լ� peoplecount ��ŭ �ݺ�
				orderTotal = getPrice;	
				total += orderTotal;
			}
			
		System.out.println("-------------------------------------------------");
		System.out.printf("%s\n","�� ��");
		System.out.printf("%47d\n", orderTotal);
		System.out.println("-------------------------------------------------");
	}
}
	
	
	
	
	
	













