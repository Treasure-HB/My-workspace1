#include <stdio.h>
#include <string.h>
#include <time.h>

int main(){

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
	
	//2.�ֹι�ȣ 
	char inputBirth[10], inputYear[10];
	int nowYear, age;; 
	printf("��������� �Է��ϼ��� Ex) 1900-01-01.\n");
	scanf("%s", &inputBirth);
	
		//2-1 ���̰��
		struct tm * time_info;
		time_t now = time(NULL);
    	time_info = localtime(&now);
		nowYear = time_info->tm_year + 1900; //->���� 
		strncpy(inputYear,inputBirth,4); //->������Ͽ��� ���� ���� 
		age = nowYear- atoi(inputYear);	 
	
	//3. ���̿� ���� �������� ��� 
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
		printf("1 �� 2 �߿� �������ּ���\n");
	}
	
	//4. ���� 
	int maxCount = 10, minCount = 1;
	int count, totalTicketPrice; 
	printf("�� ���� �ֹ��Ͻðڽ��ϱ�?(�ִ� 10��)\n");
	scanf("%d", &count);
	
	if(count >= minCount && count <= maxCount){
		totalTicketPrice = ticketPrice * count;
	}else {
		printf("�߸��Է��ϼ̽��ϴ�\n");
		count = 0;
	}

	//5. ������ 
	int priority,totalPrice;
	printf("�������� �����ϼ���.\n");
	printf("1. ����(���� ���� �ڵ�ó��)\n");
	printf("2. �����\n");
	printf("3. ����������\n");
	printf("4. ���ڳ�\n");
	printf("5. �ӻ��\n");
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
			printf("�߸������ϼ̽��ϴ�\n");
			break;
	}
		
	//6. �� ���� 
	printf("������ %d�� �Դϴ�\n",totalPrice); 
	printf("�����մϴ�\n"); 
	
	//7.��� vs ���� 
	int continueOrNot; 
	printf("��� �߱��Ͻðڽ��ϱ�?\n");
	printf("1. Ƽ�� �߱�\n");
	printf("2. ����\n");
	scanf("%d", &continueOrNot);
	
	if(continueOrNot == 1){
		continue; 
	} else if(continueOrNot == 2){
		
		printf("Ƽ�� �߱��� �����մϴ�. �����մϴ�\n");
		printf("\n");
		printf("==================== ��������===================\n");
		printf("\n"); 
		
		//7-1
		if(inputticket == 1){
			printf("�ְ��� ");
		}
		else if (inputticket == 2){
			printf("�߰��� ");
		}
			
		//7-2
		if(ticketPrice == babyPrice){
			printf("����");
		} else if(ticketPrice == childDayPrice){
			printf("����");
		} else if(ticketPrice == teenDayPrice){
			printf("û�ҳ�");
		} else if(ticketPrice == adultDayPrice){
			printf("����");
		} else{
			printf("���");	
		} 
		
		//7-3
		printf(" X %d ",count);
		
		//7-4
		printf("%3d",totalPrice);
		
		//7-5
		if(priority == 1){
			printf(" *������� ����\n");
		}else if (priority == 2){
			printf(" ����� �������\n");
		}else if (priority == 3){
			printf(" ���������� �������\n");
		}else if (priority == 4){
			printf(" ���ڳ� �������\n");
		}else if (priority == 5){
			printf(" �ӻ�� �������\n");
		}
		
		//7-6
		printf("����� �Ѿ��� %d�� �Դϴ�\n",totalPrice);
		printf("================================================\n");	
	}
	}	 	 
	return 0;
	}
