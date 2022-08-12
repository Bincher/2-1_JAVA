package 모양; // 원 클래스 컴파일하여 모양 패키지(모양 폴더)에 저장

public class 원 {
	
	int 반지름; // 필드: 원의 반지름
	String 이름; // 필드: 원의 이름
	public double 면적계산() { // 메소드: 면적 계산
		return 3.14*반지름*반지름;
	}
	
	public static void main(String[] args) {
		원 작은원;
		작은원 = new 원();
		작은원.반지름 = 10;
		작은원.이름 = "동전";
		double 면적 = 작은원.면적계산();
		System.out.println(작은원.이름 + "의 면적은 " + 면적);
	}
}