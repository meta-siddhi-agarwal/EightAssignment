package pac;

//Class ITAdministrator which is a sub class of employee class
public class ITAdministrator extends Employee {

	double basicPay, bonus, compensation;
	String name;
	int empId;
	String departmentType;

	/**
	 * @param empId->uniq.  identifier of an emp.
	 * @param basicPay->salry of an emp.
	 * @param name-> full name of an emp.
	 */
	public ITAdministrator(int empId, double basicPay, String name) {
		this.empId = empId;
		this.basicPay = basicPay;
		this.name = name;
	}

	@Override
	double getBasicSalary() {
		return basicPay;
	}

	@Override
	double getBonus() {
		bonus = basicPay * 0.2;
		return bonus;
	}

	@Override
	double getCompensation() {
		compensation = bonus + basicPay;
		return compensation;
	}

	@Override
	protected String getEmployeeName() {
		return name;
	}

	@Override
	int getEmpId() {
		return empId;
	}

}