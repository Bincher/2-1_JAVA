class �簢��{
	int width, height;
	public �簢��() {
		this(0,0);
	}
	public �簢��(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int �������() {
		return width * height;
	}
}
public class �簢���׽�Ʈ {
	public static void main(String[] args) {
		�簢�� s = new �簢��(2, 5);
		int r = s.�������();
		System.out.printf("�簢�� ����: %d", r);
	}

}
