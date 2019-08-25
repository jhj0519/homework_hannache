package nine.process;

/**
 * 1 3 3 3 3 3 5 - 7 9 1 끊어서 한 글자씩 저장-숫자로 전환 및 -,공백 판별 '-' 뒤의 수-앞의수 =a a횟수만큼
 * 반복문이용 사이의 숫자 추가 ' ' 을 기준으로 입력 받아 Array나 list로 작성 가로 출력 세로 출력 대각선 출력
 * 
 * 입력에서 재귀함수 사용할 것
 * 
 */
public class ProcessNineArray {

	String[] imsis;

	public void processInputs() {

	}

	public String[] imsi(String a) {
		String[] imsis = a.split(" ");
		// Integer.valueOf(imsis[i]);
		return imsis;
	}

	public void gesan(String[] a) {

		char[] iCs = null;
		int[] iIs = null;

		for (int i = 0; i < imsis.length; i++) {
			// char로 변환후 입력
			iCs = imsis[i].toCharArray();
		}
//		for (int i = 0; i < iCs.length; i++) {
//			if ('0' <= iCs[i] && '9' >= iCs[i]) {
//				// 숫자면 int배열에 입력
//				iIs[i] = iCs[i];
//			} else if ('-' == iCs[i]) {
//				int su, ma1, ma2;
//				ma2 = iCs[i - 1];
//				ma1 = iCs[i + 1];
//				su = ma1 - ma2;
//				
//				for(int j= 0;j>su;j++) {
//				iCs[i] = iCs[i-1]+1; 
//				}
//			}
		}
		

	
	public void toInt(String[] a) {
		int[] iIs = null;
		for(int i=0; i<a.length;i++) {
			System.out.println( Double.parseDouble(a[i]));
					
				}
	}

//	public int add(int Iput) {
//	}

	public void printRaro() {

		System.out.println("가로로 구구단 출력 합니다.");
	}

	public void printSero() {

		System.out.println("가로로 구구단 출력 합니다.");
	}

	public void printDegacsun() {

		System.out.println("가로로 구구단 출력 합니다.");
	}

}
