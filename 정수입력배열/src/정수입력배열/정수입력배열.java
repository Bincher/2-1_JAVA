package 정수입력배열;
import java.util.Scanner;

public class 정수입력배열 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		int total = 0;
		double avg;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("정수 입력? ");
			arr[i] = s.nextInt();
			total += arr[i];
		}
		avg = (double)total / arr.length;
		System.out.printf("합산결과: %d\n", total);
		System.out.printf("평균: %f\n", avg);
	}

}
