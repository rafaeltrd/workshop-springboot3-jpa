package com.educandoweb.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = -5094545381375870519L;

  public ResourceNotFoundException(Object id) {
        super("Resource not found! Id " + id);
  }
}
