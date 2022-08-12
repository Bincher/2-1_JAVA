package employee;

import java.util.Scanner;

import utils.Utils;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// �迭 ����
	Employee [] emp;
	int indexEmp;
	int PartEmp = 0;
	int FullEmp = 0;
	
	public EmployeeSet() {
		emp = new Employee[MAX_SIZE];
		
		indexEmp = 0;
	}
	
	public void RegisterFullTimeEmp(Scanner s) {
		int id = 10101 + FullEmp;
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		PositionEnum position = Utils.getPosition(s);
		int grade = Utils.getGrade(s);

		emp[indexEmp] = new FullTimeEmp(id, name, department, position, grade);
		FullEmp++;
		indexEmp++;
	}

	public void RegisterPartTimeEmp(Scanner s) {
		int id = 50101 + PartEmp;
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		int hours = Utils.getHours(s);

		emp[indexEmp] = new PartTimeEmp(id, name, department, hours);
		PartEmp++;
		indexEmp++;
	}
	
	public void SearchAll() {
		for(int n=0; n<indexEmp; n++) {
			emp[n].print();
		}
	}
	public void SearchParttime() {
		for(int n=0; n<indexEmp; n++) {
			if (emp[n] instanceof PartTimeEmp)
				emp[n].print();
		}
	}
	public void SearchFulltime() {
		for(int n=0; n<indexEmp; n++) {
			if (emp[n] instanceof FullTimeEmp)
				emp[n].print();
		}
	}
	public void SearchName(Scanner s) {
		int count = 0;
		System.out.print("�˻��� �̸��� �Է��ϼ���\n>> name:");
		String name = s.next();
		for(int n=0; n<indexEmp; n++) {
			if ((emp[n].getName()).equals(name))
			{
				count++;
				emp[n].print();
			}
		}
		if (count == 0)
		{
			System.out.println("!!! �ش� �̸��� ������ �����ϴ�.\n");
		}
	}
	public void UpdateName(Scanner s) {
		int count = 0, id;
		int [] ue = new int[10];
		System.out.println("������ ������ id Ȯ���� ���� ���� �̸��� �˻��մϴ�.\n");
		System.out.print("�˻��� �̸��� �Է��ϼ���\n>> name:");
		String name = s.next();
		for(int n=0; n<indexEmp; n++) {
			if ((emp[n].getName()).equals(name))
			{
				ue[count++] = n;
				emp[n].print();
			}
			if (count == 0 && n == indexEmp - 1)
			{
				n = 0;
				System.out.println("!!! �ش� �̸��� ������ �����ϴ�.\n");
				System.out.print("�˻��� �̸��� �Է��ϼ���\n>> name:");
				name = s.next();
			}
		}
		System.out.print("\n������ ������ ������ id�� �Է��ϼ���\n>> id:");
		id = s.nextInt();
		for(int n : ue)
		{
			if (id == emp[n].getId() && id < 50000)
			{
				FullTimeEmp ftemp = new FullTimeEmp();
				ftemp.setId(emp[n].getId());
				System.out.println("������ ������ �Է��ϼ���.");
				System.out.print(">> name: ");
				ftemp.setName(s.next());
				DepartmentEnum department = Utils.getDepartment(s);
				ftemp.setDepartment(department);
				PositionEnum position = Utils.getPosition(s);
				ftemp.setPosition(position);
				System.out.print(">> grade: ");
				ftemp.setGrade(s.nextInt());
				emp[n] = ftemp;
				
				System.out.print("=== ���� ��� ===\n");
				emp[n].print();
			}
			else if(id == emp[n].getId() && id >= 50000)
			{
				PartTimeEmp ptemp = new PartTimeEmp();
				ptemp.setId(emp[n].getId());
				System.out.println("������ ������ �Է��ϼ���.");
				System.out.print(">> name: ");
				ptemp.setName(s.next());
				DepartmentEnum department = Utils.getDepartment(s);
				ptemp.setDepartment(department);
				System.out.print(">> hours: ");
				ptemp.setHours(s.nextInt());
				emp[n] = ptemp;
				
				System.out.print("=== ���� ��� ===\n");
				emp[n].print();
			}
		}
		
	}
}
