package proto;

public class CloneFactory {
	
	public Shape getClone(Shape shapeSample) {
		
		return shapeSample.makeCopy();
		
	}

}
