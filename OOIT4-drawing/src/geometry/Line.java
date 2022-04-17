package geometry;

public class Line {
	private Point startPoint; 
	private Point endPoint;
	private boolean selected;
	
	public Line() {
		//inicijalizaciju mozemo raditi i u samoj klasi
		//this.startPoint = new Point();
		//this.endPoint = new Point();
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;	
	}
	
	public double length() {
		//duzinu linije racunamo kao udaljenost endPoint tacke i startPoint tacke
		//koristimo distance metodu definisanu u Point klasi
		return this.endPoint.distance(this.startPoint.getX(), this.endPoint.getY());
	}

	public Point getStartPoint() {
		return this.startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return this.endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return this.selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	@Override
	public String toString() {
		//return "("+this.startPoint.getX()+","+this.startPoint.getY()+")"+"--> ("+this.endPoint.getX()+","+this.endPoint.getY()+")";
		return this.startPoint + "-->" + this.endPoint;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line l = (Line)obj;
			if(this.getStartPoint().equals(l.getStartPoint()) && this.getEndPoint().equals(l.getEndPoint())) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean contains(int x, int y) {
		double d = this.getStartPoint().distance(x, y) + this.getEndPoint().distance(x, y);
		return d - this.length() <= 2;
	}
	
	public boolean contains(Point point) {
		double d = this.getStartPoint().distance(point.getX(), point.getY()) + this.getEndPoint().distance(point.getX(), point.getY());
		return d - this.length() <= 2;
	}
	
}
