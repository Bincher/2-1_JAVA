package ���׽�Ʈ;
class �� {
	private int x, y;
	public ��(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	public void �������()
	{
		System.out.println("(" +
		x + "," + y + ")");
	}
	public String toString()
	{
		return "(" + x +"," + y +")";
	}
	public double dist(�� pq)
	{
		return (Math.sqrt(Math.pow(x - pq.x, 2) + Math.pow(y - pq.y, 2)));
	}
}
class ������ extends �� {
	private String ����;
	public ������(int x, int y, String ����) 
	{
		super(x, y);
		this.���� = ����;
	}
	public void ���������() 
	{
		System.out.print(����);
		�������();
	}
	public String toString()
	{
		return ���� + super.toString();
	}
}

public class ���׽�Ʈ {

	public static void main(String[] args) {
		�� p = new ��(10, 20);
		�� q = new ��(15, 31);
		������ cp = new ������(2, 9, "blue");
		System.out.printf("%s ~ %s ������ �Ÿ�: %f \n", p, q, p.dist(q));
		System.out.printf("%s ~ %s ������ �Ÿ�: %f \n", p, cp, p.dist(cp));
	}
}
