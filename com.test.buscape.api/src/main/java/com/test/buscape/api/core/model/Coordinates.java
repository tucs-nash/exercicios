package com.test.buscape.api.core.model;

import com.test.buscape.api.core.enums.CompassPoint;

/**
 * Classe da Coordenatas
 * @author tbdea
 *
 */
public class Coordinates {

	private int x, y, z;
	
	private CompassPoint compassPoint;
	
	public Coordinates() {
		this.compassPoint = CompassPoint.NORTH;
	}
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void addX() {
		this.x++;
	}
	public void subtractX() {
		this.x--;		
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void addY() {
		this.y++;
	}
	public void subtractY() {
		this.y--;		
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void addZ() {
		this.z++;
	}
	public void subtractZ() {
		this.z--;		
	}

	public CompassPoint getCompassPoint() {
		return compassPoint;
	}

	public void setCompassPoint(CompassPoint compassPoint) {
		this.compassPoint = compassPoint;
	}	
}
