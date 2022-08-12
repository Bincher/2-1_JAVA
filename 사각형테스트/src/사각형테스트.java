class 사각형{
	int width, height;
	public 사각형() {
		this(0,0);
	}
	public 사각형(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int 면적계산() {
		return width * height;
	}
}
public class 사각형테스트 {
	public static void main(String[] args) {
		사각형 s = new 사각형(2, 5);
		int r = s.면적계산();
		System.out.printf("사각형 면적: %d", r);
	}

}
