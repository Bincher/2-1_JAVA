package checkEven;
import java.util.Scanner;

public class checkEven {
	public static boolean checkEven(int a)
	{
		return (a % 2 == 0);
	}
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.printf("1���� ���� �Է�? ");
		a = s.nextInt();
		
		//CheckEven obj = new CheckEven();
		if(checkEven(a))
			System.out.printf("%d: ¦��",a);
		else
			System.out.printf("%d: Ȧ��", a);
		s.close();
	}

}
