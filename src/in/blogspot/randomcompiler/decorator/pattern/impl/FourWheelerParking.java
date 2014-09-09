package in.blogspot.randomcompiler.decorator.pattern.impl;

import in.blogspot.randomcompiler.decorator.pattern.api.Residence;
import in.blogspot.randomcompiler.decorator.pattern.api.ResidenceDecorator;

public class FourWheelerParking implements ResidenceDecorator {
	private Residence residence;
	
	public FourWheelerParking(Residence residence) {
		this.residence = residence;
	}

	@Override
	public String getDescription() {
		return residence.getDescription() + " Four Wheeler Parking";
	}

	@Override
	public int getCost() {
		return residence.getCost() + 200000;
	}
}
