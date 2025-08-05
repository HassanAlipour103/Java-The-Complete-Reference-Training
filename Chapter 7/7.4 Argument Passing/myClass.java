// there are two ways that a computer language can pass an argument to a subroutine
// 1.call-by-value
//		copies the value of an argument into the formal
//		herefore, changes made to the parameter of the subroutine have no effect on the argument
// 2.call-by-reference
//		a reference to an argument (not the value of the argument) is passed to the parameter
//		changes made to the parameter will affect the argument used to call the subroutine

public class myClass{
	
	public static void main(String[] args){
		
		Test t1 = new Test();
		
		int a=10 , b=30;
		
		System.out.println("a and b before passing to method: " + a + " and " + b);
		
		// now we pass them to method
		t1.meth(a,b);
		
		// now we print the values after passing to the method
		// there will be no change in values of and be
		// because their values are passed (1.call-by-value)
		System.out.println("a and b after passing to method: " + a + " and " + b);
		
		
		
		Demo d1 = new Demo(10,30);
		
		System.out.println("d1 variables before passing to method " + d1.i + " and " + d1.j);
		
		// now we pass d1 to the method
		t1.meth2(d1);
		
		System.out.println("d1 variables after passing to method " + d1.i + " and " + d1.j);
		// d1 is passed using 2.call-by-reference
		// so changes to its variables will affect d1
		
		
		// what if i tell you that java ALWAYS uses 1.call-by-value
		// how do you explain changes made to d1 variables
		// Answer:	d1 is actualy a reference to an object
		//			so when we pass d1 we are actualy passing a copy of this reference
		//			then the method can use this copy to access the actual object
		//			and change the actual object using this reference
		
	}
}

class Test{
	
	void meth(int i , int j){
		
		i=i/2;
		j=j*2;
	}
	
	void meth2(Demo d){
		
		d.i /=2;
		d.j *=2;
	}
}


class Demo{
	
	int i,j;
	
	Demo(int i , int j){
		this.i=i;
		this.j=j;
	}
}