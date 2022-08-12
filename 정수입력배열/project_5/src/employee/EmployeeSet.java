package employee;

import java.util.Scanner;
import java.util.Vector;
import utils.Utils;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// �迭 ����
	int indexEmp;
	int PartEmp = 0;
	int FullEmp = 0;
	Vector<Employee> emp;
	
	public EmployeeSet() {
		emp = new Vector<Employee>(MAX_SIZE);
		indexEmp = 0;
	}
	
	public void RegisterFullTimeEmp(Scanner s) {
		int id = 10101 + FullEmp;
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		PositionEnum position = Utils.getPosition(s);
		int grade = Utils.getGrade(s);

		emp.add(indexEmp, new FullTimeEmp(id, name, department, position, grade));
		FullEmp++;
		indexEmp++;
	}

	public void RegisterPartTimeEmp(Scanner s) {
		int id = 50101 + PartEmp;
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		int hours = Utils.getHours(s);

		emp.add(indexEmp, new PartTimeEmp(id, name, department, hours));
		PartEmp++;
		indexEmp++;
	}
	
	public void SearchAll() {
		for(int n=0; n<indexEmp; n++) {
			(emp.elementAt(n)).print();
		}
	}
	public void SearchParttime() {
		for(int n=0; n<indexEmp; n++) {
			if (emp.elementAt(n) instanceof PartTimeEmp && emp.elementAt(n) != null)
				(emp.elementAt(n)).print();
		}
	}
	public void SearchFulltime() {
		for(int n=0; n<indexEmp; n++) {
			if (emp.elementAt(n) instanceof FullTimeEmp && emp.elementAt(n) != null)
				(emp.elementAt(n)).print();
		}
	}
	public void SearchName(Scanner s) {
		int count = 0;
		System.out.print("\n�˻��� �̸��� �Է��ϼ���\n>> name:");
		String name = s.next();
		for(int n=0; n<indexEmp; n++) {
			if ((emp.elementAt(n).getName()).equals(name))
			{
				count++;
				(emp.elementAt(n)).print();
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
		System.out.println("\n������ ������ id Ȯ���� ���� ���� �̸��� �˻��մϴ�.\n");
		System.out.print("�˻��� �̸��� �Է��ϼ���\n>> name:");
		String name = s.next();
		for(int n=0; n<indexEmp; n++) {
			if (((emp.elementAt(n)).getName()).equals(name))
			{
				ue[count++] = n;
				(emp.elementAt(n)).print();
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
			if (id == (emp.elementAt(n)).getId() && id < 50000)
			{
				System.out.println("������ ������ �Է��ϼ���.");
				System.out.print(">> name: ");
				name = s.next();
				DepartmentEnum department = Utils.getDepartment(s);
				PositionEnum position = Utils.getPosition(s);
				System.out.print(">> grade: ");
				int grade = s.nextInt();
				emp.set(n, new FullTimeEmp(id, name, department, position, grade));
				
				System.out.print("\n=== ���� ��� ===");
				(emp.elementAt(n)).print();
				break;
			}
			else if(id == (emp.elementAt(n)).getId() && id >= 50000)
			{
				System.out.println("������ ������ �Է��ϼ���.");
				System.out.print(">> name: ");
				name = s.next();
				DepartmentEnum department = Utils.getDepartment(s);
				System.out.print(">> hours: ");
				int hours = s.nextInt();
				emp.set(n, new PartTimeEmp(id, name, department, hours));
				
				System.out.print("=== ���� ��� ===\n");
				(emp.elementAt(n)).print();
				break;
			}
		}
	}
	public void DeleteName(Scanner s) {
		int count = 0, id;
		int [] ue = new int[10];
		int choice;
		System.out.println("\n������ ������ id Ȯ���� ���� ���� �̸��� �˻��մϴ�.\n");
		System.out.print("�˻��� �̸��� �Է��ϼ���\n>> name:");
		String name = s.next();
		for(int n=0; n<indexEmp; n++) {
			if (((emp.elementAt(n)).getName()).equals(name))
			{
				ue[count++] = n;
				(emp.elementAt(n)).print();
			}
			if (count == 0 && n == indexEmp - 1)
			{
				n = 0;
				System.out.println("!!! �ش� �̸��� ������ �����ϴ�.\n");
				System.out.print("�˻��� �̸��� �Է��ϼ���\n>> name: ");
				name = s.next();
			}
		}
		System.out.print("\n������ id�� �Է��ϼ���\n>> id: ");
		id = s.nextInt();
		for(int n : ue)
		{
			System.out.println("\n" + emp.elementAt(n).name + " �����ϰڽ��ϴ�? (1:��, 2:�ƴϿ�)");
			System.out.print(">> ����: ");
			choice = s.nextInt();
			if (choice == 1)
			{
				emp.remove(n);
				indexEmp--;
				System.out.println("�ش� ������ �����Ͽ����ϴ�.");
				break;
			}
			else if(choice == 2)
			{
				System.out.println("�۾��� ����Ͽ����ϴ�.");
				break;
			}
		}
	}
}
