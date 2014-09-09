package in.blogspot.randomcompiler.decorator.pattern.impl;

import in.blogspot.randomcompiler.decorator.pattern.api.Residence;

public abstract class AbstractResidence implements Residence {
	protected String description;
	protected int cost;

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getCost() {
		return cost;
	}
}
