package in.blogspot.randomcompiler.decorator.pattern.demo;

import in.blogspot.randomcompiler.decorator.pattern.api.Residence;
import in.blogspot.randomcompiler.decorator.pattern.impl.BalconyPanels;
import in.blogspot.randomcompiler.decorator.pattern.impl.FourWheelerParking;
import in.blogspot.randomcompiler.decorator.pattern.impl.ModularKitchen;
import in.blogspot.randomcompiler.decorator.pattern.impl.Villa;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Residence residence = new Villa("Villa", 7500000);
		
		residence = new ModularKitchen(residence);
		residence = new FourWheelerParking(residence);
		residence = new BalconyPanels(residence);
		
		System.out.println("Description: " + residence.getDescription());
		System.out.println("Cost: " + residence.getCost());
	}
	
}
