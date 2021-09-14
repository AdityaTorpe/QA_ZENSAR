package org.empDetails;

public class Employee {
	private void empid() {
		System.out.println("1234");
	}
	private void empName() {
		System.out.println("Employee name is Aditya");
	}
	private void empDob() {
		System.out.println("birth date is 03/12/2000");

	}
	private void empPhone() {
		System.out.println("phone number is 8378071572");

	}
	private void empEmail() {
		System.out.println("mail id torpeaditya@gmail.com");
	}
	private void empAddress() {
		System.out.println("adress of Employee Ahmednagar");
	}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.empName();
		em.empDob();
		em.empPhone();
		em.empEmail();
		em.empAddress();
	}
}
