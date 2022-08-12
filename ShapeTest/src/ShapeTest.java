
class Shape{
	protected int x, y;
	protected String name;
	public Shape(String name, int x, int y)
	{
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public void ShowInfo()
	{
		System.out.println("===== ������� ======================");
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("��ǥ : %d, %d\n", x, y);
	}
}
class Rectangle extends Shape{
	protected int width, height;
	public Rectangle(String name, int x, int y, int width, int height)
	{
		super(name, x ,y);
		this.width = width;
		this.height = height;
	}
	public void ShowDetailInfo()
	{
		ShowInfo();
		System.out.printf("�ʺ�, ����: %d, %d\n", width, height);
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Shape s_obj = new Shape("����", 9, 3);
		s_obj.ShowInfo();
		Rectangle r_obj = new Rectangle("�簢��", 7, 5, 11, 13);
		r_obj.ShowInfo();
		r_obj.ShowDetailInfo();
	}

}
