package 교수님버전;

import java.util.ArrayList;

import 수업._2번;

public class _2번바이토닉 {
	
	public int solution(int[] nums){
		int answer = 0;
		int n = nums.length; //배열의 길이
		ArrayList<Integer> peaks = new ArrayList<>(); //배열선언
		for(int i = 1; i < n-1; i++) { //배열끝까지 반복문돌림(어차피 양끝값은 peak값이 될수없으니까 0과 n-1로 둠)
			if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) { //만약 i가 양옆값보다 크다면
				peaks.add(i);
			}
		}
		for(int x : peaks) {
			int left = x; //peak값으로 똑같이 왼쪽 오른쪽 변수를 만듦
			int right = x;
			int cnt = 1; //
			while(left-1 >= 0 && nums[left-1] < nums[left]) { //왼쪽값이 배열[0]값 즉, 배열을 벗어나지않고 && 항상 배열 왼쪽보다 작으면
				left--; //한칸씩 이동하면서
				cnt++; //갯수를 늘려라
			}
			while(right+1 < n && nums[right] > nums[right+1]) { //오른쪽값이 배열끝값보다 작고 && 항상 배열 오른쪽보다 크다면
				right++; //한칸씩이동
				cnt++; //갯수 늘려라
			}
			answer = Math.max(answer, cnt); //answer 초기값은 0이지만 갯수값이랑 비교해서 최대값으로 대체되기때문에 결국 가장 최대값이 남게됨
		}
		return answer;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_2번 T = new _2번();
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
		
	}

}
