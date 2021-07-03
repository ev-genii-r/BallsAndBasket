package exception;

public class BallWeightException extends Exception{
    public BallWeightException() {
        super();
    }

    public BallWeightException(String message) {
        super(message);
    }

    public BallWeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public BallWeightException(Throwable cause) {
        super(cause);
    }

    protected BallWeightException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
