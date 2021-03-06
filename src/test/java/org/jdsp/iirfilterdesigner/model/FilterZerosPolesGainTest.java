package org.jdsp.iirfilterdesigner.model;

import static org.jdsp.iirfilterdesigner.IIRDesignerAssert.assertEquals;

import org.apache.commons.math.complex.Complex;
import org.junit.Test;

/**
 * This class performs unit tests on {@link FilterZerosPolesGain} class.
 */
public class FilterZerosPolesGainTest {

    /**
     * Test method for {@link FilterZerosPolesGain#convertToBACoefficients() }.
     */
    @Test
    public void testConvertToABCoefficients() {

	// test 1
	Complex[] zeros = new Complex[0];
	Complex[] poles = new Complex[] { new Complex(-0.08517040, 0.94648443), new Complex(-0.20561953, 0.39204669),
		new Complex(-0.20561953, -0.39204669), new Complex(-0.08517040, -0.94648443) };
	double gain = 0.125297161626;

	FilterZerosPolesGain zpk1 = new FilterZerosPolesGain(zeros, poles, gain);

	double[] pythonB = new double[] { 0.12529716 };
	double[] pythonA = new double[] { 1.00000000, 0.58157986, 1.16911757, 0.40476795, 0.17698695 };
	FilterCoefficients pycoeffs = new FilterCoefficients(pythonB, pythonA);
	FilterCoefficients coeffs = zpk1.convertToBACoefficients();

	assertEquals(pycoeffs, coeffs, 1e-6);

    }

    /**
     * Test method for {@link FilterZerosPolesGain#convertToBACoefficients() }.
     */
    @Test
    public void testConvertToABCoefficients2() {

	// test 1
	Complex[] zeros = new Complex[0];
	Complex[] poles = new Complex[] { new Complex(0.4, 0.2), new Complex(0.5, 0.3) };
	double gain = 1.0;

	FilterZerosPolesGain zpk1 = new FilterZerosPolesGain(zeros, poles, gain);

	double[] pythonB = new double[] { 1.0 };
	double[] pythonA = new double[] { 1, -0.9, 0.14 };
	FilterCoefficients pycoeffs = new FilterCoefficients(pythonB, pythonA);
	FilterCoefficients coeffs = zpk1.convertToBACoefficients();

	assertEquals(pycoeffs, coeffs, 1e-6);

    }

}