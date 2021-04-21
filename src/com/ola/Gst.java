package com.ola;

public class Gst {
	public static float getGstValue(float value, int gst) {
		float gstVal;
		gstVal = (float) gst / 100;
		value = value * gstVal;
		return value;
	}
}
