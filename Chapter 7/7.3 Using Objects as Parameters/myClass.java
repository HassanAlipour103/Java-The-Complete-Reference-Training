public class myClass{
	
	
	public static void main(String[] args){
		
		Test t1 = new Test(10,20);
		// passing object t1 to constructor
		Test t2 = new Test(t1);
		
		Test t3 = new Test(20,30);
		
		// ################################### passing object to method
		System.out.println("t1 equals to t2: "+t1.equalTo(t2));
		System.out.println("t2 equals to t3: "+t2.equalTo(t3));
	}
}


class Test{
	
	int i,j;
	
	Test(int i , int j){
		
		this.i=i;
		this.j=j;
	}
	
	// you can pass custom objects to constructor
	Test(Test o){
		i=o.i;
		j=o.j;
	}
	
	// you can pass custom objects to methods
	boolean equalTo(Test o){
		
		return (i==o.i && j==o.j);
	}
	
	
}