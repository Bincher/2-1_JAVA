package employee;
	public class Employee {
		// �ʵ� ����
		protected int id;
		protected String name;
		protected DepartmentEnum department;
		public Employee(int id, String name, DepartmentEnum department) {
			this.id = id;
			this.name = name;
			this.department = department;
		}
		public void print() { 
			System.out.println("\n================");
			System.out.println("id : " + id);
			System.out.println("name : " + name);
			System.out.println("department : "+ department.message);
		}
		// setters �� getters ����
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public DepartmentEnum getDepartment() {
			return department;
		}
		public void setDepartment(DepartmentEnum department) {
			this.department = department;
		}
		
}