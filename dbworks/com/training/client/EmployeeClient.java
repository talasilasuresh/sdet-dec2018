package com.training.client;



import com.training.dao.EmployeeDAO;

import com.training.entity.Employee;

import com.training.standards.IEmployeeDAO;



public class EmployeeClient {



	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setEmpId(104);

		employee.setEmpName("Jill");

		employee.setEmpSal(11120);

		employee.setEmpEmail("jill@abc.com");

		

		IEmployeeDAO dao = new EmployeeDAO();

		

		/*boolean insertFlag = dao.insertEmployee(employee);

		

		System.out.println(insertFlag ? "Record Inserted" : "Sorry Record Not Inserted");*/

		

		/*System.out.println(dao.deleteEmployee(103));*/

		

		System.out.println(dao.updateEmployeeSalary(103, 11000));

		

		

		//System.out.println(dao.getEmployee(101));

		

//		dao.getAllEmps().forEach(System.out :: println);

		

	}



}