package pac;

public class Tax {
	//denotes tax deducted from an emp. salary	
	double tax;

	/**
	 * will cal. tax which is deducted from their salary
	 * @param employeeType-> emp. object
	 * @return tax implied on that emp.
	 */
	double calculateTax(Employee employeeType) {

		if(employeeType.getBasicSalary()<=500000) {
			tax=0;
		}
		else if(employeeType.getBasicSalary()>500000 && employeeType.getBasicSalary()<=1000000) {
			tax=0.5*employeeType.getBasicSalary();
		}
		else if(employeeType.getBasicSalary()>1000000 && employeeType.getBasicSalary()<=2000000) {
			tax=0.20*employeeType.getBasicSalary();
		}
		else tax=0.30*employeeType.getBasicSalary();
		
		return tax;
	}

	/**
	 * prints pay slip for an emp.
	 * @param employeeType-> denotes emp. object
	 */
	public void printPaySlip(Employee employeeType) {
		System.out.println();
		System.out.println("EMPLOYEE SUMMARY");
		System.out.println("Employee Name " +employeeType.getEmployeeName());

		System.out.println();
		System.out.println("Department-  "+employeeType.departmentType);
		System.out.println("Employee ID "+employeeType.getEmpId());
		System.out.println("-----------------------------------------------");
		System.out.println("Earnings             "+"Amount");
		System.out.println("Basic Pay            "+employeeType.getBasicSalary());
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Tax "+calculateTax(employeeType));
		System.out.println();	
	}

}
