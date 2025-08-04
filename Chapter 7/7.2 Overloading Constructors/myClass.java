//you can also overload constructor methods
public class myClass{
	
	public static void main(String[] args){
		
		// create boxes using various constructors
		Box b1 = new Box(3,5,7);
		Box b2 = new Box(5);
		
		System.out.println("volume of b1: "+b1.volume());
		System.out.println("volume of b2: "+b2.volume());
		
	}
	
}

class Box{
	
	int w,h,d;
	
	// constructor 1 needs three parameters
	Box(int w , int h , int d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	
	
	// what if you want to create a cube
	// you can call the old constructor with same arguments Box(3,3,3)
	// but you can overload the constructor with one parameter like this
	Box(int a){
		
		this.w=a;
		this.h=a;
		this.d=a;
	}
	
	int volume(){
		return w*h*d;
	}
	
	
}