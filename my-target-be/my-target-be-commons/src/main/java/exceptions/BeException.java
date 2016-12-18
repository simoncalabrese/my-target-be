package exceptions;

/**
 * Created by simon on 18/12/16.
 */
public class BeException extends Throwable {

    public BeException(String message) {
        super(message);
    }

    public BeException() {
        super("Unknown Error on server side");
    }
}
