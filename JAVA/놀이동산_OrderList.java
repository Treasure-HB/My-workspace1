package 폴리랜드;

public class OrderList {

	//<OderList - 2> 내가 넣고싶은 형태로 넣을 private 전역변수 선언
	private String ticketTime;
	private String ticketType;
	private int ticketCount;
	private int final_ticketPrice;
	private String ticket_priority;

	//<OderList - 3> 전역변수의 getter,setter 선언
	public String getTicketTime() {
		return ticketTime;
	}
	public void setTicketTime(String ticketTime) {
		this.ticketTime = ticketTime;
	}

	public String getTicketType() {
		return ticketType;
	}


	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}


	public int getTicketCount() {
		return ticketCount;
	}


	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}


	public int getFinal_ticketPrice() {
		return final_ticketPrice;
	}


	public void setFinal_ticketPrice(int final_ticketPrice) {
		this.final_ticketPrice = final_ticketPrice;
	}


	public String getTicket_priority() {
		return ticket_priority;
	}


	public void setTicket_priority(String ticket_priority) {
		this.ticket_priority = ticket_priority;
	}
}
	
	
	
	

	