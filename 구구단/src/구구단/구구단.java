package 구구단;

public class 구구단 {
	int 출력단;
	public void 출력(){
		for (int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d\n", 출력단, i, i*출력단);
		}
	}
	public static void main(String[] args) {
		구구단 구구단객체;
		구구단객체 = new 구구단();
		구구단객체.출력단 = 3;
		구구단객체.출력();
	}
}
