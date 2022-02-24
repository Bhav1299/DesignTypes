package proto;

public interface Shape extends Cloneable{
	//Must extend cloneable - either the superclass, or the child classes
	//individually.
	
	public Shape makeCopy();

}
