package pac;

abstract public class Employee {

    // will get basic pay
    abstract double getBasicSalary();

    // will get employee bonus
    abstract double getBonus();

    // will get compensation which=basic pay+bonus
    abstract double getCompensation();

    // will get employee name
    abstract String getEmployeeName();

    // will is unique for every emplopyee
    int empId;
    // it means in which department, an employee exists
    String departmentType;

    // will get emplpoyee id which is uniq.
    abstract int getEmpId();
}
