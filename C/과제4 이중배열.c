#include <stdio.h>
#include <string.h>

int main(){

	//0. �Է¹ޱ� 2�����迭
	int input;
	printf("�Է� : " );
	scanf("%d", &input);
	
	
	//1. �������� 
	int board_length = input * input; //��ü ũ�⼳��
	int board [100][100];
	int x = 0, y = 0, d = 1, count = 0;
	int i,j;
	int k = board_length;
	int dx[] = {-1,0,1,0};
	int dy[] = {0,1,0,-1};
	
	//2. �����̹迭 ä��� 
	while(count < board_length){
		board[x][y] = count + 1; //count �� 0���� �����ϴϱ� 
		count ++;
		int nx = x + dx[d];
		int ny = y + dy[d];
		
		//2-1. ������ Ʋ�� 
		if(nx < 0 || ny < 0 || nx >= input || ny >= input || board[nx][ny] != 0){ //������ �������� ������������, ������������ �̹� ������ ���̸� �Ѿư���°� 
			d = (d+1) % 4;
			nx = x + dx[d];
			ny = y + dy[d];
		}
		
		//2-2. ������ Ʋ �� �����ϰ� ������ 
		x = nx;
		y = ny;
	} 
	
	//3. ������
	for(i = 0; i < input; i++){
		for(j = 0; j < input; j++){
			printf("%3d", board[i][j]);
		}
		printf("\n");
	}
	return 0;
}
