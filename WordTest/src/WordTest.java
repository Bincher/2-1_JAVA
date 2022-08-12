public class WordTest {
	private static final String WHITESPACE = " ";
	
	public static String reverseWords(String str) {
		StringBuilder sb = new StringBuilder();
		String st[] = str.split(" ");
		for (String s : st)
		{
			for (int i = s.length() - 1; i >= 0; i--)
			{
				sb.append(s.charAt(i));
			}
			sb.append(WHITESPACE);
		}
		return sb.toString();
		
	}
	public static void main(String args[]) {
		String str = "Hello World";
		String res = reverseWords(str);
		System.out.println(res);
	}
}