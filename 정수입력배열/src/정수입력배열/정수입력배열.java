package �����Է¹迭;
import java.util.Scanner;

public class �����Է¹迭 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		int total = 0;
		double avg;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("���� �Է�? ");
			arr[i] = s.nextInt();
			total += arr[i];
		}
		avg = (double)total / arr.length;
		System.out.printf("�ջ���: %d\n", total);
		System.out.printf("���: %f\n", avg);
	}

}
