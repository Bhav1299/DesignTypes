package proto;

public class Rectangle implements Shape{

	//Rectangle constructor
	public Rectangle() {
		System.out.println("Shape : Rectangle. Made.");
	}
	
	public Shape makeCopy() {
		//implemented method
		
		System.out.println("New shape is being made");
		
		Rectangle rectangle = null;
		
		try {
			rectangle = (Rectangle) super.clone();
		} catch (CloneNotSupportedException e) {
			// Must throw this exception incase a class without Cloneable
			//tries to clone
			e.printStackTrace();
		}
		
		return rectangle;
	}

	@Override
	public String toString() {
		return "Rectangle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	//note if a shape is being instantiated then will print
	//"Shape : Rectangle . Made."
	//if cloned then "Shape is being made"
	

}
