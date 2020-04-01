package sample.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employee {

  private String employeeID;
  private String firstName;
  private String lastName;
  private String dob;
  private String phone;
  private Address address;

}
