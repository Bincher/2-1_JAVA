class 사각형{
	private int width;
	private int height;
	public 사각형(){
		this(1, 1);
	}
	public 사각형(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int 면적() {
		return width * height;
	}
}
public class square {
	public static void main(String[] args) {
		사각형 r = new 사각형();
		사각형 s = new 사각형(7, 9);
		
		System.out.println("면적: " + r.면적());
		System.out.println("면적: " + s.면적());
		
		r.setWidth(5);
		r.setHeight(3);
		System.out.println("가로: " + r.getWidth() +", 세로: " + r.getHeight());
		System.out.println("면적: " + r.면적());
	}
}
