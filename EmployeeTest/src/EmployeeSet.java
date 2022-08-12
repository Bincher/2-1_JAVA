import java.util.Scanner;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// �迭 ����
	Employee [] emp;			// ����
	int indexEmp;				// ��ϵ� ������ ���� �ο� �� 
	
	public EmployeeSet() {
		emp = new Employee[MAX_SIZE];
		indexEmp = 0;
	}
	
	public void RegisterEmp(Scanner s) {
		System.out.println("");
		System.out.println(">>> ���� ��� <<<");
		
		int id = 10101 + indexEmp;
		System.out.print(">> name: ");
		String name = s.next();
		System.out.print("== �μ� ���: �ѹ�(11) �λ�(12) ��ȹ(13) ����(14) ����(15)\n>> department: ");
		int dept = s.nextInt();
		System.out.print("== ���� ���: �̻�(21) ����(22) ����(23) �븮(24) ���(25)\n>> position: ");
		int position = s.nextInt();
		System.out.print(">> grade: ");
		int grade = s.nextInt();
		// �ڵ� �ۼ�
		// �̸�, �μ�, ����, ȣ�� �Է�
		
		emp[indexEmp] = new Employee(id, name, dept, position, grade);
		indexEmp++;

		s.nextLine(); // ���� ���
	}

	public void SearchAll() {
		// �ڵ� �ۼ�
		// ���� ���� ���
		for (int i = 0; i < indexEmp; i++)
		{
			System.out.println("\n================");
			System.out.printf("id: %d\n", emp[i].getId());
			System.out.printf("name: %s\n", emp[i].getName());
			switch(emp[i].getDept())
			{
			case 11:
				System.out.println("department: �ѹ�");
				break;
			case 12:
				System.out.println("department: �λ�");
				break;
			case 13:
				System.out.println("department: ��ȹ");
				break;
			case 14:
				System.out.println("department: ����");
				break;
			case 15:
				System.out.println("department: ����");
				break;
			}
			switch(emp[i].getPosition())
			{
			case 21:
				System.out.println("position: �̻�");
				break;
			case 22:
				System.out.println("position: ����");
				break;
			case 23:
				System.out.println("position: ����");
				break;
			case 24:
				System.out.println("position: �븮");
				break;
			case 25:
				System.out.println("position: ���");
				break;
			}
			System.out.printf("grade: %d\n", emp[i].getGrade());
		}
	}
}