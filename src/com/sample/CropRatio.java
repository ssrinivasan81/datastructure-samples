package com.sample;

import java.util.HashMap;

public class CropRatio {
    private int totalWeight;
    private int initialWeight = 0;
    private HashMap<String, Integer> crops = new HashMap<String, Integer>();

    public void add(String name, int cropWeight) {
    	initialWeight += cropWeight;
        Integer currentCropWeight = crops.get(name);

        if (currentCropWeight == null) {
            crops.put(name, cropWeight);
        } else {
        	crops.put(name, initialWeight);
        }

        
        totalWeight += cropWeight;
    }

    public double proportion(String name) {
    	 double prop = 0.0d;    	 
         if (crops != null && crops.containsKey(name)) {
        	 prop = crops.get(name) / (double) totalWeight;         	
         }
         
         return prop;
    }

    public static void main(String[] args) {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 5);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 1);
 
        
        
        System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
    }
}