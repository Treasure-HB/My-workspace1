#include <stdio.h>
#include <string.h>

int main(){

	//0. 입력받기 2차원배열
	int input;
	printf("입력 : " );
	scanf("%d", &input);
	
	
	//1. 변수설정 
	int board_length = input * input; //전체 크기설정
	int board [100][100];
	int x = 0, y = 0, d = 1, count = 0;
	int i,j;
	int k = board_length;
	int dx[] = {-1,0,1,0};
	int dy[] = {0,1,0,-1};
	
	//2. 달팽이배열 채우기 
	while(count < board_length){
		board[x][y] = count + 1; //count 가 0부터 시작하니까 
		count ++;
		int nx = x + dx[d];
		int ny = y + dy[d];
		
		//2-1. 방향을 틀때 
		if(nx < 0 || ny < 0 || nx >= input || ny >= input || board[nx][ny] != 0){ //나머진 경계밖으로 나가지말란거, 마지막조건은 이미 지나간 곳이면 넘아가라는거 
			d = (d+1) % 4;
			nx = x + dx[d];
			ny = y + dy[d];
		}
		
		//2-2. 방향을 틀 때 제외하고 넣을값 
		x = nx;
		y = ny;
	} 
	
	//3. 결과출력
	for(i = 0; i < input; i++){
		for(j = 0; j < input; j++){
			printf("%3d", board[i][j]);
		}
		printf("\n");
	}
	return 0;
}
