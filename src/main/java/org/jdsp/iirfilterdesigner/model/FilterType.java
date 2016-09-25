package org.jdsp.iirfilterdesigner.model;

/**
 * This enumeration type represents whether the filter is lowpass, highpass,
 * bandpass or bandstop.
 *
 * @author Piotr Szachewicz
 */
public enum FilterType {

    LOWPASS, HIGHPASS, BANDPASS, BANDSTOP;

    public boolean isLowpass() {
	return (this == LOWPASS);
    }

    public boolean isHighpass() {
	return (this == HIGHPASS);
    }

    public boolean isBandpass() {
	return (this == BANDPASS);
    }

    public boolean isBandstop() {
	return (this == BANDSTOP);
    }

}