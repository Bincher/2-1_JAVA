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
		System.out.printf("1°³ÀÇ Á¤¼ö ÀÔ·Â? ");
		a = s.nextInt();
		
		//CheckEven obj = new CheckEven();
		if(checkEven(a))
			System.out.printf("%d: Â¦¼ö",a);
		else
			System.out.printf("%d: È¦¼ö", a);
		s.close();
	}

}
