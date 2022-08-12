
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
		this("도형", 0, 0);
	}
	public void ShowInfo()
	{
		System.out.println("===== 정보출력 =====================");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("좌표(2D) : %d, %d\n", x, y);
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
		super("원", 0, 0);
		this.radius = 1;
	}
	public void ShowDetailInfo2D()
	{
		ShowInfo();
		System.out.printf("반지름 : %d\n", radius);
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
		super("사각형", 0, 0);
		this.width = 1;
		this.height = 1;
	}
	public void ShowDetailInfo2D()
	{
		ShowInfo();
		System.out.printf("너비, 높이 : %d, %d\n", width, height);
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
		super("구", 0, 0, 1);
		this.z = 0;
	}
	public void ShowDetailInfo3D()
	{
		ShowDetailInfo2D();
		System.out.printf("좌표(z축) : %d\n", z);
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
		super("육면체", 0, 0, 1, 1);
		this.depth = 1;
		this.z = 0;
	}
	public void ShowDetailInfo3D()
	{
		ShowDetailInfo2D();
		System.out.printf("좌표(z축) : %d\n", z);
		System.out.printf("깊이 : %d\n", depth);
	}
}
public class ShapeTest2 {

	public static void main(String[] args) {
		Shape sh_obj = new Shape();
		sh_obj.ShowInfo();
		Circle c_obj2 = new Circle("동전", 5, 3, 4);
		c_obj2.ShowDetailInfo2D();
		Rectangle r_obj = new Rectangle("타일", 7, 5, 11, 13);
		r_obj.ShowDetailInfo2D();
		Sphere s_obj = new Sphere("공", 9, 9, 5, 8);
		s_obj.ShowDetailInfo3D();
		Box b_obj1 = new Box();
		b_obj1.ShowDetailInfo3D();
		Box b_obj2 = new Box("책", 1, 3, 7, 7, 13, 11);
		b_obj2.ShowDetailInfo3D();
	}

}
