#include <stdio.h>

//환전 (달러 ->원화) 
 
int main(){
	
	int num1, num2;
	printf("환전을 원하는 금액을 입력하세요(원화) : ");
	scanf("%d",&num1); 
 	printf("환전을 원하는 외화를 선택하세요(1. USD, 2. JPY) : ");
 	scanf("%d",&num2); 

	const double currencydollar = 1320.00;
	const double currencyyen = 9.99;
	
	double usd = (num1 / currencydollar) * 10;
	double yen = num1 / currencyyen ;
	double changeusd = (num1 - (usd * currencydollar));
	double changeyen = (num1 - (yen * currencyyen));
	
	if(num2 == 1){
	
	printf("기준환율 : %.2f\n", currencydollar);
	printf("환전 결과\n");
	printf("달러 : %d달러\n", usd);
	
	if(changeusd = (int)changeusd){
		printf("잔돈 : %d원\n", changeusd);
	} else{
		printf("잔돈 : %d원\n", (int)changeusd+1);
	}
	
	
	}
	else if(num2 == 2) {
		
	printf("기준환율 : %.2f\n", currencyyen);
	printf("환전 결과\n");
	printf("엔화  : %d엔\n", yen);
	printf("잔돈 : %d원\n", ((int)(num1 - (int)(yen * currencyyen))));
		
	}
	else{
		printf("error");
	}
	
	return 0;
	
	
	/* float = (int)totalfee
	 float != (int)totalfee +1
	
	
	*/
}
