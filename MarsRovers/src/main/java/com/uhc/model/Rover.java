package com.uhc.model;

public class Rover {
	
	private static final String lowerLeftCoord = "0 0";
	
	private String upperRightCoord;
	
	private String roverPosition;
	
	private String roverMovements;

	private Integer xRoverFinalCoord;
	
	private Integer yRoverFinalCoord;
	
	private Integer hRoverFinalCoord;
	
	public String getUpperRightCoord() {
		return upperRightCoord;
	}

	public void setUpperRightCoord(String upperRightCoord) {
		this.upperRightCoord = upperRightCoord;
	}

	public String getRoverPosition() {
		return roverPosition;
	}

	public void setRoverPosition(String roverPosition) {
		this.roverPosition = roverPosition;
	}

	public String getRoverMovements() {
		return roverMovements;
	}

	public void setRoverMovements(String roverMovements) {
		this.roverMovements = roverMovements;
	}

	public static String getLowerLeftCoord() {
		return lowerLeftCoord;
	}

	public Integer getxRoverFinalCoord() {
		return xRoverFinalCoord;
	}

	public void setxRoverFinalCoord(Integer xRoverFinalCoord) {
		this.xRoverFinalCoord = xRoverFinalCoord;
	}

	public Integer getyRoverFinalCoord() {
		return yRoverFinalCoord;
	}

	public void setyRoverFinalCoord(Integer yRoverFinalCoord) {
		this.yRoverFinalCoord = yRoverFinalCoord;
	}

	public Integer gethRoverFinalCoord() {
		return hRoverFinalCoord;
	}

	public void sethRoverFinalCoord(Integer hRoverFinalCoord) {
		this.hRoverFinalCoord = hRoverFinalCoord;
	}
	
}
