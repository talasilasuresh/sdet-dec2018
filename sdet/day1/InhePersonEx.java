package com.training.sdet.day1;

public class InhePersonEx {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Person p = new Employee();
		p.setPersonId(101);
		((Employee) p).setEmployeeSalary(20000);

		System.out.println(p);
		p = new Customer();

		System.out.println(p);
		System.out.println(((Employee) p).getEmployeeSalary());
	}

}
