package 폴리랜드;

import java.util.ArrayList;
import java.util.List;

public class Listsaving { //바구니

	/* 자료형태 상관없이 내가 만들고싶은 배열 만들기*/
	
	//<OderList - 1> 객체 생성, 초기화 (전역변수처럼 선언)
	public static List<OrderList> data = new ArrayList<>();
	OrderList orderList = null;
	
	/*<OderList - 4> 내가 원하는 형태대로 인자를 받는 메소드 생성하고, orderlist전역변수와 메소드 인자 연결!
	 *<OderList - 5> orderlist 객체에 add함수 이용하여 세트로 넣는 형태 취하기*/
	
	public void OrderList(String ticketTime, String ticketType, int ticketCount, int final_ticketPrice, String ticket_priority) {
		OrderList order = new OrderList();
		
//		System.out.println("asd" + ticketTime);
//		System.out.println("asd" + ticketCount);
//		System.out.println("asd" + final_ticketPrice);
//		System.out.println("asd" + ticket_priority);
//		System.out.println("asd" + ticketType);
		
		order.setTicketTime(ticketTime);
		order.setTicketType(ticketType);
		order.setTicketCount(ticketCount);
		order.setFinal_ticketPrice(final_ticketPrice);
		order.setTicket_priority(ticket_priority);
		
		data.add(order);
	}

	public List<OrderList> getData() {
		return data;
	}
}
