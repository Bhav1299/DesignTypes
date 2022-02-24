package proto;

public class TestCloning {

	public static void main(String[] args) {

		// We instantiate a new CloneFactory so we can input a Shape to run
		// the makeCopy method for that shape.
		CloneFactory shapeMaker = new CloneFactory();

		// We create a new Rectangle object
		Rectangle rect = new Rectangle();
		
		// We create a new cloned Rectangle called clonedRect
		// by running "getClone" from cloneFactory, "shapeMaker" with
		// the argument "rect"
		Rectangle clonedRect = (Rectangle) shapeMaker.getClone(rect);

		
		// We do the same for triangle:
		//create a triangle tri, and clone tri as clonedTri
		Triangle tri = new Triangle();
		Triangle clonedTri = (Triangle) shapeMaker.getClone(tri);
		
		
		//When  we print out the toStrings of the objects created we can see:
		System.out.println(rect);
		System.out.println(clonedRect);

		System.out.println(tri);
		System.out.println(clonedTri);
		//That the objects, original and cloned, have different Hashcodes,
		//they have different references. They are different objects.
		
		//That the triangles and rectangles are from SEPARATE child-classes
		//When we ran "shapeMaker.getClone()" we are running the makeCopy
		//method in getClone with the argument shapeSample.
		//We could input any shape, triangle or rectangle. We just need 
		// to cast the clone to what we'd like it to be.
		
		
	}

}
