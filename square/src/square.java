class �簢��{
	private int width;
	private int height;
	public �簢��(){
		this(1, 1);
	}
	public �簢��(int width, int height) {
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
	public int ����() {
		return width * height;
	}
}
public class square {
	public static void main(String[] args) {
		�簢�� r = new �簢��();
		�簢�� s = new �簢��(7, 9);
		
		System.out.println("����: " + r.����());
		System.out.println("����: " + s.����());
		
		r.setWidth(5);
		r.setHeight(3);
		System.out.println("����: " + r.getWidth() +", ����: " + r.getHeight());
		System.out.println("����: " + r.����());
	}
}
