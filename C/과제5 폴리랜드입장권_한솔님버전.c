#include <stdio.h>
#include <string.h>
#include <time.h>


int main(){
	
	//0.사용자 저장변수(구조체선언 )
	struct product{
		char ticket_Type[50];
		char ticket_Age[50];
		int ticket_quantity;
		int ticket_totalPrice;
		char ticket_priority[50];
	};
	struct product products[100];
	int ticket_count = 0; 

	while(1){		
	//1. 권종 
	const int babyPrice = 0;
	const int adultDayPrice = 56000, teenDayPrice = 47000, childDayPrice = 44000, grandDayPrice= 44000;
	const int adultNightPrice = 46000, teenNightPrice = 40000, childNightPrice = 37000, grandNightPrice = 37000; 
	
	int inputticket, i, ticketPrice;
	
	
	printf("권종을 선택하세요.\n");
	printf("1. 주간권\n");
	printf("2. 야간권\n");
	scanf("%d", &inputticket);
	
	if(inputticket == 1){
		strcpy(ticket_type,"주간권");
	} else if(inputticket == 2){
		strcpy(ticket_type,"야간권");
	}
	strncpy(tickets[quantity][0],ticket_type,20); //->배열저장 
	
	//2.주민번호 
	char inputBirth[10], inputYear[10];
	int nowYear, age;; 
	printf("생년월일을 입력하세요 Ex) 1900-01-01.\n");
	scanf("%s", inputBirth);
	
		//2-1 나이계산
		struct tm * time_info;
		time_t now = time(NULL);
    	time_info = localtime(&now);
		nowYear = time_info->tm_year + 1900; //->올해 
		strncpy(inputYear,inputBirth,4); //->생년월일에서 연도 추출 
		age = nowYear- atoi(inputYear);	 
	
	//3. 나이에 따른 권종가격 출력 
	char ticket_age[30];
	if(inputticket == 1){
		if(age <= 2){
			ticketPrice = babyPrice;
			strcpy(ticket_age, "유아");
		} else if(age > 2 && age < 13){
			ticketPrice = childDayPrice;
			strcpy(ticket_age, "소인");
		} else if(age > 12 && age < 19){
			ticketPrice = teenDayPrice;
			strcpy(ticket_age, "청소년");
		} else if(age > 18 && age < 65){
			ticketPrice = adultDayPrice;
			strcpy(ticket_age, "대인");
		} else{
			ticketPrice = grandDayPrice;
			strcpy(ticket_age, "경로");
		}
	}
	else if (inputticket == 2){
		if(age <= 2){
			ticketPrice = babyPrice;
			strcpy(ticket_age, "유아");
		} else if(age > 2 && age < 13){
			ticketPrice = childNightPrice;
			strcpy(ticket_age, "소인");
		} else if(age > 12 && age < 19){
			ticketPrice = teenNightPrice;
			strcpy(ticket_age, "청소년");
		} else if(age > 18 && age < 65){
			ticketPrice = adultNightPrice;
			strcpy(ticket_age, "대인");
		} else{
			ticketPrice = grandNightPrice;
			strcpy(ticket_age, "경로");
		}	
	}
	else {
		printf("1 과 2 중에 선택해주세요\n");
	}
	strncpy(tickets[quantity][1], ticket_age,20); //->배열저장 
	
	//4. 수량 
	int maxCount = 10, minCount = 1;
	int count, totalTicketPrice; 
	char countcount[10];
	printf("몇 개를 주문하시겠습니까?(최대 10개)\n");
	scanf("%d", &count);
	
	if(count >= minCount && count <= maxCount){
		totalTicketPrice = ticketPrice * count;
	}else {
		printf("잘못입력하셨습니다\n");
		count = 0;
	}
	sprintf(countcount, "%d", count);
	strncpy(tickets[quantity][2],countcount,20);//->배열저장 

	//5. 우대사항 
	int priority,totalPrice;
	char priority_str[MAX_STRING_LENGTH];
	//char prioritytrue[MAX_STRING_LENGTH][5][20];
	printf("우대사항을 선택하세요\n");
	printf("1. 없음(나이 우대는 자동처리)\n");
	printf("2. 장애인\n");
	printf("3. 국가유공자\n");
	printf("4. 다자녀\n");
	printf("5. 임산부\n");
	scanf("%d", &priority);
	
	if(priority == 1){
		strcpy(priority_str, "*우대적용 없음");	
	} else if(priority == 2 ){
		strcpy(priority_str, "장애인 우대적용");
	}else if(priority == 3 ){
		strcpy(priority_str, "국가유공자 우대적용");
	}else if(priority == 4 ){
		strcpy(priority_str, "다자녀 우대적용");
	}else if(priority == 5 ){
		strcpy(priority_str, "임산부 우대적용");
	}else {
		printf("잘못된 입력입니다.\n");
    	continue; 
	}
	strncpy(tickets[quantity][4],priority_str,30);//->배열저장 
	
	switch (priority){
		case 1 : totalPrice = totalTicketPrice; 
		break;
		
		case 2 : totalPrice = totalTicketPrice * 0.4;
		break;
		
		case 3 : totalPrice = totalTicketPrice * 0.5; 
		break;
		
		case 4 : totalPrice = totalTicketPrice * 0.2;
		break;
		
		case 5 : totalPrice = totalTicketPrice * 0.15;
		break;
		
		default : 
			printf("잘못선택하셨습니다\n");
			break;
	}
		
	//6. 총 가격 
	printf("가격은 %d원 입니다\n",totalPrice); 
	printf("감사합니다\n");
	char ticket_totalPrice[10];
	sprintf(ticket_totalPrice,"%d",totalPrice);
	strcpy(tickets[quantity][3],ticket_totalPrice); 
	
	//7.계속 vs 종료 
	int continueOrNot; 
	printf("계속 발권하시겠습니까?\n");
	printf("1. 티켓 발권\n");
	printf("2. 종료\n");
	scanf("%d", &continueOrNot);
	
	if(continueOrNot == 1){
		//quantity++;
		continue; 
	} else if(continueOrNot == 2){
		
		printf("%s",tickets[0][0]);
		printf("%s",tickets[1][1]);
		printf("%s",tickets[2][2][2]);
		printf("%s",tickets[3][3][3]);
		printf("%s",tickets[4][4][4]);
		
		
		printf("\n");
		printf("감사합니다\n");
		printf("\n");
		printf("==================== 에버랜드===================\n");
		printf("\n"); 
		
	
		
		
//		for(i = 0; i < MAX_TICKETS; i++){
//			printf("%s %s %s %s %s",tickets[i][i][0],tickets[i][i][1],tickets[i][i][2],tickets[i][i][0],tickets[i][i][0]);
//		}
	}	
	
	break;
	}
	 	 
	return 0;
	}
	
		
//		//7-1
//		if(inputticket == 1){
//			printf("주간권 ");
//		}
//		else if (inputticket == 2){
//			printf("야간권 ");
//		}
//			
//		//7-2
//		if(ticketPrice == babyPrice){
//			printf("유아");
//		} else if(ticketPrice == childDayPrice){
//			printf("소인");
//		} else if(ticketPrice == teenDayPrice){
//			printf("청소년");
//		} else if(ticketPrice == adultDayPrice){
//			printf("대인");
//		} else{
//			printf("경로");	
//		} 
//		
//		//7-3
//		printf(" X %d ",count);
//		
//		//7-4
//		printf("%3d",totalPrice);
//		
//		//7-5
//		if(priority == 1){
//			printf(" *우대적용 없음\n");
//		}else if (priority == 2){
//			printf(" 장애인 우대적용\n");
//		}else if (priority == 3){
//			printf(" 국가유공자 우대적용\n");
//		}else if (priority == 4){
//			printf(" 다자녀 우대적용\n");
//		}else if (priority == 5){
//			printf(" 임산부 우대적용\n");
//		}
//		
//		//7-6
//		printf("입장료 총액은 %d원 입니다\n",totalPrice);
//		printf("================================================\n");	

