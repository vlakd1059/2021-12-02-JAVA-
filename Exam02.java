package 배열;

public class Exam02 {

	public static void main(String[] args) {
		int[] array; // 이같은 배열선언을 더 선호
		array = new int[6];

		int array2[] = new int[6];

		// 배열 선언시 레퍼런스 변수에는 길이를 지정할 수 없다.
		// ex) int[3] array3 = new int[]; XXX

		// 길이가 2인 정수형 배열에 값 넣기
		int[] array4 = new int[2];
		array4[0] = 10;
		array4[1] = 20;
		// ==
		int[] array5 = { 10, 20 };

		// 배열의 길이를 알 수 있는 방법
		System.out.println(array5.length);

		// 마지막으로 배열정리
		// 1. 배열은 동일한 데이터 타입으로 만들어야한다.
		// 2. 배열의 길이는 항상 고정적이며 변경할 수 있다.

		// ex) int[] array6 = new int[7]; --> 삭제
		// array6= new int[3];
		
		// 3. 배열은 length라는 곳에 길이가 저장된다.
		// 4. 배열의 번호를 인덱스라 부르며 인덱스는 0부터 시작한다.
		// 5. 배열의 길이를 정할때 레퍼런스 변수 부분에 작성할 수 없다.
		// 6. 배열은 레퍼런스 변수이며 주소를 가지고 있다.
		
		

	}

}
