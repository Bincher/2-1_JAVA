package employeeTest;
import java.util.Scanner;

import employee.EmployeeSet;
import menus.MainMenuEnum;
import menus.Menu;
import menus.RegisterMenuEnum;
import menus.SearchMenuEnum;
import menus.UpdateMenuEnum;
import menus.DeleteMenuEnum;

public class EmployeeTest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		EmployeeSet set = new EmployeeSet();
		MainMenuEnum mm = menu.MainMenu(scanner);  //��� �Ǵ� �˻� �� MainMenu�� ���ư��� ���� -> �ݺ��� �տ� �־��ְ� RETURN�ÿ��� MainMenu�� ���Բ�
		
		while(true) {
			if(mm == MainMenuEnum.REGISTER) {
				// ���� ��� �޴� ��� �� �Է� ó��
				RegisterMenuEnum rm = menu.RegisterMenu(scanner); 
				if (rm == RegisterMenuEnum.FULLTIME)
					set.RegisterFullTimeEmp(scanner);
				else if (rm == RegisterMenuEnum.PARTTIME)
					set.RegisterPartTimeEmp(scanner);
				else if (rm == RegisterMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.SEARCH) {
				// ���� ���� ��� �޴� ��� �� �Է� ó��
				SearchMenuEnum sm = menu.SearchMenu(scanner);
				if (sm == SearchMenuEnum.SEARCH)
					set.SearchAll();
				else if (sm == SearchMenuEnum.PART_SEARCH)
					set.SearchParttime();
				else if (sm == SearchMenuEnum.FULL_SEARCH)
					set.SearchFulltime();
				else if (sm == SearchMenuEnum.NAME_SEARCH)
					set.SearchName(scanner);
				else if (sm == SearchMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.UPDATE) {
				// ���� ���� ��� �޴� ��� �� �Է� ó��
				UpdateMenuEnum um = menu.UpdateMenu(scanner);
				if (um == UpdateMenuEnum.UPDATE)
					set.UpdateName(scanner);
				else if (um == UpdateMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.DELETE) {
				// ���� ���� ��� �޴� ��� �� �Է� ó��
				DeleteMenuEnum dm = menu.DeleteMenu(scanner);
				if (dm == DeleteMenuEnum.DELETE)
					set.DeleteName(scanner);
				else if (dm == DeleteMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.EXIT) {
				System.out.print("Good BYE!");
				break;
			}
		}
		scanner.close();
	}
}