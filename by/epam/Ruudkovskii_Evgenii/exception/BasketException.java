package exception;

public class BasketException extends Exception {
    public BasketException() {
        super();
    }

    public BasketException(String message) {
        super(message);
    }

    public BasketException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketException(Throwable cause) {
        super(cause);
    }

    protected BasketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
