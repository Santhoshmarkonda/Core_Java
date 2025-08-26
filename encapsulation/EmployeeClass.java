package com.encapsulation;

class Company{

	private String companyName;
	private String companyAddress;
	private String companyRules;

	private Company(String comapnyName, String companyAddress, String companyRules) {
		this.companyName = comapnyName;
		this.companyAddress = companyAddress;
		this.companyRules = companyRules;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public void setCompanyRules(String companyRules) {
		this.companyRules = companyRules;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public String getCompanyRules() {
		return companyRules;
	}

	public String toString() {
		return companyName + "\n" + companyAddress + "\n" + companyRules;
	}

	public static Company getCompanyObject(String companyName, String companyAddress, String companyRules) {
		return new Company(companyName, companyAddress, companyRules);
	}
}

class Department {
	private String deptName;
	private int deptId;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void showDepartmentDetails() {
		System.out.println("Departmenu ID: " + deptId);
		System.out.println("Department Name: " + deptName);
	}
}

class Employee {
	private int id;
	private String name;
	private double salary;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void showEmployeeDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
}

//class Employee {
//	private String name;
//	private String desg;
//	private Company company;
//	private double salary;
//
//	private Employee(String name, String desg, Company company, double salary) {
//		this.name = name;
//		this.desg = desg;
//		this.company = company;
//		this.salary = salary;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setDesg(String desg) {
//		this.desg = desg;
//	}
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getDesg() {
//		return desg;
//	}
//
//	public Company getCompany() {
//		return company;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//
//	public String toString() {
//		return name + "\n" + desg + "\n" + company + "\n" + salary;
//	}
//
//	public static Employee getEmployeeObject(String employeeName, String employeeDesg, Company company,
//			double salary) {
//		return new Employee(employeeName, employeeDesg, company, salary);
//	}
//}


public class EmployeeClass {
    public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(121);
		emp.setName("santhosh");
		emp.setSalary(75000.56);
		emp.showEmployeeDetails();
		System.out.println();
		Department dept = new Department();
		dept.setDeptId(11);
		dept.setDeptName("Development");
		dept.showDepartmentDetails();
		
//		Company company1 = Company.getCompanyObject("Tcs", "Hydrabad", "14 months bond");
//
//		Employee employee1 = Employee.getEmployeeObject("Santhosh", "SDE", company1, 70000.54);
//
//		System.out.println(company1);
//		System.out.println(employee1);

	}
}
