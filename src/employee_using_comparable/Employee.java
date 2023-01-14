package employee_using_comparable;

public class Employee implements Comparable<Employee>{
	
	@Override
	public int compareTo(Employee o) {
		
		return this.id - o.id;
	}
	
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

	Integer id;
	String name;
	Long phone;


}
