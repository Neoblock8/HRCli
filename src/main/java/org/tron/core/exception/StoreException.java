package org.tron.core.exception;

public class StoreException extends HRNetworkException {

  public StoreException() {
    super();
  }

  public StoreException(String message) {
    super(message);
  }

  public StoreException(String message, Throwable cause) {
    super(message, cause);
  }
}
