
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
		System.out.println("===== 정보출력 ======================");
		System.out.printf("이름: %s\n", name);
		System.out.printf("좌표 : %d, %d\n", x, y);
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
		System.out.printf("너비, 높이: %d, %d\n", width, height);
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Shape s_obj = new Shape("도형", 9, 3);
		s_obj.ShowInfo();
		Rectangle r_obj = new Rectangle("사각형", 7, 5, 11, 13);
		r_obj.ShowInfo();
		r_obj.ShowDetailInfo();
	}

}
