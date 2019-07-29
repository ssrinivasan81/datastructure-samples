package com.sample;

public class FactoryDesignModelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryDesignModel factoryDesignModel = new FactoryDesignModel();
		
		Shape shape = factoryDesignModel.shape("Circle");
		shape.draw();
		
		Shape shape1 = factoryDesignModel.shape("Rectangle");
		shape.draw();
		
		
	}

}
