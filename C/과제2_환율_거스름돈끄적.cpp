#include <stdio.h>

//ȯ�� (�޷� ->��ȭ) 
 
int main(){
	
	int num1, num2;
	printf("ȯ���� ���ϴ� �ݾ��� �Է��ϼ���(��ȭ) : ");
	scanf("%d",&num1); 
 	printf("ȯ���� ���ϴ� ��ȭ�� �����ϼ���(1. USD, 2. JPY) : ");
 	scanf("%d",&num2); 

	const double currencydollar = 1320.00;
	const double currencyyen = 9.99;
	
	double usd = (num1 / currencydollar) * 10;
	double yen = num1 / currencyyen ;
	double changeusd = (num1 - (usd * currencydollar));
	double changeyen = (num1 - (yen * currencyyen));
	
	if(num2 == 1){
	
	printf("����ȯ�� : %.2f\n", currencydollar);
	printf("ȯ�� ���\n");
	printf("�޷� : %d�޷�\n", usd);
	
	if(changeusd = (int)changeusd){
		printf("�ܵ� : %d��\n", changeusd);
	} else{
		printf("�ܵ� : %d��\n", (int)changeusd+1);
	}
	
	
	}
	else if(num2 == 2) {
		
	printf("����ȯ�� : %.2f\n", currencyyen);
	printf("ȯ�� ���\n");
	printf("��ȭ  : %d��\n", yen);
	printf("�ܵ� : %d��\n", ((int)(num1 - (int)(yen * currencyyen))));
		
	}
	else{
		printf("error");
	}
	
	return 0;
	
	
	/* float = (int)totalfee
	 float != (int)totalfee +1
	
	
	*/
}
