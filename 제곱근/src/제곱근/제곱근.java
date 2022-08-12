package 제곱근;
import java.util.Random;
import java.util.StringTokenizer;

public class 제곱근 {

	public static void main(String[] args) {
	
		int [] num = new int[5];
		int a, b, c;
		StringBuffer num_str = new StringBuffer();
		StringBuffer num_result = new StringBuffer();
		for(int i = 0; i < 5; i++)
		{
			num[i] = (int)(Math.random() * 1000 + 1);
			num_str.append(num[i] + "+");
		}
		System.out.print("생성 결과:\n" + num_str);
		System.out.print("\n처리 결과:\n");
		String[] change = (num_str.toString()).split("[+]");
		for(String s : change)
		{
			a = (int)(Math.random() * s.length());
			b = (int)(Math.random() * 10);
			num_result.append(s);
			num_result.replace(a, a + 1, String.valueOf(b));
			c = Integer.parseInt(num_result.toString());
			System.out.printf("%d: %f\n", c, (float)Math.sqrt(c));
			num_result.delete(0, num_result.length());
		}
		/*
		Random r = new Random();
		StringBuffer sb = new StringBuffer();

		for(int n = 0; n < 5; n++)
		{
			int k = r.nextInt(1000);
			sb.append(k);
			sb.append("+");
			
		}
		System.out.println("생성 결과:");
		String str = sb.toString();
		System.out.println(str);

		StringTokenizer st = new StringTokenizer(str,"+");
		System.out.println("처리 결과:");
		while(st.hasMoreTokens())
		{
			StringBuffer tok = new StringBuffer(st.nextToken());
			int loc = r.nextInt(tok.length());
			int k = r.nextInt(10);
			char c = (char)('0' + k);
			tok.replace(loc, loc+1, Character.toString(c));
			
			int num = Integer.parseInt(tok.toString());
			double srt = Math.sqrt(num);
			System.out.println(num + ": " + srt)
			
		}
		*/
		
	}

}

