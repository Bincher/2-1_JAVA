package ���;

import java.util.Scanner;
public class ��� {

	public static void main(String[] args) {
		int [] num_arr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0 ; i < num_arr.length ; i++)
		{
			System.out.print("���� �Է�? ");
			int num = s.nextInt();
			num_arr[i] = num;
		}
		double result = 0;
		for (int n : num_arr)
		{
			result += n;
		}
		System.out.printf("�ջ���: %d\n���: %.2f", (int)result, result / num_arr.length);
		s.close();
	}
}
