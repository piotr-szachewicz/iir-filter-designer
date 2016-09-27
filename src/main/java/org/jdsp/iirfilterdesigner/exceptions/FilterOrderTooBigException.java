package org.jdsp.iirfilterdesigner.exceptions;

/**
 * This exception class indicates that the order of the filter designed for the
 * given parameters is too big - the filter may not work as intended.
 */
public class FilterOrderTooBigException extends BadFilterParametersException {

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param problem the detail message
     */
    public FilterOrderTooBigException(String problem) {
	super(problem);
    }

}
