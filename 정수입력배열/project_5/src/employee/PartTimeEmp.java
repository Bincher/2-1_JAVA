package employee;

public class PartTimeEmp extends Employee {
	// �ʵ� ����
	private int hours;
	public PartTimeEmp() {
		super(0000, "�輺��", null);
		this.hours = 0;
	}

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		super(id, name, department);
		this.hours = hours;
	}
	
	public void print() {
		// �ڵ� �ۼ�
		System.out.println("================");
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("department : "+ department.message);
		System.out.println("hours :" + hours);
		System.out.println();
	}

	// setters �� getters ����
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
