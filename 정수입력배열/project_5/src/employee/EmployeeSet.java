package employee;

import java.util.Scanner;
import java.util.Vector;
import utils.Utils;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// 배열 길이
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
		System.out.print("\n검색할 이름을 입력하세요\n>> name:");
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
			System.out.println("!!! 해당 이름의 직원이 없습니다.\n");
		}
	}
	public void UpdateName(Scanner s) {
		int count = 0, id;
		int [] ue = new int[10];
		System.out.println("\n갱신할 직원의 id 확인을 위해 직원 이름을 검색합니다.\n");
		System.out.print("검색할 이름을 입력하세요\n>> name:");
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
				System.out.println("!!! 해당 이름의 직원이 없습니다.\n");
				System.out.print("검색할 이름을 입력하세요\n>> name:");
				name = s.next();
			}
		}
		System.out.print("\n정보를 갱신할 직원의 id를 입력하세요\n>> id:");
		id = s.nextInt();
		for(int n : ue)
		{
			if (id == (emp.elementAt(n)).getId() && id < 50000)
			{
				System.out.println("갱신할 정보를 입력하세요.");
				System.out.print(">> name: ");
				name = s.next();
				DepartmentEnum department = Utils.getDepartment(s);
				PositionEnum position = Utils.getPosition(s);
				System.out.print(">> grade: ");
				int grade = s.nextInt();
				emp.set(n, new FullTimeEmp(id, name, department, position, grade));
				
				System.out.print("\n=== 갱신 결과 ===");
				(emp.elementAt(n)).print();
				break;
			}
			else if(id == (emp.elementAt(n)).getId() && id >= 50000)
			{
				System.out.println("갱신할 정보를 입력하세요.");
				System.out.print(">> name: ");
				name = s.next();
				DepartmentEnum department = Utils.getDepartment(s);
				System.out.print(">> hours: ");
				int hours = s.nextInt();
				emp.set(n, new PartTimeEmp(id, name, department, hours));
				
				System.out.print("=== 갱신 결과 ===\n");
				(emp.elementAt(n)).print();
				break;
			}
		}
	}
	public void DeleteName(Scanner s) {
		int count = 0, id;
		int [] ue = new int[10];
		int choice;
		System.out.println("\n삭제할 직원의 id 확인을 위해 직원 이름을 검색합니다.\n");
		System.out.print("검색할 이름을 입력하세요\n>> name:");
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
				System.out.println("!!! 해당 이름의 직원이 없습니다.\n");
				System.out.print("검색할 이름을 입력하세요\n>> name: ");
				name = s.next();
			}
		}
		System.out.print("\n삭제할 id를 입력하세요\n>> id: ");
		id = s.nextInt();
		for(int n : ue)
		{
			System.out.println("\n" + emp.elementAt(n).name + " 삭제하겠습니다? (1:예, 2:아니오)");
			System.out.print(">> 선택: ");
			choice = s.nextInt();
			if (choice == 1)
			{
				emp.remove(n);
				indexEmp--;
				System.out.println("해당 직원을 삭제하였습니다.");
				break;
			}
			else if(choice == 2)
			{
				System.out.println("작업을 취소하였습니다.");
				break;
			}
		}
	}
}
