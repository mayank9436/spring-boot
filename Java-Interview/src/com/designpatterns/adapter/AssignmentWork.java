package com.designpatterns.adapter;

public class AssignmentWork {

	private Pen p;
	
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void WriteAssignment(String msg){
		p.write(msg);
	}
}
