package pac;

import java.util.ArrayList;
import java.util.List;

public class Organization{
	
	//denoted name of organization eg. MetaCube	
	String organizationName;

	//constructor for setting name of organization	
	Organization(String organizationName){
		this.organizationName=organizationName;
	}

	//will contain list of dept. in particular organization	
	static List<Department> departmentList=new ArrayList<>();
	

	/**
	 * adds dept. to particular organization
	 * @param departmentObject denotes dept. object
	 * @return true->dept. is added or false->dept. not added
	 */	
	boolean addDepartment(Department deptType) {
		
		for (int deptListIndex = 0; deptListIndex < departmentList.size(); deptListIndex++) {
			if(departmentList.get(deptListIndex).getDepartmentName().equals(deptType.getDepartmentName()))return  false;
			else {departmentList.add(deptType);
			return true;}

		}
		
		departmentList.add(deptType);
		return true;
	}
	
	/**
	 * will return all emp. including all dept.
	 * @return list of emp. in all dept. of an organization
	 */	
	List<Employee> getAllEmployees(){
		List<Employee> aggregateList=new ArrayList<>();
		for(int departmentListIndex = 0;departmentListIndex<departmentList.size();
		departmentListIndex++) {

			//dept. object is created for accessing its employee list
			Department deptObject=departmentList.get(departmentListIndex);

			//contain list of employee of a particular dept.
			List<Employee> employeeList=deptObject.getEmployees();
			
			//it means dept. contain employees
			if(employeeList.size()>0){
			for (int empListIndex = 0;
			 empListIndex < employeeList.size(); 
			 empListIndex++) {			
				aggregateList.add(employeeList.get(empListIndex));				
			}
			}								
		}		
		
		return aggregateList;
	}
}