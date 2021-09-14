package org.empinfo;

public class Employee {
	private void EmpName() {
		System.out.println("suraj");
	}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.EmpName();
		
		Company cm = new Company();
		cm.CompanyName();
		
		Client cl = new Client();
		cl.empName();
		
		Project pj = new Project();
		pj.ProjectName();
		
	}
}
