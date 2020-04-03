package sample.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
@AllArgsConstructor
public class Greeting {

  private final long id;
  private final String content;
}
