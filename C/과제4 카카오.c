#include <stdio.h>
#include <string.h>

int main(){

	//0. 변수설정
	int i,j;
	int n = 6;
	int board_length = n * n;
	int arr1 [] = {46,33,33,22,31,50};
	int arr2 []  = {27,56,19,14,14,10};

	
	//1. 10진수 2진수로 바꾸기
	for(i = 0; i < n ; i++){
		int index1 = 0, index2 = 0;;
		int temp1 = arr1[i];
		int temp2 = arr2[i];
		
		int digit1[32] = {0};
		int digit2[32] = {0}; //2진수 보관할 배열 
		
		int finalMap[10] = {0}; //최종지도 
		
		//1-1. 첫번째숫자를 2진수로 변환
		
		while(temp1 > 0){
			digit1[index1++] = temp1 % 2;
			temp1 /= 2;
		} 
		while(temp2 > 0){
			digit2[index2++] = temp2 % 2;
			temp2 /= 2;
		} 
		
		
	//2. 
 	
	
	// 2진수 출력
        printf("arr1[%d]: ", i);
        for (j = index1 - 1; j >= 0; j--) {
            printf("%d", digit1[j]);
        }
        printf("\n");

        printf("arr2[%d]: ", i);
        for (j = index2 - 1; j >= 0; j--) {
            printf("%d", digit2[j]);
        }
        printf("\n");
    }
    
    
    

    return 0;
}
    

	
	
	
	
	
	
	
	
	


	 	
	 
	 













