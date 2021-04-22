package com.ola;

public class GstCalculation {
	
	final static int GST_PERCENTAGE = 7;
	/**
	 * Get the gst value for the give amount
	 * @param value
	 * @return float value of gst
	 */
	public static float getGstValue(float value) {
		float gstVal;
		gstVal = (float) GST_PERCENTAGE / 100;
		value = value * gstVal;
		return value;
	}
}
