package org.jdsp.iirfilterdesigner.response;

import org.jdsp.iirfilterdesigner.model.FilterCoefficients;

/**
 * An abstract class for creating concrete calculators:
 * {@link FilterFrequencyResponseCalculator} or
 * {@link FilterTimeDomainResponseCalculator}.
 */
public abstract class FilterResponseCalculator {

    /**
     * The sampling frequency for which the filter responses will be calculated.
     */
    protected double samplingFrequency;

    /**
     * The coefficients of the filter for which the filter responses are
     * calculated.
     */
    protected FilterCoefficients filterCoefficients;

    /**
     * Constructor. Creates a new FilterResponseCalculator.
     * 
     * @param samplingFrequency sampling frequency for which the responses will
     *        be calculated.
     * @param filterCoefficients coefficients of the filter for which the
     *        responses will be calculated.
     */
    public FilterResponseCalculator(double samplingFrequency, FilterCoefficients filterCoefficients) {
	this.samplingFrequency = samplingFrequency;
	this.filterCoefficients = filterCoefficients;
    }

}
