package be.ac.umons.odl;

import java.awt.*;

public class ConvexPolygon implements Drawable {
	private final Point[] vertices;

	public ConvexPolygon(Point[] vertices)
	{
		this.vertices = vertices;
	}

	public Point[] getVertices()
	{
		return vertices;
	}

	public double areaTriangle(Point a, Point b, Point c) {
		return (Math.abs((((a.getX() - c.getX()) * (b.getY() - c.getY())) - ((a.getY() - c.getY()) * (b.getX() - c.getX()))) / 2));
	}

	public double perimeter() {
		double perimeter = 0;
		for (int i = 0; i < vertices.length; i++) {
			if (i + 1 == vertices.length) {//quand je suis à mon dernier point, calculer la longueur par rapport au premier point
				perimeter += vertices[i].distance(vertices[0]);
			} else {//sinon toujours calculer par rapport au point suivant
				perimeter += vertices[i].distance(vertices[i + 1]);
			}
		}
		return perimeter;
	}

	public double area() {//version de mehdi, tracer des triangles dans la figure
		double area = 0;
		Point centre = new Point(0, 0);
		for (Point i : vertices) {
			centre.setX(centre.getX() + i.getX());
			centre.setY(centre.getY() + i.getY());
		}
		centre.setX(centre.getX() / vertices.length);
		centre.setY(centre.getY() / vertices.length);

		for (int i = 0; i < vertices.length; i++) {
			if (i + 1 != vertices.length) area += areaTriangle(vertices[i], vertices[i + 1], centre);
			else area += areaTriangle(vertices[i], vertices[0], centre);
		}
		return area;
	}
	@Override
	public void draw(Graphics g) {
		int[] xPoints = new int[vertices.length];
		int[] yPoints = new int[vertices.length];
		for (int i = 0; i < vertices.length; i++) {
			Point vertex = vertices[i];
			xPoints[i] = vertex.getX();
			yPoints[i] = vertex.getY();
		}
		g.drawPolygon(xPoints, yPoints, vertices.length);
	}
}
