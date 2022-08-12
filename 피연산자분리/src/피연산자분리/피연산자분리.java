package 피연산자분리;

import java.util.Scanner;
public class 피연산자분리 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num;
		double result = 0;
		System.out.print("계산식>> ");
		String str = s.nextLine();
		String[] op = str.split("[+*/-]");
		System.out.println("피연산자 숫자 분리 결과:");
		for(String a : op)
		{
			num = Double.parseDouble(a);
			System.out.printf("%.1f\n", num);
			result += num;
		}
		System.out.printf("\n(계산결과: %.1f)", result);
		s.close();
	}

}
