package misterx.local.ui.gui;

import java.awt.Component;

public class Constraint {

	private String edge1;
	private Component c1;
	private int distance;
	private String edge2;
	private Component c2;
	
	public Constraint(String edge1, Component c1, int distance, String edge2, Component c2) {
		super();
		this.edge1 = edge1;
		this.c1 = c1;
		this.distance = distance;
		this.edge2 = edge2;
		this.c2 = c2;
	}

	public String getEdge1() {
		return edge1;
	}

	public Component getC1() {
		return c1;
	}

	public int getDistance() {
		return distance;
	}

	public String getEdge2() {
		return edge2;
	}

	public Component getC2() {
		return c2;
	}
}
