package in.blogspot.randomcompiler.decorator.pattern.impl;

import in.blogspot.randomcompiler.decorator.pattern.api.Residence;
import in.blogspot.randomcompiler.decorator.pattern.api.ResidenceDecorator;

public class ModularKitchen implements ResidenceDecorator {
	private Residence residence;
	
	public ModularKitchen(Residence residence) {
		this.residence = residence;
	}

	@Override
	public String getDescription() {
		return residence.getDescription() + " Modular Kitchen";
	}

	@Override
	public int getCost() {
		return residence.getCost() + 150000;
	}
}
