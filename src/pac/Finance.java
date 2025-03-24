package pac;

import java.util.ArrayList;
import java.util.List;

//class Finance which extends Department class
public class Finance extends Department {
	// will store all emp. of particular dept.
	static List<Employee> listOfEmployess = new ArrayList<>();
	// emp. obj. for adding it into dept.
	Employee employeeObject;
	// dept. name(finance)
	String deptName;

	/**
	 * will set dept. name
	 * 
	 * @param deptName name of the dept.
	 */
	Finance(String deptName) {
		this.deptName = deptName;
	}

	// will add emp. to the dept.
	@Override
	boolean join(Employee empObject) {
		boolean isAdded = false;
		if (listOfEmployess.size() == 0) {
			listOfEmployess.add(empObject);
			empObject.departmentType = "Finance";
			isAdded = true;
			return isAdded;
		}
		for (int listIndex = 0; listIndex < listOfEmployess.size(); listIndex++) {
			if ((listOfEmployess.get(listIndex).getEmpId()) == empObject.getEmpId()) {
				isAdded = false;
			} else {
			}
			listOfEmployess.add(empObject);
			empObject.departmentType = "Finance";
			isAdded = true;
		}
		return isAdded;
	}

	// removes employee from department
	@Override
	boolean relieve(Employee empObject) {
		boolean isRemoved = false;
		for (int listIndex = 0; listIndex < listOfEmployess.size(); listIndex++) {
			if ((listOfEmployess.get(listIndex).getEmpId()) == empObject.getEmpId()) {
				listOfEmployess.remove(listIndex);
				empObject.departmentType = null;
				isRemoved = true;
			}
		}
		return isRemoved;
	}

	// get list of emp. of dept.
	@Override
	List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		for (int empListIndex = 0; empListIndex < listOfEmployess.size(); empListIndex++) {
			empList.add(listOfEmployess.get(empListIndex));
		}
		return empList;
	}

	// get dept. name
	@Override
	String getDepartmentName() {
		return deptName;
	}

}
