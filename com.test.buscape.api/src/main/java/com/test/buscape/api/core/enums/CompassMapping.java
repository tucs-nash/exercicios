package com.test.buscape.api.core.enums;

/**
 * Enum responsável por mapear as mudanças de pontos cardiais
 * @author tbdea
 *
 */
public enum CompassMapping {

	CHANGE_FROM_NORTH(CompassPoint.NORTH, CompassPoint.WEST, CompassPoint.EAST),
	CHANGE_FROM_SOUTH(CompassPoint.SOUTH, CompassPoint.EAST, CompassPoint.WEST),
	CHANGE_FROM_WEST(CompassPoint.WEST, CompassPoint.SOUTH, CompassPoint.NORTH),
	CHANGE_FROM_LEST(CompassPoint.EAST, CompassPoint.NORTH, CompassPoint.SOUTH)
	;
	
	private final CompassPoint currentPoint;
	private final CompassPoint leftPoint;
	private final CompassPoint rightPoint;
	
	private CompassMapping(CompassPoint currentPoint, CompassPoint leftPoint, CompassPoint rightPoint) {
		this.currentPoint = currentPoint;
		this.leftPoint = leftPoint;
		this.rightPoint = rightPoint;
	}

	public CompassPoint getCurrentPoint() {
		return currentPoint;
	}

	public CompassPoint getLeftPoint() {
		return leftPoint;
	}

	public CompassPoint getRightPoint() {
		return rightPoint;
	}
	
	/**
	 * Retornar o enum da mudança a partir do atual ponto cardial 
	 * @param current
	 * @return
	 */
	public static CompassMapping getCompassChangeByCompassCurrent(CompassPoint current) {
		for (CompassMapping compassChanges : values()) {
			if (compassChanges.getCurrentPoint().equals(current)) {
				return compassChanges;
			}
		}
		
		return null;
	}
}
