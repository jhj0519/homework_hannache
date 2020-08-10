package sum;

import java.util.Scanner;

/* 
 * 1
 * n명의 국어 점수 중에서 80점 이상인 점수의 합계
 * 합계 알고리즘(Sum Algorithm) : 주어진 범위에 주어진 조건에 해당하는 자료들의 합계
 * list값 : 100, 75, 50, 37, 90, 95
 * 
 * 2
 * 5개의 정수를 입력 받는다.
 * 입력받은 정수 어떤 수를 기준으로 큰 수만 보여줄지 입력받는다.
 * 두번째를 입력 받은 수보다 큰 수들과 합을 출력한다.
 */
public class SumAlgorithm {
	public static void main(String[] args) {
		//<타입>list 이름 = new list<타입>();
		//이름.add(입력값);
		int sum = 0;
		//int[] sumL  = {100, 75, 50, 37, 90, 95};
		//배열
		int[] sumList = null ;
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			sumList[i]= scan.nextInt();
		}
		int su = scan.nextInt();
		
		for(int i=0;i<6;i++) {
			if(sumList[i]>=su) {
				sum += sumList[i];
				System.out.println("+"+sumList[i]);
			}
		}
		
		
		System.out.println("= "+sum);
	}
	

}
