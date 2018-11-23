package be.ac.umons.odl;

import java.awt.*;

public class Ellipsis implements Drawable{
	private Point center;
	private int xAxis;
	private int yAxis;
	//demi-axes !

	public Ellipsis(Point C,int xAxis,int yAxis)
	{
		this.center = C;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public double perimeter()
	{
		return (2*Math.PI*Math.sqrt(((Math.pow(xAxis, 2))+Math.pow(yAxis,2))/2));
	}
	public double area()
	{
		return Math.PI*xAxis*yAxis;
	}
	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX()-xAxis,center.getY()-yAxis,xAxis*2,yAxis*2);
	}
}
