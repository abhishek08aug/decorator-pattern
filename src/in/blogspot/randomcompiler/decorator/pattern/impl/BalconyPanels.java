package in.blogspot.randomcompiler.decorator.pattern.impl;

import in.blogspot.randomcompiler.decorator.pattern.api.Residence;
import in.blogspot.randomcompiler.decorator.pattern.api.ResidenceDecorator;

public class BalconyPanels implements ResidenceDecorator {
	private Residence residence;
	
	public BalconyPanels(Residence residence) {
		this.residence = residence;
	}

	@Override
	public String getDescription() {
		return residence.getDescription() + " Balcony Panels";
	}

	@Override
	public int getCost() {
		return residence.getCost() + 120000;
	}
}
