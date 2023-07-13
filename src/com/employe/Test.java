package com.employe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList();
		emp.add(new Employee("abc", 20, 15000));
		emp.add(new Employee("bbc", 21, 20000));
		emp.add(new Employee("cad", 26, 10000));
		emp.add(new Employee("jmp", 25, 25000));
		emp.add(new Employee("qpr", 28, 21000));

		System.out.println("Original Salary:: " + emp);

		List<Employee> incrementedSalary = emp.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());

		System.out.println("inctementSalary:: " + incrementedSalary);

		System.out.println("employee sorted by name");
		List<Employee> employee = emp.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println(employee);
	
	
	}

}
