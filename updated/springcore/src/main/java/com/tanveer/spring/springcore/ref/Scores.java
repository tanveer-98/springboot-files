package com.tanveer.spring.springcore.ref;

public class Scores {
	
	private Double maths;
	private Double chemistry;
	private Double physics;

	
	
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getChemistry() {
		return chemistry;
	}
	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}
	
	
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", chemistry=" + chemistry + ", physics=" + physics + "]";
	}
	
	
}
