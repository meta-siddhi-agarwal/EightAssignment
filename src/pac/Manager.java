package pac;

//Class Manager which is a sub class of employee class
class Manager extends Employee{
	double basicPay,bonus,compensation;
	String name;
	int empId;
	String departmentType;

	/**
	 * constructor for initializing variables of class
	 * @param empId uniq. id of an emp.
	 * @param basicPay salary of an emp.
	 * @param name of an emp.
	 */
	public Manager(int empId,double basicPay, String name) {
		this.empId=empId;
		this.basicPay=basicPay;
		this.name=name;
	}

	@Override
	double getBasicSalary() {
		return basicPay;
	}

	@Override
	double getBonus() {
		bonus=basicPay*0.2;
		return bonus;
	}

	@Override
	double getCompensation() {
		return basicPay+bonus;
	}

	@Override
	protected String getEmployeeName() {
		return name;
	}
	@Override
	int getEmpId() {
		return getEmpId();
	}
	
}