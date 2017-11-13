package com.atcs.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.comparator.EmployeeBean;

public class EmpComparableTest {

	private static final Comparator<Employee> SORT_BY_EMPLOYEE_NAME = new Comparator<Employee>() {

		@Override
		public int compare(Employee arg0, Employee arg1) {
			// TODO Auto-generated method stub
			if (arg0.getSal() == arg1.getSal()) {
				return 0;
			} else if (arg0.getSal() > arg1.getSal()) {
				return 1;
			} else {
				return -1;
			}
			// return arg0.getEmpName().compareTo(arg1.getEmpName());
		}
	};

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setAdds("Thane");
		employee.setEmpId(154);
		employee.setEmpName("sarvesh");
		employee.setSal(122220.2d);

		Employee employee1 = new Employee();
		employee1.setAdds("Panvel");
		employee1.setEmpId(154);
		employee1.setEmpName("Ganesh");
		employee1.setSal(254220.2d);

		Employee employee2 = new Employee();
		employee2.setAdds("Mulund");
		employee2.setEmpId(154);
		employee2.setEmpName("Rimesh");
		employee2.setSal(154220.2d);

		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);

		// Collections.sort(employees);
		System.out.println(employees);

		Collections.sort(employees, SORT_BY_EMPLOYEE_NAME);
		System.out.println(employees);

	}
}
