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
		System.out.printf("좌표:(%d, %d), 크기:(%d, %d), 면적:%d\n",x,y,width,height,width*height);
	}
	public void set(int x, int y, int width, int height) {
		if (x >= 0 && y >= 0) {
			this.x = x;
			this.y = y;
			this.height = height;
			this.width = width;
		}
		else {
			System.out.println("사각형의 크기는 음수가 될 수 없습니다.");
		}
	}
	public boolean equals(rectangle s) { //s class 받고
		if (s.x == this.x && s.y == this.y && s.width == this.width && s.height == this.height)
			return true; //s class의 좌표 및 길이와 this(r)의 좌표 및 길이 비교
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
			System.out.println("두 사각형은 같습니다.");
		else
			System.out.println("두 사각형은 다릅니다.");
	}
}
