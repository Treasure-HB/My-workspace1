#include <stdio.h>
#include <string.h>
#include <time.h>


int main(){
	
	//0.����� ���庯��(����ü���� )
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
	//1. ���� 
	const int babyPrice = 0;
	const int adultDayPrice = 56000, teenDayPrice = 47000, childDayPrice = 44000, grandDayPrice= 44000;
	const int adultNightPrice = 46000, teenNightPrice = 40000, childNightPrice = 37000, grandNightPrice = 37000; 
	
	int inputticket, i, ticketPrice;
	
	
	printf("������ �����ϼ���.\n");
	printf("1. �ְ���\n");
	printf("2. �߰���\n");
	scanf("%d", &inputticket);
	
	if(inputticket == 1){
		strcpy(ticket_type,"�ְ���");
	} else if(inputticket == 2){
		strcpy(ticket_type,"�߰���");
	}
	strncpy(tickets[quantity][0],ticket_type,20); //->�迭���� 
	
	//2.�ֹι�ȣ 
	char inputBirth[10], inputYear[10];
	int nowYear, age;; 
	printf("��������� �Է��ϼ��� Ex) 1900-01-01.\n");
	scanf("%s", inputBirth);
	
		//2-1 ���̰��
		struct tm * time_info;
		time_t now = time(NULL);
    	time_info = localtime(&now);
		nowYear = time_info->tm_year + 1900; //->���� 
		strncpy(inputYear,inputBirth,4); //->������Ͽ��� ���� ���� 
		age = nowYear- atoi(inputYear);	 
	
	//3. ���̿� ���� �������� ��� 
	char ticket_age[30];
	if(inputticket == 1){
		if(age <= 2){
			ticketPrice = babyPrice;
			strcpy(ticket_age, "����");
		} else if(age > 2 && age < 13){
			ticketPrice = childDayPrice;
			strcpy(ticket_age, "����");
		} else if(age > 12 && age < 19){
			ticketPrice = teenDayPrice;
			strcpy(ticket_age, "û�ҳ�");
		} else if(age > 18 && age < 65){
			ticketPrice = adultDayPrice;
			strcpy(ticket_age, "����");
		} else{
			ticketPrice = grandDayPrice;
			strcpy(ticket_age, "���");
		}
	}
	else if (inputticket == 2){
		if(age <= 2){
			ticketPrice = babyPrice;
			strcpy(ticket_age, "����");
		} else if(age > 2 && age < 13){
			ticketPrice = childNightPrice;
			strcpy(ticket_age, "����");
		} else if(age > 12 && age < 19){
			ticketPrice = teenNightPrice;
			strcpy(ticket_age, "û�ҳ�");
		} else if(age > 18 && age < 65){
			ticketPrice = adultNightPrice;
			strcpy(ticket_age, "����");
		} else{
			ticketPrice = grandNightPrice;
			strcpy(ticket_age, "���");
		}	
	}
	else {
		printf("1 �� 2 �߿� �������ּ���\n");
	}
	strncpy(tickets[quantity][1], ticket_age,20); //->�迭���� 
	
	//4. ���� 
	int maxCount = 10, minCount = 1;
	int count, totalTicketPrice; 
	char countcount[10];
	printf("�� ���� �ֹ��Ͻðڽ��ϱ�?(�ִ� 10��)\n");
	scanf("%d", &count);
	
	if(count >= minCount && count <= maxCount){
		totalTicketPrice = ticketPrice * count;
	}else {
		printf("�߸��Է��ϼ̽��ϴ�\n");
		count = 0;
	}
	sprintf(countcount, "%d", count);
	strncpy(tickets[quantity][2],countcount,20);//->�迭���� 

	//5. ������ 
	int priority,totalPrice;
	char priority_str[MAX_STRING_LENGTH];
	//char prioritytrue[MAX_STRING_LENGTH][5][20];
	printf("�������� �����ϼ���\n");
	printf("1. ����(���� ���� �ڵ�ó��)\n");
	printf("2. �����\n");
	printf("3. ����������\n");
	printf("4. ���ڳ�\n");
	printf("5. �ӻ��\n");
	scanf("%d", &priority);
	
	if(priority == 1){
		strcpy(priority_str, "*������� ����");	
	} else if(priority == 2 ){
		strcpy(priority_str, "����� �������");
	}else if(priority == 3 ){
		strcpy(priority_str, "���������� �������");
	}else if(priority == 4 ){
		strcpy(priority_str, "���ڳ� �������");
	}else if(priority == 5 ){
		strcpy(priority_str, "�ӻ�� �������");
	}else {
		printf("�߸��� �Է��Դϴ�.\n");
    	continue; 
	}
	strncpy(tickets[quantity][4],priority_str,30);//->�迭���� 
	
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
			printf("�߸������ϼ̽��ϴ�\n");
			break;
	}
		
	//6. �� ���� 
	printf("������ %d�� �Դϴ�\n",totalPrice); 
	printf("�����մϴ�\n");
	char ticket_totalPrice[10];
	sprintf(ticket_totalPrice,"%d",totalPrice);
	strcpy(tickets[quantity][3],ticket_totalPrice); 
	
	//7.��� vs ���� 
	int continueOrNot; 
	printf("��� �߱��Ͻðڽ��ϱ�?\n");
	printf("1. Ƽ�� �߱�\n");
	printf("2. ����\n");
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
		printf("�����մϴ�\n");
		printf("\n");
		printf("==================== ��������===================\n");
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
//			printf("�ְ��� ");
//		}
//		else if (inputticket == 2){
//			printf("�߰��� ");
//		}
//			
//		//7-2
//		if(ticketPrice == babyPrice){
//			printf("����");
//		} else if(ticketPrice == childDayPrice){
//			printf("����");
//		} else if(ticketPrice == teenDayPrice){
//			printf("û�ҳ�");
//		} else if(ticketPrice == adultDayPrice){
//			printf("����");
//		} else{
//			printf("���");	
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
//			printf(" *������� ����\n");
//		}else if (priority == 2){
//			printf(" ����� �������\n");
//		}else if (priority == 3){
//			printf(" ���������� �������\n");
//		}else if (priority == 4){
//			printf(" ���ڳ� �������\n");
//		}else if (priority == 5){
//			printf(" �ӻ�� �������\n");
//		}
//		
//		//7-6
//		printf("����� �Ѿ��� %d�� �Դϴ�\n",totalPrice);
//		printf("================================================\n");	

