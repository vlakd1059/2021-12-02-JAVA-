package �迭;

public class Exam03 {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 };
//		System.out.println("�ּ� 1�� �� >> "+array1[1]);
//		System.out.println("���� >> "+array1.length);
		int[] array2 = array1;
		array1[3]=999;
		System.out.println(array2[3]);

	}
}
