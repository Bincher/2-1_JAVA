package Æò±Õ;

import java.util.Scanner;
public class Æò±Õ {

	public static void main(String[] args) {
		int [] num_arr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0 ; i < num_arr.length ; i++)
		{
			System.out.print("Á¤¼ö ÀÔ·Â? ");
			int num = s.nextInt();
			num_arr[i] = num;
		}
		double result = 0;
		for (int n : num_arr)
		{
			result += n;
		}
		System.out.printf("ÇÕ»ê°á°ú: %d\nÆò±Õ: %.2f", (int)result, result / num_arr.length);
		s.close();
	}
}
