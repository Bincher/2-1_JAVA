package employee;

public class PartTimeEmp extends Employee {
	// 필드 선언
	private int hours;
	public PartTimeEmp() {
		super(0000, "김성빈", null);
		this.hours = 0;
	}

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		super(id, name, department);
		this.hours = hours;
	}
	
	public void print() {
		// 코드 작성
		super.print();
		System.out.println("hours :" + hours);
	}

	// setters 및 getters 정의
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
