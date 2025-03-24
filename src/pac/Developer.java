package pac;


// Class Developer which is a sub class of employee class
public class Developer extends Employee {

	/*
	 * basicpay->basic salary, bonus provided by the company
	 * compensation=basicpay+bonus
	 */
	double basicPay, bonus, compensation;
	// denoes name of the emp.
	String empName;

	// uniq. identifier of emp.
	int empId;
	// dept. in which an emp. is a part
	String departmentType;

	/**
	 * constructor for initializing variables of class
	 * @param empId    uniq. id of an emp.
	 * @param basicPay salry of an emp.
	 * @param name     denoted full name of an emp.
	 */
	public Developer(int empId, double basicPay, String name) {
		this.empId = empId;
		this.basicPay = basicPay;
		empName = name;
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
		return empName;
	}

	// will get emp. id which is a uniq. identifier
	@Override
	int getEmpId() {

		return empId;
	}

}