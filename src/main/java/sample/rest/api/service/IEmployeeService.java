package sample.rest.api.service;

import java.util.List;
import sample.rest.api.model.Employee;

public interface IEmployeeService {

  Employee getEmployeeById(String id);

  List<Employee> getEmployees();

  void updateEmployee(Employee employee);

  void deleteEmployee(String id);


}
