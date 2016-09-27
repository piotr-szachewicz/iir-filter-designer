package org.jdsp.iirfilterdesigner.exceptions;

/**
 * This exception class indicates that the filter designer designed the filter
 * for the given parameters, but the filter is instable.
 */
public class FilterNotStableException extends Exception {

    /**
     * Constructs a new exception with the specified detail message.
     */
    public FilterNotStableException() {
	super("The filter designed is not stable.");
    }

}