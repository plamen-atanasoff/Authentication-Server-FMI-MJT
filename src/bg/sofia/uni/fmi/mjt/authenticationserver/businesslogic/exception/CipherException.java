package bg.sofia.uni.fmi.mjt.authenticationserver.businesslogic.exception;

public class CipherException extends RuntimeException {
    public CipherException(String message) {
        super(message);
    }

    public CipherException(String message, Throwable cause) {
        super(message, cause);
    }
}
