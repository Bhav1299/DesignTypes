package proto;

public class Triangle implements Shape {
	
	public Triangle() {
		System.out.println("Shape : Triangle. Made.");
	}

	public Shape makeCopy() {
		
		System.out.println("Shape is being made");
		
		Triangle triangle = null;
		
		try {
			triangle = (Triangle) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return triangle;
	}

	@Override
	public String toString() {
		return "Triangle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
