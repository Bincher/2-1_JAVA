package employee;
	abstract public class Employee {
		// 필드 선언
		protected int id;
		protected String name;
		protected DepartmentEnum department;
		public Employee(int id, String name, DepartmentEnum department) {
			this.id = id;
			this.name = name;
			this.department = department;
		}
		abstract public void print();
		// setters 및 getters 정의
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