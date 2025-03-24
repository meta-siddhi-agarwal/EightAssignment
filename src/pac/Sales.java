package pac;

import java.util.ArrayList;
import java.util.List;

//class Sales which extends Department class
public class Sales extends Department{

	List<Employee> listOfEmployess=new ArrayList<>();
	Employee employeeObject;
	String deptName;

   /**
   * will set dept. name
   * @param {deptName} name of the dept.
   */
	Sales(String deptName){
		this.deptName=deptName;
	}

	//adds emp. to dept.
	@Override
	boolean join(Employee empObject) {
		boolean isAdded=false;
		if(listOfEmployess.size()==0){
			listOfEmployess.add(empObject);
			empObject.departmentType="Sales";
			isAdded=true;
			return isAdded;
		}
		for(int listIndex=0;listIndex<listOfEmployess.size();listIndex++) {
			if((listOfEmployess.get(listIndex).getEmpId())==empObject.getEmpId()) {
			isAdded=false;	
			}
			else {				
			}
			listOfEmployess.add(empObject);
			empObject.departmentType="Sales";
			isAdded=true;
		}
		return isAdded;
	}

	//remove emp. from dept.
	@Override
	boolean relieve(Employee empObject) {
		boolean isRemoved=false;
		for(int listIndex=0;listIndex<listOfEmployess.size();listIndex++) {
			if((listOfEmployess.get(listIndex).getEmpId())==empObject.getEmpId()) {
			listOfEmployess.remove(listIndex);
			empObject.departmentType=null;
			isRemoved=true;
			}
			
			
		}
		return isRemoved;
	}

	//get list of all emp. of dept.
	@Override
	List<Employee> getEmployees() {
		List<Employee> empList=new ArrayList<>();
		for(int empListIndex=0;empListIndex<listOfEmployess.size();empListIndex++){
			empList.add(listOfEmployess.get(empListIndex));
		}
		return empList;
	}

	//get dept. name
    @Override
    String getDepartmentName() {
        return deptName;
    }

}
