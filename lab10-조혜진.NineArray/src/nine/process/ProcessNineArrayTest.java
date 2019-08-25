package nine.process;

import java.util.Scanner;

/**
 * 입력 : 1 3 3 3 3 3 5 - 7 9 1. 1.입력 '-'의 앞뒤에 숫사 사이값을 전부 입력 받음 중복값은 입력 받지 않음
 * 
 * 2.출력 구구단 출력 - 가로, 세로, 대각선
 */
public class ProcessNineArrayTest {

	public static void main(String[] args) {

		ProcessNineArray nineArray = new ProcessNineArray();
		Scanner scan = new Scanner(System.in);

		String sample = "1 3 3 3 3 3 5 - 7 9";
		String[] imsi = nineArray.imsi(sample);

		nineArray.toInt(imsi);
//		for(String su:imsi) {
//		System.out.println(su);
//		}
//		
		//String[] samples = { sample };

		//String[] numbers = nineArray.imsi(sample);

//		System.out.println("출력형태를 입력하시오:");
//		String printType ;
//		printType = scan.nextLine();

	}

}
