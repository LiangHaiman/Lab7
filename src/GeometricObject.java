
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color , boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor:" + color + " and filled: " + filled;
	}
}
