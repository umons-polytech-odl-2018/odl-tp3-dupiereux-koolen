package be.ac.umons.odl;

public class Square extends Rectangle {
	public Square(Point a, int sideLength)
	{
		super(a, new Point(a.getX() + sideLength, a.getY() + sideLength));
	}
}
