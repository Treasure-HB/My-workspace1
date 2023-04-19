package �����Թ���;

import java.util.Arrays;

public class _1��_�ڸ���ġ {
	
	public int[] solution(int c, int r, int k){
		
		int[] answer = new int[2]; //���������� ����� answer�� ĭ�� 2ĭ�̴�(1,1) (6,3)
		if(k >  c * r ) return new int[] {0,0}; //������� c*r(ĭ�� = �ڸ���) ���� ������ 0,0���
		int[][] seat = new int[c][r]; //���߹迭 seat�� c�� r�� ���� �޾Ƽ� ũ�⸦ ���Ѱ���( 6*5 ��� ���δ� 6ĭ���ְ� ���δ� 5ĭ������)
		
		//����
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int x = 0, y = 0, count= 1, d = 1; //�ʱ�ȭ
		while(count <k) { //�ڸ���< ��ü������� �ɶ�����
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] > 0) { //������ x,y���� ���� �������� (0���� �۰ų� ��üĭ������ Ŭ��
				d = (d + 1) % 4; //d�� 1�����ؼ� ������ �ٲ�� ���, 4�� ������ ����4���� ������ʾƾ���
				continue; //����ٲٸ鼭 ��� ����
			}
		seat[x][y] = count; //���ڿ� ������������
		count++; //������ ���ϰ�
		x = nx; //������ ����� x���� �״�� x�� �־�� �ٵ� ������ ���ϴϱ� ������ ������ ���� ��µ�
		y = ny; 
		
	}
 	answer[0] = x + 1; //���ʿ� ����ϱ⽱�� (0,0)�̶�� �����ϰ� ����߱⶧���� +1�� �ؼ� ������ǥ���� �����������
 	answer[1] = y + 1;
 	return answer;
 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_1��_�ڸ���ġ T  = new _1��_�ڸ���ġ();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
		
	}
}
