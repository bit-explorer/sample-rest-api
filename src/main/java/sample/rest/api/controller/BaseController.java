package sample.rest.api.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.rest.api.model.Employee;
import sample.rest.api.model.Greeting;
import sample.rest.api.service.IEmployeeService;


@RestController
public class BaseController {

  @Autowired
  private IEmployeeService employeeService;
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

  @GetMapping("/employee/{id}")
  public Employee getEmployee(@PathVariable("id") String employeeID) {
    return employeeService.getEmployeeById(employeeID);
  }

}
