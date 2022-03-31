package composite;

import java.util.List;
import java.util.ArrayList;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinate() {
		return subordinates;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept= " + dept + ", salary= "+ salary +"]";
	}

}
