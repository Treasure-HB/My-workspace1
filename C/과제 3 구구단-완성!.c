#include <stdio.h>
#include <string.h>

int main(){
	
	//1. num �Է¹ޱ� 
	int num; 
	printf("���� ����� �ұ��? ");
	scanf("%d", &num);
	
	//2. �������� 
	int i, j, k;
	int found; //-> ¦ ��¿��� ���� 
	char target[4] = {'3', '6', '9', '\0'}; //-> ã�� �迭
	int targetlen = strlen(target); //-> target ��ü �ݺ��Ϸ��� ������ 

	//3. �ݺ������� �迭�� ���� �Ҵ��ϱ�
	char numStr[10]; 
	for(i = 1; i < num + 1; i++){
		sprintf(numStr,"%d",i); //i�϶����� ���ڿ��� ��ȯ�Ͽ� �迭�� ����
		int numlen = strlen(numStr); 
		found = 0; //found�ʱ�ȭ 
		
		//4. �Ҵ���� �迭�� for������ �ݺ��Ͽ� 3,6,9 Ȯ��
		for(j = 0; j < numlen; j++){
			for(k = 0; k < targetlen; k++){
				if(numStr[j] == target[k]){
					found++; 
				}
			}
		}
		
		//5. found������ŭ ¦ ��� 
		if(found > 0){
			for(j = 0; j < found; j++){
				printf("¦");
			}
		} 
		
		//6. found ������ i ���� ��� 
		else{
			printf("%d", i);
		} 
		printf("\n");
	}
		 
	return 0;	
}
