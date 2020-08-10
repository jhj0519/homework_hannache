package count;
/*
 * 0718
 * 1) n개의 정수 중 13의 배수의 개수
 * 2) 1부터 1000까지의 정수증 13의 배수의 개수 
 */

public class CountAlgorithm {

	public static void main(String[] args) {
		// 주어진 범위에 주어진 조건에 해당하는 자료들의 개수

		int count = 0;
		int[] numbers = new int[1000];
		// 입력//초기값 0을 갖는 int형 0부터 999까지의 index를 갖는 배열을 선언

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 1 + i;
			System.out.println("배열에 " + numbers[i] + "를 추가 했습니다.");
			// }//배열 채우기
			if (numbers[i] % 13 == 0) {
				count++;
				System.out.println(numbers[i] + "는 13의 배수 입니다.");
			}
			System.out.println(numbers[i] + "는 13의 배수가 아닙니다.");
		}
		// 계산

		System.out.println("1부터 1000까지의 정수 중 13의 배수는 " + count + "개 입니다.");
		// 출력
	}

}
