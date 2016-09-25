package org.jdsp.iirfilterdesigner.model;

/**
 * This enumeration type represents the type of the approximation function which
 * is used to design (i. e. calculate the coefficients for) a
 * {@link TimeDomainSampleFilter}.
 *
 * @author Piotr Szachewicz
 */
public enum ApproximationFunctionType {

    BUTTERWORTH, CHEBYSHEV1, CHEBYSHEV2, ELLIPTIC;

    // private String name;

    /*
     * private ApproximationFunctionType(String name) { this.name = name; }
     */

    public boolean isButterworth() {
	return (this == BUTTERWORTH);
    }

    public boolean isChebyshev1() {
	return (this == CHEBYSHEV1);
    }

    public boolean isChebyshev2() {
	return (this == CHEBYSHEV2);
    }

    public boolean isElliptic() {
	return (this == ELLIPTIC);
    }

}