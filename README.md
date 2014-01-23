Java IIR Filter Designer
========================

Java IIR Filter Designer is a Java library for designing Infinite
Impulse Response (IIR) filters.

The implementation of this library is based on Scipy signal package.

How to use it:
--------------

Designing an IIR filter boils down to using the IIRDesigner's designDigitalFilter method.
For example:

	FilterCoefficients coefficients = IIRDesigner.designDigitalFilter(ApproximationFunctionType.BUTTERWORTH, FilterType.LOWPASS, new double[]{10.0}, new double[]{20.0}, 3.0, 40.0, 256.0);

The designDigitalFilter uses the following parameters:
1. ApproximationFunctionType approximationFunctionType,
2. FilterType filterType,
3. double[] passbandEdgeFrequencies, 
4. double[] stopbandEdgeFrequencies
5. double passbandRipple
6. double stopbandAttenuation
7. double samplingFrequency


