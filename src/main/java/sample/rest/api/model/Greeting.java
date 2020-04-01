package sample.rest.api.model;

import lombok.Data;

@Data
public class Greeting {

  private final long id;
  private final String content;
}
