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
		super.print();
		System.out.println("hours :" + hours);
	}

	// setters �� getters ����
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
