package pac;

import java.util.ArrayList;
import java.util.List;


// class Development which extends Department class
public class Development extends Department {

	// will store all emp. of particular dept.
	static List<Employee> listOfEmployess = new ArrayList<>();
	// emp. obj. for adding it into dept.
	Employee employeeObject;
	// dept. name(development)
	String deptName;

	/**
	 * will set dept. name
	 * @param deptName name of the dept.
	 */
	Development(String deptName) {
		this.deptName = deptName;
	}

	//will add emp. to the dept.
	@Override
	boolean join(Employee empObject) {

		boolean isAdded = false;
		if (listOfEmployess.size() == 0) {
			listOfEmployess.add(empObject);
			empObject.departmentType = "Development";
			isAdded = true;
			return isAdded;
		} else {
			for (int listIndex = 0; listIndex < listOfEmployess.size(); listIndex++) {
				if ((listOfEmployess.get(listIndex).getEmpId()) == empObject.getEmpId()) {
					isAdded = false;
					return isAdded;
				}
			}
			listOfEmployess.add(empObject);
			empObject.departmentType = "Development";
			isAdded = true;
			return isAdded;
		}
	}

	//will remove emp from dept.
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

	// get list of emp. who are in the current dept.
	@Override
	List<Employee> getEmployees() {

		return listOfEmployess;
	}

	// gets name of dept
	@Override
	String getDepartmentName() {
		return deptName;
	}

}
