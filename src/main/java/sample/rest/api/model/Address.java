package sample.rest.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

  private String firstLine;
  private String secondLine;
  private String postCode;
  private String city;
  private String country;

}
