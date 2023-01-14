package employee_using_comparator;

public class Employee {
	Integer id;
	String name;
	Long phone;
		
	
	public Employee(Integer id, String name, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}



}
