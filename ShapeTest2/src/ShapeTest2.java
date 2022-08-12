
class Shape{
	protected String name;
	protected int x, y;
	public Shape(String name, int x, int y)
	{
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public Shape()
	{
		this("����", 0, 0);
	}
	public void ShowInfo()
	{
		System.out.println("===== ������� =====================");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("��ǥ(2D) : %d, %d\n", x, y);
	}
}
class Circle extends Shape{
	protected int radius;
	public Circle(String name, int x, int y, int radius)
	{
		super(name, x, y);
		this.radius = radius;
	}
	public Circle()
	{
		super("��", 0, 0);
		this.radius = 1;
	}
	public void ShowDetailInfo2D()
	{
		ShowInfo();
		System.out.printf("������ : %d\n", radius);
	}
}
class Rectangle extends Shape{
	protected int width, height;
	public Rectangle(String name, int x, int y, int width, int height)
	{
		super(name, x, y);
		this.width = width;
		this.height = height;
	}
	public Rectangle()
	{
		super("�簢��", 0, 0);
		this.width = 1;
		this.height = 1;
	}
	public void ShowDetailInfo2D()
	{
		ShowInfo();
		System.out.printf("�ʺ�, ���� : %d, %d\n", width, height);
	}
}
class Sphere extends Circle{
	protected int z;
	public Sphere(String name, int x, int y, int z, int radius)
	{
		super(name, x, y, radius);
		this.z = z;
	}
	public Sphere()
	{
		super("��", 0, 0, 1);
		this.z = 0;
	}
	public void ShowDetailInfo3D()
	{
		ShowDetailInfo2D();
		System.out.printf("��ǥ(z��) : %d\n", z);
	}
}
class Box extends Rectangle{
	protected int depth, z;
	public Box(String name, int x, int y, int z, int width, int height, int depth)
	{
		super(name, x, y, width, height);
		this.depth = depth;
		this.z = z;
	}
	public Box()
	{
		super("����ü", 0, 0, 1, 1);
		this.depth = 1;
		this.z = 0;
	}
	public void ShowDetailInfo3D()
	{
		ShowDetailInfo2D();
		System.out.printf("��ǥ(z��) : %d\n", z);
		System.out.printf("���� : %d\n", depth);
	}
}
public class ShapeTest2 {

	public static void main(String[] args) {
		Shape sh_obj = new Shape();
		sh_obj.ShowInfo();
		Circle c_obj2 = new Circle("����", 5, 3, 4);
		c_obj2.ShowDetailInfo2D();
		Rectangle r_obj = new Rectangle("Ÿ��", 7, 5, 11, 13);
		r_obj.ShowDetailInfo2D();
		Sphere s_obj = new Sphere("��", 9, 9, 5, 8);
		s_obj.ShowDetailInfo3D();
		Box b_obj1 = new Box();
		b_obj1.ShowDetailInfo3D();
		Box b_obj2 = new Box("å", 1, 3, 7, 7, 13, 11);
		b_obj2.ShowDetailInfo3D();
	}

}
