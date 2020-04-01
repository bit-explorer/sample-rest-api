package sample.rest.api.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.rest.api.mocks.MockEmployees;
import sample.rest.api.model.Employee;
import sample.rest.api.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

  private List<Employee> employees;

  @Autowired
  public EmployeeService(MockEmployees mockEmployees) {
    this.employees = mockEmployees.getEmployees();
  }

  @Override
  public Employee getEmployeeById(String id) {
    Employee employee = null;
    for (Employee emp : employees) {
      if (emp.getEmployeeID().equals(id)) {
        employee = emp;
      }
    }
    return employee;
  }

  @Override
  public List<Employee> getEmployees() {
    return null;
  }

  @Override
  public void updateEmployee(Employee employee) {

  }

  @Override
  public void deleteEmployee(String id) {

  }
}
