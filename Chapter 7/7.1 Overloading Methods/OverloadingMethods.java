// two or more methods within the same class 
// that share the same name, 
// as long as their parameter declarations are different
// the return type alone is insufficient to distinguish two versions of a method

public class OverloadingMethods{
	
	
	public static void main(String[] args){
		
		OverloadDemo od = new OverloadDemo();
		double result;
		
		od.test();
		od.test(10);
		od.test(20,30);
		result=od.test(40.5);
		
	}
	
}

class OverloadDemo{
	
	void test(){
		System.out.println("No parameter...");
	}
	
	void test(int a){
		System.out.println("a: "+a);
	}
	
	void test(int a , int b){
		System.out.println("a and b :"+a+" and "+b);
		
	}
	
	
	double test(double a){
		System.out.println("double a: "+a);
		return a*a;
		
		// the fact that this method returns something
		// has nothing to do with overloading
		// for example the next method will make an error
	}
	
	/* THIS CODE WILL MAKE AN ERROR!!!!!!!!
	int test(int a){
		// because there is another method with same name and parameter list
		// this method will make an error and the fact that return type is different \
		// wont solve the problem
		return a;
	}
	*/
	
}