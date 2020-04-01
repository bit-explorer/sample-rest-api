package sample.rest.api.mocks;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import sample.rest.api.model.Employee;

@ConfigurationProperties(prefix = "mocks")
@Configuration
@Getter
@Setter
public class MockEmployees {

  private List<Employee> employees;

}
