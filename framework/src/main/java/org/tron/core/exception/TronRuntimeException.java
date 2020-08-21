package org.un.core.exception;

public class UnRuntimeException extends RuntimeException {

  public UnRuntimeException() {
    super();
  }

  public UnRuntimeException(String message) {
    super(message);
  }

  public UnRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnRuntimeException(Throwable cause) {
    super(cause);
  }

  protected UnRuntimeException(String message, Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }


}
