package 점테스트;
class 점 {
	private int x, y;
	public 점(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	public void 정보출력()
	{
		System.out.println("(" +
		x + "," + y + ")");
	}
	public String toString()
	{
		return "(" + x +"," + y +")";
	}
	public double dist(점 pq)
	{
		return (Math.sqrt(Math.pow(x - pq.x, 2) + Math.pow(y - pq.y, 2)));
	}
}
class 색상점 extends 점 {
	private String 색상;
	public 색상점(int x, int y, String 색상) 
	{
		super(x, y);
		this.색상 = 색상;
	}
	public void 상세정보출력() 
	{
		System.out.print(색상);
		정보출력();
	}
	public String toString()
	{
		return 색상 + super.toString();
	}
}

public class 점테스트 {

	public static void main(String[] args) {
		점 p = new 점(10, 20);
		점 q = new 점(15, 31);
		색상점 cp = new 색상점(2, 9, "blue");
		System.out.printf("%s ~ %s 사이의 거리: %f \n", p, q, p.dist(q));
		System.out.printf("%s ~ %s 사이의 거리: %f \n", p, cp, p.dist(cp));
	}
}
