package sample.rest.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

  private String employeeID;
  private String firstName;
  private String lastName;
  private String dob;
  private String phone;
  private Address address;

}
