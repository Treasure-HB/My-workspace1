#include <stdio.h>
#include <time.h>


int main(){

	int Year, Month, startDay, days_in_month, day = 1; //1�� �ʱ�ȭ 

	//0. �Է¹ޱ� 
	
		printf("�⵵ �Է� : ");
		scanf("%d", &Year);
		printf("�� �Է� : ");
		scanf("%d", &Month);
	
	//1. �Է��� ��¥ �����ϱ� 
	
		struct tm timeinfo = {0}; //����ü ũ�� 
		timeinfo.tm_year = Year - 1900; //���� ���� 
		timeinfo.tm_mon = Month - 1; //1���� 0�̴ϱ� -1�ؼ� �� ���� 
		timeinfo.tm_mday = 1; //���Ƿ� ��¥���� 
		mktime(&timeinfo); //����ü�� ���� 
		int startingDay = timeinfo.tm_wday;	//�̷����ϸ� ���� ���ۿ����� ���� 
	
	
	//2. ���� vs �ƴ� �� 
	
		if(Month == 2){ 
			if(Year % 4 == 0 && Year % 100 != 0){ 
				days_in_month = 29;	
			}
			else if (Year % 400 == 0){
				days_in_month = 29;
			}
			else{
				days_in_month = 28;
			}
		}
	
		else if (Month == 1 || Month == 3 || Month == 5 || Month == 7 ||Month == 8 ||Month == 10 ||Month == 12 ){
			days_in_month = 31;
		}
		else  {
			days_in_month = 30;
		}
	
	//3. ������ �� 
		printf(" Sun Mon Tue Wed Thu Fri Sat\n");
	
	//4. ������� 
		int i;
    	for (i = 0; i < startingDay; i++) {
       	 printf("    ");
   		 }
    
    //5. ���۳�¥��� 
   		 for(int i = 1; i < days_in_month + 1; i++){
    		printf("%4d", i);
    			if((i + startingDay)% 7 == 0){
    			printf("\n");
				}
			}
    //6. ���� �������� ������̾ƴϸ� ���� 
   		 if ((i + startingDay - 1) % 7 != 0) {
        	printf("\n");
   		 }

    return 0;
}
	

