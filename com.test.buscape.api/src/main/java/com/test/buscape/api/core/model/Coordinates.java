package com.test.buscape.api.core.model;

/**
 * Classe da Partida
 * @author tbdea
 *
 */
public class Coordinates {

	private int x, y, z, pointCompass;
		
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
	
	public int getPointCompass() {
		return pointCompass;
	}
	public void setPointCompass(int pointCompass) {
		this.pointCompass = pointCompass;
	}
}
