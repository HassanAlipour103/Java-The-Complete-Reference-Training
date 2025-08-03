public class TypeConversionInMethodOverloading{
	
	
	public static void main(String[] args){
		overloadDemo od = new overloadDemo();
		
		int i = 10;
		
		od.test();
		od.test(20,30);
		
		od.test(10);// there is no test(int) method defined
		// but java can auto convert int to double and call test(double) instead
		
		
	}
		
}

class overloadDemo{
	
	void test(){
		System.out.println("No parameter...");	
	}
	
	void test(int a,int b){
		System.out.println("a and b :"+a+" and "+b);
		
	}
	
	void test(double a){
		System.out.println("double a: "+a);
	}
	
}
