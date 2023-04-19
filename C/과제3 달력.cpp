#include <stdio.h>
#include <time.h>


int main(){

	int Year, Month, startDay, days_in_month, day = 1; //1로 초기화 

	//0. 입력받기 
	
		printf("년도 입력 : ");
		scanf("%d", &Year);
		printf("월 입력 : ");
		scanf("%d", &Month);
	
	//1. 입력한 날짜 고정하기 
	
		struct tm timeinfo = {0}; //구조체 크기 
		timeinfo.tm_year = Year - 1900; //연도 고정 
		timeinfo.tm_mon = Month - 1; //1월이 0이니까 -1해서 월 고정 
		timeinfo.tm_mday = 1; //임의로 날짜고정 
		mktime(&timeinfo); //구조체에 묶기 
		int startingDay = timeinfo.tm_wday;	//이렇게하면 달의 시작요일이 나옴 
	
	
	//2. 윤달 vs 아닌 달 
	
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
	
	//3. 요일출 력 
		printf(" Sun Mon Tue Wed Thu Fri Sat\n");
	
	//4. 공백출력 
		int i;
    	for (i = 0; i < startingDay; i++) {
       	 printf("    ");
   		 }
    
    //5. 시작날짜출력 
   		 for(int i = 1; i < days_in_month + 1; i++){
    		printf("%4d", i);
    			if((i + startingDay)% 7 == 0){
    			printf("\n");
				}
			}
    //6. 요일 마지막이 토요일이아니면 개행 
   		 if ((i + startingDay - 1) % 7 != 0) {
        	printf("\n");
   		 }

    return 0;
}
	

