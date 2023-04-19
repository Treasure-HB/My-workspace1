#include <stdio.h>
#include <string.h>

int main(){

	//0. 입력받기
	int inputA, inputB;
	printf("몇칸짜리를 원하시나요 ? ex) X * Y ");
	scanf("%d %d", &inputA, &inputB); 
	
	//1. 변수설정 
	int i,j; 
	int count = 2; 
	int board[100][100]; //보드크기설정 
	int board_length = inputA * inputB;
	
	//2. 배열 만들고 0으로 초기화 
	for(i = 0; i < inputA; i++){
		for(j = 0; j < inputB; j++){
			board[i][j] = 0; 
		}
	}
	
	//3. 시작점 설정
	i = 0;
	j = 0;
	board[i][j] = 1;
	
	//4. 0잡아먹기 시작 (방향별로 설정) 
	while(count < board_length){
		while(j + 1 < inputB && board[i][j + 1] == 0){ //세로가 세로범위안에 있고, 세로+1을 한 칸의 값이 0인경우 
			j++; //for문이 아니기 때문에 따로 j++ 증가하게 해줘야함 
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
	
	//5. 출력하기
	for(i = 0 ; i < inputA; i++){
		for(j = 0; j < inputB; j++){
			printf("%3d",board[i][j]);
		}
		printf("\n");
	} 
	
	return 0;
}
