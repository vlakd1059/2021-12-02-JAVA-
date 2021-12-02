
public class Exam03 {

	public static void main(String[] args) {
		
		// 1~1000 완전수
		// 완전수: 약수중 자기 자신 수랑 똑같은값
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (i == sum)
				System.out.println(sum);
		}
	}
}
