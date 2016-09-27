package org.jdsp.iirfilterdesigner;

import org.jdsp.iirfilterdesigner.designers.AbstractIIRDesigner;
import org.jdsp.iirfilterdesigner.designers.ButterworthIIRDesigner;
import org.jdsp.iirfilterdesigner.designers.Chebyshev1IIRDesigner;
import org.jdsp.iirfilterdesigner.designers.Chebyshev2IIRDesigner;
import org.jdsp.iirfilterdesigner.designers.EllipticIIRDesigner;
import org.jdsp.iirfilterdesigner.exceptions.BadFilterParametersException;
import org.jdsp.iirfilterdesigner.model.ApproximationFunctionType;
import org.jdsp.iirfilterdesigner.model.FilterCoefficients;
import org.jdsp.iirfilterdesigner.model.FilterType;

/**
 * This class represents a designer capable of designing digital filters, i.e.
 * calculating the {@link FilterCoefficients} according to the given
 * {@link TimeDomainSampleFilter specification}.
 *
 * @author Piotr Szachewicz
 */
public class IIRDesigner {

    /**
     * A variable which controls whether logging should be performed.
     */
    protected static boolean enableLogger = true;

    /**
     * Returns the {@link FilterCoefficients coefficients} of a digital filter
     * which meets the given filter specification.
     *
     * @param approximationFunctionType the type of the approximation function
     *        which should be used to design the filter.
     * @param type the type of the filter (lowpass, highpass, bandpass or
     *        bandstop)
     * @param passbandEdgeFrequencies the passband edge frequencies
     * @param stopbandEdgeFrequencies the stopband edge frequencies
     * @param passbandRipple maximum ripple allowed for the filter to have in
     *        the passband [dB]
     * @param stopbandAttenuation minimum attenuation required for the filter to
     *        have in the stopband [dB]
     * @param samplingFrequency the sampling frequency at which the filter will
     *        operate
     * @return the {@link FilterCoefficients} of the filter designed which meets
     *         given specification.
     * @throws BadFilterParametersException thrown when the filter cannot design
     *         a filter for the given parameters.
     */
    public static FilterCoefficients designDigitalFilter(ApproximationFunctionType approximationFunctionType,
	    FilterType type, double[] passbandEdgeFrequencies, double[] stopbandEdgeFrequencies, double passbandRipple,
	    double stopbandAttenuation, double samplingFrequency) throws BadFilterParametersException {

	AbstractIIRDesigner iirdesigner;

	if (approximationFunctionType.isButterworth())
	    iirdesigner = new ButterworthIIRDesigner();
	else if (approximationFunctionType.isChebyshev1())
	    iirdesigner = new Chebyshev1IIRDesigner();
	else if (approximationFunctionType.isChebyshev2())
	    iirdesigner = new Chebyshev2IIRDesigner();
	else if (approximationFunctionType.isElliptic())
	    iirdesigner = new EllipticIIRDesigner();
	else
	    throw new BadFilterParametersException(
		    "This approximation function type is not supported by the IIRFilterDesigner.");

	iirdesigner.enableDebugger(enableLogger);
	return iirdesigner.designDigitalFilter(samplingFrequency, type, passbandEdgeFrequencies,
		stopbandEdgeFrequencies, passbandRipple, stopbandAttenuation);

    }
}