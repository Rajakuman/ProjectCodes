package com.upgrad.aadhaar;

import java.util.HashMap;
import java.util.Map;

public class AadharUtil {

	public static void main(String[] args) {
		AdharIdentifier ramIdentifier = new AdharIdentifier();
		ramIdentifier.setName("Ram");
		ramIdentifier.setFingerPrints("ramFingerPrint");
		ramIdentifier.setEyePrints("ramEyePrint");
                AdharIdentifier ramIdentifier1 = new AdharIdentifier();
		ramIdentifier1.setName("Ram");
		ramIdentifier1.setFingerPrints("ramFingerPrint");
		ramIdentifier1.setEyePrints("ramEyePrint");

		Object ramValue = new Object();

		Map<AdharIdentifier, Object> aadharMap = new HashMap<>();
		aadharMap.put(ramIdentifier, ramValue);
                aadharMap.put(ramIdentifier1, ramValue);
                System.out.println("aadharMap size="+aadharMap.size());

	}

}
