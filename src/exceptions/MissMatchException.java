package exceptions;

public class MissMatchException extends RuntimeException{
    public MissMatchException(String message) {
        super(message);
    }
}
