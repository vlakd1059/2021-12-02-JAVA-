import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		System.out.print(num + "�� ��� : ");
		// for (int i = 1; i <= num / 2; i++)
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println(num);
	}
}