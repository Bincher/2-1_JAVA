package �ǿ����ںи�;

import java.util.Scanner;
public class �ǿ����ںи� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num;
		double result = 0;
		System.out.print("����>> ");
		String str = s.nextLine();
		String[] op = str.split("[+*/-]");
		System.out.println("�ǿ����� ���� �и� ���:");
		for(String a : op)
		{
			num = Double.parseDouble(a);
			System.out.printf("%.1f\n", num);
			result += num;
		}
		System.out.printf("\n(�����: %.1f)", result);
		s.close();
	}

}
