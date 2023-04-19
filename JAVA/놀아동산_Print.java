package 폴리랜드;

public class Print {
	Run run = new Run();
	Main main = new Main();
	private static int getPrice = 0;
	

	public void Print1() {
		System.out.println("권종을 입력하세요");
		System.out.println("1. 주 간 권");
		System.out.println("2. 야 간 권");
	}
	
	public void Print2() {
		System.out.println("생년월일을 입력하세요 ex)1900-01-01");
	}
	
	public void Print3() {
		System.out.println("몇 장 주문하시겠습니까(최대 10장)");
	}

	public void Print5() {
		System.out.println("우대사항을 선택하세요");
		System.out.println("1. 없음(나이우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
	}
	
	public void Print7() {
		System.out.println("계속하시겠습니까  1. 계속  2.종료");	
	}
	
	//<OderList - 6> orderlist설정한 클래스 불러와서 for문 이용해 넣기 
	public void Print_Orderlist() {
		System.out.println("-------------------------------------------------");
		System.out.printf("%3s%8s%6s%6s%10s\n","시간","권종","수량","가격","우대사항");
		System.out.println("-------------------------------------------------");
		
		//orderlist
		Listsaving data = new Listsaving();
		for(OrderList order : Listsaving.data) {
			System.out.printf("%3s%7s%6d%10d%10s\n", order.getTicketTime(), order.getTicketType(), 
					order.getTicketCount(),order.getFinal_ticketPrice(), order.getTicket_priority());
					
			getPrice += order.getFinal_ticketPrice(); //getPrice 전역변수에 리스트값 축적
			}
	}
	
	 public void Print8() {
		int total = 0;
		int orderTotal = 0;
			for(int i = 0; i < main.getPeoplecount() ; i++) { //main함수 peoplecount 만큼 반복
				orderTotal = getPrice;	
				total += orderTotal;
			}
			
		System.out.println("-------------------------------------------------");
		System.out.printf("%s\n","합 계");
		System.out.printf("%47d\n", orderTotal);
		System.out.println("-------------------------------------------------");
	}
}
	
	
	
	
	
	













