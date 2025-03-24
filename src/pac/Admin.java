package pac;

import java.util.ArrayList;
import java.util.List;

// class Admin which extends Department class
public class Admin extends Department {

	// will store all emp. of particular dept.
	List<Employee> listOfEmployess = new ArrayList<>();
	// emp. obj. for adding it into dept.
	Employee employeeObject;

	// name of the dept.(admin)
	String deptName;

	/**
	 * will set dept. name
	 * @param deptName name of the dept.
	 */
	Admin(String deptName) {
		this.deptName = deptName;
	}

	// function adds emp. to dept.
	@Override
	public boolean join(Employee empObject) {
		boolean isAdded = false;
		if (listOfEmployess.size() == 0) {
			listOfEmployess.add(employeeObject);
			empObject.departmentType = "Admin";
			isAdded = true;
			return isAdded;
		}
		for (int listIndex = 0; listIndex < listOfEmployess.size(); listIndex++) {
			if ((listOfEmployess.get(listIndex).getEmpId()) == empObject.getEmpId()) {
				isAdded = false;
			} else {
				listOfEmployess.add(employeeObject);
				empObject.departmentType = "Admin";
				isAdded = true;
			}
		}
		return isAdded;
	}

	// removes emp. from dept.
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

	// will return list of emp. in admin dept.
	@Override
	List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		for (int empListIndex = 0; empListIndex < listOfEmployess.size(); empListIndex++) {
			empList.add(listOfEmployess.get(empListIndex));
		}
		return empList;
	}

	@Override
	String getDepartmentName() {
		return deptName;
	}

}
