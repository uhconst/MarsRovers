package com.uhc.model;

public class Rover {
	
	private static final Integer XLOWERLEFTCOORD = 0;
	
	private static final Integer YLOWERLEFTCOORD = 0;
	
	private String upperRightCoord;
	
	private String roverPosition;
	
	private String roverMovements;

	private Integer xRoverFinalCoord;
	
	private Integer yRoverFinalCoord;
	
	private String hRoverFinalCoord;
	
	public static Integer getXlowerleftcoord() {
		return XLOWERLEFTCOORD;
	}

	public static Integer getYlowerleftcoord() {
		return YLOWERLEFTCOORD;
	}

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

	public String gethRoverFinalCoord() {
		return hRoverFinalCoord;
	}

	public void sethRoverFinalCoord(String hRoverFinalCoord) {
		this.hRoverFinalCoord = hRoverFinalCoord;
	}
	
}
