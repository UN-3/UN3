package org.un.core.exception;

public class UnException extends Exception {

  public UnException() {
    super();
  }

  public UnException(String message) {
    super(message);
  }

  public UnException(String message, Throwable cause) {
    super(message, cause);
  }

}
