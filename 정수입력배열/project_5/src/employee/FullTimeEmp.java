package employee;

public class FullTimeEmp extends Employee {
	// 필드 선언
	private PositionEnum position;
	private int grade;
	public FullTimeEmp() {
		super(0000, "김성빈", null);
		this.position = null;
		this.grade = 0;
	}

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
		super(id, name, department);
		this.position = position;
		this.grade = grade;
	}
	

	public void print() {
		// 코드 작성
		System.out.println("================");
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("department : "+ department.message);
		System.out.println("position :" + position.message);
		System.out.println("grade :" + grade);
		System.out.println();
	}

	// setters 및 getters 정의
	public PositionEnum getPosition() {
		return position;
	}

	public void setPosition(PositionEnum position) {
		this.position = position;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
