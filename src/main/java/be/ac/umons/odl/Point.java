package be.ac.umons.odl;

public class Point {
	private int x, y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	double distanceTo(Point other)
	{
		return Math.sqrt(Math.pow((double) (other.x - this.x), 2.0) + Math.pow((double) (other.y - this.y), 2.0));
	}
	public double distance(Point b){
		return (Math.sqrt(Math.pow(this.x-b.getX(),2)+Math.pow(this.y-b.getY(),2)));
	}
	public void setX(int nvx){
		this.x=nvx;
	}
	public void setY(int nvy){
		this.y=nvy;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
