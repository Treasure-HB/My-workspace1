package 교수님버전;

import java.util.Arrays;

public class _1번_자리배치 {
	
	public int[] solution(int c, int r, int k){
		
		int[] answer = new int[2]; //마지막으로 출력할 answer의 칸이 2칸이다(1,1) (6,3)
		if(k >  c * r ) return new int[] {0,0}; //사람수가 c*r(칸수 = 자리수) 보다 많으면 0,0출력
		int[][] seat = new int[c][r]; //이중배열 seat는 c와 r의 값을 받아서 크기를 정한거임( 6*5 라면 가로는 6칸이있고 세로는 5칸이있음)
		
		//방향
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int x = 0, y = 0, count= 1, d = 1; //초기화
		while(count <k) { //자리수< 전체사람수가 될때까지
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] > 0) { //다음번 x,y값이 격자 벗어났을경우 (0보다 작거나 전체칸수보다 클때
				d = (d + 1) % 4; //d에 1을더해서 방향을 바꿔라 대신, 4로 나눠서 방향4개를 벗어나지않아야함
				continue; //방향바꾸면서 계속 진행
			}
		seat[x][y] = count; //격자에 벗어나지않을경우
		count++; //갯수를 더하고
		x = nx; //다음번 계산한 x값을 그대로 x에 넣어라 근데 축적을 안하니까 저절로 마지막 값만 출력됨
		y = ny; 
		
	}
 	answer[0] = x + 1; //애초에 계산하기쉽게 (0,0)이라고 가정하고 계산했기때문에 +1을 해서 실제좌표값을 리턴해줘야함
 	answer[1] = y + 1;
 	return answer;
 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_1번_자리배치 T  = new _1번_자리배치();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
		
	}
}
