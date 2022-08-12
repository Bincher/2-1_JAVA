import java.util.*;

public class HelloJAVA {
	public static boolean is_prime_number(int x)
	{
	for (int i = 2; i <= Math.sqrt(x); i++)
	{
		if (x % i == 0)
		{
			return false;
		} 
	}
	return true;
	}
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int sum = 0;
		int min = 0;
		if (m == 1)
		{
			m++;
		}
			for (int i = m; i <= n; i++)
			{
				if(is_prime_number(i))
				{
					if (sum == 0)
						min = i;
					sum += i;
				}
			}
		if (sum == 0)
			System.out.print(-1);
		else
			System.out.printf(sum + "\n" + min);
	}
}
