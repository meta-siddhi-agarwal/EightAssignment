package pac;

//Class ProductManager which is a sub class of employee class
public class ProductManager extends Employee {
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
    public ProductManager(int empId,double basicPay, String name) {
        this.empId=empId;
        this.basicPay=basicPay;
        this.name=name;
    }

    public ProductManager() {
    }

    @Override
    double getBasicSalary() {
        return basicPay;
    }

    @Override
    double getBonus() {
        return basicPay*0.2;
    }

    @Override
    double getCompensation() {
        compensation=bonus+basicPay;
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
