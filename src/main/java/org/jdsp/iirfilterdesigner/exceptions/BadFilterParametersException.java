package org.jdsp.iirfilterdesigner.exceptions;

/**
 * This exception class indicates that the filter designer cannot design the
 * filter for the given parameters.
 */
public class BadFilterParametersException extends Exception {

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param problem the detail message
     */
    public BadFilterParametersException(String problem) {
	super(problem);
    }

}