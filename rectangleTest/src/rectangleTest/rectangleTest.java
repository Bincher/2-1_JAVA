package rectangleTest;

class rectangle{
	private int x,y,width,height;
	
	public rectangle() {
		this(0,0,1,1);
	}
	public rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int area() {
		return width * height;
	}
	public void printInfo() {
		System.out.printf("��ǥ:(%d, %d), ũ��:(%d, %d), ����:%d\n",x,y,width,height,width*height);
	}
	public void set(int x, int y, int width, int height) {
		if (x >= 0 && y >= 0) {
			this.x = x;
			this.y = y;
			this.height = height;
			this.width = width;
		}
		else {
			System.out.println("�簢���� ũ��� ������ �� �� �����ϴ�.");
		}
	}
	public boolean equals(rectangle s) { //s class �ް�
		if (s.x == this.x && s.y == this.y && s.width == this.width && s.height == this.height)
			return true; //s class�� ��ǥ �� ���̿� this(r)�� ��ǥ �� ���� ��
		else
			return false;
	}
}
public class rectangleTest {
	public static void main(String[] args) {
		rectangle r = new rectangle();
		rectangle s = new rectangle(1,2,10,15);
		
		r.printInfo();
		s.printInfo();
		
		System.out.println(s.area());
		
		r.set(-3,2,-1,4);
		r.printInfo();
		
		if (r.equals(s))
			System.out.println("�� �簢���� �����ϴ�.");
		else
			System.out.println("�� �簢���� �ٸ��ϴ�.");
	}
}
