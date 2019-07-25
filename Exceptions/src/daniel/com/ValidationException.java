package daniel.com;

public class ValidationException extends Exception {

    String errorCode;

    public ValidationException(String msg, String errorCode) {
        super(msg);
        this.errorCode = errorCode;

    }
}
