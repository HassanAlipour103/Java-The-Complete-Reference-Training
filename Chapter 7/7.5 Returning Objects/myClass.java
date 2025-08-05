//A method can return any type of data, including class types that you create


public class myClass{
	
	public static void main(String[] args){
		
		Test t1 = new Test(15);
		Test t2;
		
		// incByTen method return an object
		t2 = t1.incByTen();
		
		System.out.println("t1.a: "+t1.a);
		System.out.println("t2.a: "+t2.a);
		
		t2 = t2.incByTen();
		System.out.println("t2.a after second increment : "+t2.a);
	}
}


class Test{
	
	int a;
	Test(int i){
		a=i;
	}
	
	// this method returs our costum object
	Test incByTen(){
		
		Test temp = new Test(a + 10);
		return temp;
	}
	
}