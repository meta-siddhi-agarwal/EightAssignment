package pac;

import java.util.ArrayList;
import java.util.List;

// Main class which calls all the classes and methods
public class Main {
	//for creating an employee to add into organization
	static Employee empObject;
    
	//for creating an organization
	static Organization organizationObject;
   
	//for creating a department
	static Department deptObject;

	//tax object for calling its methods
	static Tax taxObject;

	//will contain list of emp. 
	static List<Employee> listEmp=new ArrayList<>();

   //check whether an emp.is added to dept. or not
    static 	boolean isEmpAdded;

	//check wheteher dept. is added to organization or not
	static boolean isDeptAdded;

	public static void main(String[] args) {

		//creating an organization named MetaCube
		organizationObject=new Organization("MetaCube");
		
		//add multiple dept. into it
		testClassForAddDept();
		
		//creating new emp. and adding into organization
	    empObject=new Developer(1,100000000,"John");
		addEmpToOrganization(empObject);
		
		//calculating its tax and payslip
		taxObject=new Tax();		
		taxObject.printPaySlip(empObject);

		//creating new emp. and adding into organization
		empObject=new Developer(2,1000000,"Shreya Sharma");
		addEmpToOrganization(empObject);

		//calculating its tax and payslip
		taxObject=new Tax();		
		taxObject.printPaySlip(empObject);
		
		//creating new emp. and adding into organization
		empObject=new HrProfessionals(3,1000,"Sneha");
		addEmpToOrganization(empObject);
		
		//removing an emp. from organization
		testCaseForRemove();
		
		//will print list of emp. in a particular dept.
		showEmpOfDept();
      
		// will print list of emp. of an entire organiztion
		getAllEmployees();
	}

	/**
	 * will get all emp. of the organization
	 */
	static void getAllEmployees(){
		List<Employee> listEmp=new ArrayList<>();
		listEmp=organizationObject.getAllEmployees();
		List<String> empName=new ArrayList<>();
		for (int empListImdex = 0; empListImdex < listEmp.size(); empListImdex++) {
			empName.add(listEmp.get(empListImdex).getEmployeeName());
		}
		System.out.println("Total employee in an organization are "+empName);
	}
	
	
	//will get emp. of a particular dept.
	static void showEmpOfDept(){

		Department deptObject=new Development("Development");
		List<Employee> empList=new ArrayList<>();
		empList=deptObject.getEmployees();
		List<String> empName=new ArrayList<>();

		for (int empListIndex = 0; empListIndex < empList.size(); empListIndex++) {
			empName.add(empList.get(empListIndex).getEmployeeName());
		}

		System.out.println("List of employee in "+deptObject.getDepartmentName()+" department are"+empName);
	}

	// will remove an emp. from organization if such emp. exists 
	static public void testCaseForRemove(){
		empObject=new Developer(10,100000000,"John");
		deptObject=new Development("Development");
		boolean isRemoved=deptObject.relieve(empObject);
		if(isRemoved)System.out.println("Employee removed");
		else System.out.println("No such employee exists");
	}

	/**
	 * checks whether any emp. with same id exists or not
	 * @param {employeeObject} emp  which needs to be added
	 * @return whether id exists or  not
	 */
	public static boolean isEmpIdExists(Employee employeeObject){
		listEmp=organizationObject.getAllEmployees();		
		Employee emplObject;
		for (int listIndex = 0;  listIndex< listEmp.size(); listIndex++) {
			emplObject=listEmp.get(listIndex);
			if(emplObject.getEmpId()==employeeObject.getEmpId())return true;
		}
		return false;
	}

	/**
	 * will add emp. to organization
	 * @param empObject which needs to be added
	 */
	static public void addEmpToOrganization(Employee empObject){
		if(isEmpIdExists(empObject)){
			System.out.println("Employee id already exists!!\nEnter Unique Id");
		}
		else{
			deptObject=new Development("Development");
			deptObject.join(empObject);

		}

	}

	/**
	 * will check whether dept. exists or not
	 * if does not exists, will add to organization
	 */
	public static void testClassForAddDept(){
			deptObject=new Development("Development");
			isDeptAdded=organizationObject.addDepartment(deptObject);

			if(isDeptAdded)System.out.println("Department added successfully");
			else System.out.println("Department already exists");

			deptObject=new Development("Development");
			isDeptAdded=organizationObject.addDepartment(deptObject);

			if(isDeptAdded)System.out.println("Department added successfully");
			else System.out.println("Department already exists");
			
			deptObject=new IT("IT");
			isDeptAdded=organizationObject.addDepartment(deptObject);

			if(isDeptAdded)System.out.println("Department added successfully");
			else System.out.println("Department already exists");

	}

}
