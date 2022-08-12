
class Employee {
	private int id, dept, position, grade;
	private String name;
	public Employee(int id, String name, int dept, int position, int grade)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public int getDept() {
		return dept;
	}
	public int getPosition() {
		return position;
	}
	public int getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
}