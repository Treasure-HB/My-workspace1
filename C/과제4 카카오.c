#include <stdio.h>
#include <string.h>

int main(){

	//0. ��������
	int i,j;
	int n = 6;
	int board_length = n * n;
	int arr1 [] = {46,33,33,22,31,50};
	int arr2 []  = {27,56,19,14,14,10};

	
	//1. 10���� 2������ �ٲٱ�
	for(i = 0; i < n ; i++){
		int index1 = 0, index2 = 0;;
		int temp1 = arr1[i];
		int temp2 = arr2[i];
		
		int digit1[32] = {0};
		int digit2[32] = {0}; //2���� ������ �迭 
		
		int finalMap[10] = {0}; //�������� 
		
		//1-1. ù��°���ڸ� 2������ ��ȯ
		
		while(temp1 > 0){
			digit1[index1++] = temp1 % 2;
			temp1 /= 2;
		} 
		while(temp2 > 0){
			digit2[index2++] = temp2 % 2;
			temp2 /= 2;
		} 
		
		
	//2. 
 	
	
	// 2���� ���
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
    

	
	
	
	
	
	
	
	
	


	 	
	 
	 













