package pac;

// Class BusinessAnalyst which is a sub class of employee class
public class BusinessAnalyst extends Employee {

	/*
	 * basicpay->basic salary, bonus provided by the company
	 * compensation=basicpay+bonus
	 */
	double basicPay, bonus, compensation;

	// denotes name of emp.
	String name;

	// denotes uniq. id of emp.
	int empId;

	// denotes department name of emp.
	String departmentType;

	/**
	 * constructor for initializing variables of class
	 * @param empId         uniq. identifier of an employee
	 * @param basicPay->    salry of an employee
	 * @param name->denotes full name of employee
	 */
	public BusinessAnalyst(int empId, double basicPay, String name) {
		this.empId = empId;
		this.basicPay = basicPay;
		this.name = name;
	}

	// function will get salry of an employee
	@Override
	double getBasicSalary() {
		return basicPay;
	}

	// function will get bonus of an employee
	@Override
	double getBonus() {
		bonus = basicPay * 0.2;
		return bonus;
	}

	// function will get compensation of an employee
	@Override
	double getCompensation() {
		compensation = bonus + basicPay;
		return compensation;
	}

	// will get emp. name
	@Override
	protected String getEmployeeName() {
		return name;
	}

	// will get emp. id wich is uniq.
	@Override
	int getEmpId() {
		return empId;
	}

}