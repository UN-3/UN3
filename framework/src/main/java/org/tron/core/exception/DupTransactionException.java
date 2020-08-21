package org.un.core.exception;

public class DupTransactionException extends UnException {

  public DupTransactionException() {
    super();
  }

  public DupTransactionException(String message) {
    super(message);
  }
}
