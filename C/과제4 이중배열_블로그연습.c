#include <stdio.h>
#include <string.h>

int main(){

	//0. �Է¹ޱ�
	int inputA, inputB;
	printf("��ĭ¥���� ���Ͻó��� ? ex) X * Y ");
	scanf("%d %d", &inputA, &inputB); 
	
	//1. �������� 
	int i,j; 
	int count = 2; 
	int board[100][100]; //����ũ�⼳�� 
	int board_length = inputA * inputB;
	
	//2. �迭 ����� 0���� �ʱ�ȭ 
	for(i = 0; i < inputA; i++){
		for(j = 0; j < inputB; j++){
			board[i][j] = 0; 
		}
	}
	
	//3. ������ ����
	i = 0;
	j = 0;
	board[i][j] = 1;
	
	//4. 0��ƸԱ� ���� (���⺰�� ����) 
	while(count < board_length){
		while(j + 1 < inputB && board[i][j + 1] == 0){ //���ΰ� ���ι����ȿ� �ְ�, ����+1�� �� ĭ�� ���� 0�ΰ�� 
			j++; //for���� �ƴϱ� ������ ���� j++ �����ϰ� ������� 
			board[i][j] = count;
			count++;
		}
		while(i + 1 < inputA && board[i + 1][j] == 0){
			i++;
			board[i][j] = count;
			count++;
		} 
		while(j - 1 >= 0 && board[i][j - 1] == 0){
			j--;
			board[i][j] = count;
			count++;
		}
		while(i - 1 >= 0 && board[i - 1][j] == 0){
			i--;
			board[i][j] = count;
			count++;	
		}	
		
	} 
	
	//5. ����ϱ�
	for(i = 0 ; i < inputA; i++){
		for(j = 0; j < inputB; j++){
			printf("%3d",board[i][j]);
		}
		printf("\n");
	} 
	
	return 0;
}
