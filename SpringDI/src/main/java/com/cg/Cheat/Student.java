package com.cg.Cheat;

public class Student {
	
	private MathChit m;
	
	
	public MathChit getM() {
		return m;
	}


	public void setM(MathChit m) {
		this.m = m;
	}


	void cheating() {
		m.mathChit();
	}

}
