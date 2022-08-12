package 로또생성;
import java.util.Scanner;

public class 로또생성 {
	public static void main(String[] args)
	{
		int temp;
		String a;
		boolean b = true;
		int [] lotto = new int[7];
		Scanner s = new Scanner(System.in);
		while(b)
		{
			for (int i = 0; i < 7; i++)
			{
				lotto[i] = (int)(Math.random()*45) + 1;
				for (int j = 0; j < i; j++)
				{
					if (lotto[i] == lotto[j])
					{
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < 7; i++)
			{
				for (int j = i + 1; j < 7; j++)
				{
					if (lotto[i] > lotto[j])
					{
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			System.out.print("로또 번호:");
			for (int n : lotto)
			{
				System.out.print(n + " ");
			}
			System.out.print("\n계속하시겠습니끼(yes/no)? ");
			b = (s.next()).equals("yes");
		}
		System.out.println("종료합니다.");
		s.close();
	}
}