Java IIR Filter Designer
========================

Java IIR Filter Designer is a Java library for designing Infinite
Impulse Response (IIR) filters.

The implementation of this library is based on Scipy signal package.

How to use it:
--------------

Designing an IIR filter boils down to using the IIRDesigner's designDigitalFilter method.
For example:

```
	ApproximationFunctionType functionType = ApproximationFunctionType.BUTTERWORTH;
	FilterType filterType = FilterType.LOWPASS;
	double[] passbandEdgeFrequencies = new double[]{10.0};
	double[] stopbandEdgeFrequencies = new double[]{20.0};
	double passbandRipple = 3.0;
	double stopbandAttenuation = 40.0;
	double samplingFrequency = 256.0;

	FilterCoefficients coefficients = IIRDesigner.designDigitalFilter(functionType, filterType,
		passbandEdgeFrequencies, stopbandEdgeFrequencies, passbandRipple, stopbandAttenuation,
		samplingFrequency);
```

The designDigitalFilter uses the following parameters:

1.  `ApproximationFunctionType approximationFunctionType` - allowed types available in the ApproximationFunctionType enumerator (`BUTTERWORTH`, `CHEBYSHEV1`, `CHEBYSHEV2`, `ELLIPTIC`).
2.  `FilterType filterType` - allowed values available in the FilterType enumerator (`LOWPASS`, `HIGHPASS`, `BANDPASS`, `BANDSTOP`).
3.  `double[] passbandEdgeFrequencies` - contains an array of passband edge frequencies. In case of low-pass or high-pass filter the array should contain only one number, in case of band-pass or band-stop filters two numbers are required.
4.  `double[] stopbandEdgeFrequencies` - contains an array of stopband edge frequencies.
5.  `double passbandRipple` - describes what is the allowable ripple in the passband (in dB).
6.  `double stopbandAttenuation` - describes how much attenuation is required in the stopband (dB).
7.  `double samplingFrequency` - sampling frequency of the signal in Hz.
