/**
 * An exception used to report invalid menu option selection.
 *
 * @author mdixon
 */
@SuppressWarnings("serial")
public class InvalidOptionException extends Exception {

    /**
     * Constructor.
     *
     * @param msg the exception message.
     */
    InvalidOptionException(String msg) {

        super(msg);
    }
}
