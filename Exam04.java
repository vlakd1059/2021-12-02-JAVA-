package 배열;

public class Exam04 {

	public static void main(String[] args) {
		// 예제) 길이가 5인 배열을 만들고
		// 1,2,3,4,5 값을 각 인덱스 0번째 부터 저장한 다음
		// 배열안에 모든 값을 출력하시오.
		int[] arr = new int[10];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = j + 1;
			 System.out.print(arr[j] + " "); 
			 // 결과는 같지만 넣고 꺼내는 순서는 다름
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}
}
