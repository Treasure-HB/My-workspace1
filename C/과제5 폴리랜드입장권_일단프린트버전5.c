#include <stdio.h>
#include <string.h>
#include <time.h>

int main(){

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
	
	//2.주민번호 
	char inputBirth[10], inputYear[10];
	int nowYear, age;; 
	printf("생년월일을 입력하세요 Ex) 1900-01-01.\n");
	scanf("%s", &inputBirth);
	
		//2-1 나이계산
		struct tm * time_info;
		time_t now = time(NULL);
    	time_info = localtime(&now);
		nowYear = time_info->tm_year + 1900; //->올해 
		strncpy(inputYear,inputBirth,4); //->생년월일에서 연도 추출 
		age = nowYear- atoi(inputYear);	 
	
	//3. 나이에 따른 권종가격 출력 
	if(inputticket == 1){
		if(age <= 2){
			ticketPrice = babyPrice;
		} else if(age > 2 && age < 13){
			ticketPrice = childDayPrice;
		} else if(age > 12 && age < 19){
			ticketPrice = teenDayPrice;
		} else if(age > 18 && age < 65){
			ticketPrice = adultDayPrice;
		} else{
			ticketPrice = grandDayPrice;
		}
	}
	else if (inputticket == 2){
		if(age <= 2){
			ticketPrice = babyPrice;
		} else if(age > 2 && age < 13){
			ticketPrice = childNightPrice;
		} else if(age > 12 && age < 19){
			ticketPrice = teenNightPrice;
		} else if(age > 18 && age < 65){
			ticketPrice = adultNightPrice;
		} else{
			ticketPrice = grandNightPrice;
		}	
	}
	else {
		printf("1 과 2 중에 선택해주세요\n");
	}
	
	//4. 수량 
	int maxCount = 10, minCount = 1;
	int count, totalTicketPrice; 
	printf("몇 개를 주문하시겠습니까?(최대 10개)\n");
	scanf("%d", &count);
	
	if(count >= minCount && count <= maxCount){
		totalTicketPrice = ticketPrice * count;
	}else {
		printf("잘못입력하셨습니다\n");
		count = 0;
	}

	//5. 우대사항 
	int priority,totalPrice;
	printf("우대사항을 선택하세요.\n");
	printf("1. 없음(나이 우대는 자동처리)\n");
	printf("2. 장애인\n");
	printf("3. 국가유공자\n");
	printf("4. 다자녀\n");
	printf("5. 임산부\n");
	scanf("%d", &priority);
	
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
	
	//7.계속 vs 종료 
	int continueOrNot; 
	printf("계속 발권하시겠습니까?\n");
	printf("1. 티켓 발권\n");
	printf("2. 종료\n");
	scanf("%d", &continueOrNot);
	
	if(continueOrNot == 1){
		continue; 
	} else if(continueOrNot == 2){
		
		printf("티켓 발권을 종료합니다. 감사합니다\n");
		printf("\n");
		printf("==================== 에버랜드===================\n");
		printf("\n"); 
		
		//7-1
		if(inputticket == 1){
			printf("주간권 ");
		}
		else if (inputticket == 2){
			printf("야간권 ");
		}
			
		//7-2
		if(ticketPrice == babyPrice){
			printf("유아");
		} else if(ticketPrice == childDayPrice){
			printf("소인");
		} else if(ticketPrice == teenDayPrice){
			printf("청소년");
		} else if(ticketPrice == adultDayPrice){
			printf("대인");
		} else{
			printf("경로");	
		} 
		
		//7-3
		printf(" X %d ",count);
		
		//7-4
		printf("%3d",totalPrice);
		
		//7-5
		if(priority == 1){
			printf(" *우대적용 없음\n");
		}else if (priority == 2){
			printf(" 장애인 우대적용\n");
		}else if (priority == 3){
			printf(" 국가유공자 우대적용\n");
		}else if (priority == 4){
			printf(" 다자녀 우대적용\n");
		}else if (priority == 5){
			printf(" 임산부 우대적용\n");
		}
		
		//7-6
		printf("입장료 총액은 %d원 입니다\n",totalPrice);
		printf("================================================\n");	
	}
	}	 	 
	return 0;
	}
