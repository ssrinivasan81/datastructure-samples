package com.sample;

public class FactoryDesignModel {
	public Shape shape(String shapeType) {
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new FactoryDesignModelCircle();
		} else	if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new FactoryDesignModelRectangle();
		}  else	if (shapeType.equalsIgnoreCase("Oval")) {
			return new FactoryDesignModelOval();
		}
		
		return null;
	}
}
