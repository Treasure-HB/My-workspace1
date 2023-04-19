package �����Թ���;

import java.util.ArrayList;

import ����._2��;

public class _2��������� {
	
	public int solution(int[] nums){
		int answer = 0;
		int n = nums.length; //�迭�� ����
		ArrayList<Integer> peaks = new ArrayList<>(); //�迭����
		for(int i = 1; i < n-1; i++) { //�迭������ �ݺ�������(������ �糡���� peak���� �ɼ������ϱ� 0�� n-1�� ��)
			if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) { //���� i�� �翷������ ũ�ٸ�
				peaks.add(i);
			}
		}
		for(int x : peaks) {
			int left = x; //peak������ �Ȱ��� ���� ������ ������ ����
			int right = x;
			int cnt = 1; //
			while(left-1 >= 0 && nums[left-1] < nums[left]) { //���ʰ��� �迭[0]�� ��, �迭�� ������ʰ� && �׻� �迭 ���ʺ��� ������
				left--; //��ĭ�� �̵��ϸ鼭
				cnt++; //������ �÷���
			}
			while(right+1 < n && nums[right] > nums[right+1]) { //�����ʰ��� �迭�������� �۰� && �׻� �迭 �����ʺ��� ũ�ٸ�
				right++; //��ĭ���̵�
				cnt++; //���� �÷���
			}
			answer = Math.max(answer, cnt); //answer �ʱⰪ�� 0������ �������̶� ���ؼ� �ִ밪���� ��ü�Ǳ⶧���� �ᱹ ���� �ִ밪�� ���Ե�
		}
		return answer;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_2�� T = new _2��();
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
		
	}

}
