
public class Exam02 {

	public static void main(String[] args) {
		// ���׷��̵� �� ������ϱ�

		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "�� ��� : ");
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + ", ");
				}
			}
			System.out.println(i);
			System.out.println("");
		}

	}

}
