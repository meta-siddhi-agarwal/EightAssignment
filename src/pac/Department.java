package pac;

import java.util.*;

/**
 * dept. class acts as blueprint for its sub classes
 * all the classes extending it, wil contain its functionalities
 */
abstract public class Department {
  abstract boolean join(Employee empObject);

  abstract boolean relieve(Employee empObject);

  abstract List<Employee> getEmployees();

  abstract String getDepartmentName();
}
