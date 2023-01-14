package main;

import java.util.ArrayList;
import java.util.Collections;

import employee_using_comparable.Employee;
import employee_using_comparator.SortUsingId;
import employee_using_comparator.SortUsingName;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(1);

//--------------here collections sort method is used for sorting------------------------------------------------------ 
		System.out.print("Normal Sorting--  "); 
		Collections.sort(arrayList);
		System.out.println(arrayList);
		// But here if we sort the object in which properties are there ex(new
		// emp(name,id,number))
		// it will give exception
		// therefore we use comparable and comparator

//---------------using Comparable----------------------------------------------------------------------------- 
		// here we need to implements the comparable interface to the employee class
		// and override he compare method
		// and compare the properties there in
		// (employee_using_comparable->Employee.java)


		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(7, "rohan", 7688376183l));
		emp.add(new Employee(1, "king", 2228855183l));
		emp.add(new Employee(4, "aarti", 76333376183l));
		emp.add(new Employee(3, "nargis", 7698900376183l));

		System.out.println("not sorted-- "+emp); //not used sort
		Collections.sort(emp);
		System.out.println("sort using Comparable byId-- "+emp);  //sort using comparable

		// butt why we use comparator
		// by comparable we can apply only one logic like here we did by comparing
		// id(employee_using_comparable->Employee.java)
		// we you want to compare name then you want to change the code and write
		// different logic
		// therefore we use comparator
		
//---------------using Comparator---------------------------------------------------------------------------
		ArrayList<employee_using_comparator.Employee> emp1 = new ArrayList<>();
		emp1.add(new employee_using_comparator.Employee(7, "rohan", 7688376183l));
		emp1.add(new employee_using_comparator.Employee(1, "king", 2228855183l));
		emp1.add(new employee_using_comparator.Employee(4, "aarti", 76333376183l));
		emp1.add(new employee_using_comparator.Employee(3, "nargis", 7698900376183l));
		
		System.out.println("not Sorted-- "+emp1); //not used sort
		Collections.sort(emp1,new SortUsingId());
		System.out.println("Sort using Comparator--  "+emp1);  //sort using comparator
		
		Collections.sort(emp1,new SortUsingName());
		System.out.println("Sort using Comparator By Name--  "+emp1);  //sort using comparator
		
		
		

	}

}
