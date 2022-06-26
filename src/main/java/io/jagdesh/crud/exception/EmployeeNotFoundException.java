package io.jagdesh.crud.exception;

public class EmployeeNotFoundException extends Exception {

    public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    protected EmployeeNotFoundException(String message, Throwable cause,
                                        boolean enableSuppression, boolean writeableStackTrace) {
        super(message, cause, enableSuppression, writeableStackTrace);
    }
}
