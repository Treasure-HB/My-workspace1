#include <stdio.h>
#include <string.h>

int main(){
	
	//1. num 입력받기 
	int num; 
	printf("숫자 몇까지 할까요? ");
	scanf("%d", &num);
	
	//2. 변수설정 
	int i, j, k;
	int found; //-> 짝 출력여부 저장 
	char target[4] = {'3', '6', '9', '\0'}; //-> 찾을 배열
	int targetlen = strlen(target); //-> target 전체 반복하려고 길이잼 

	//3. 반복문으로 배열에 숫자 할당하기
	char numStr[10]; 
	for(i = 1; i < num + 1; i++){
		sprintf(numStr,"%d",i); //i일때마다 문자열로 변환하여 배열에 저장
		int numlen = strlen(numStr); 
		found = 0; //found초기화 
		
		//4. 할당받은 배열을 for문으로 반복하여 3,6,9 확인
		for(j = 0; j < numlen; j++){
			for(k = 0; k < targetlen; k++){
				if(numStr[j] == target[k]){
					found++; 
				}
			}
		}
		
		//5. found갯수만큼 짝 출력 
		if(found > 0){
			for(j = 0; j < found; j++){
				printf("짝");
			}
		} 
		
		//6. found 없으면 i 숫자 출력 
		else{
			printf("%d", i);
		} 
		printf("\n");
	}
		 
	return 0;	
}
