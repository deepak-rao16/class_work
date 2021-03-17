/*simple ex to illustrate the static method 3*/

class ExampleStatic{
	
	static int a=10;
	
	void display(){
		System.out.println("value of a: "+a);
	}
	
	//static block, it will be executed before the main once
	static{System.out.println("Inside Static block ");a=20;}

	//constructor, here we override the default constructor
	ExampleStatic(){
		a++;
	}
	
	public static void main(String args[]){
		ExampleStatic es1= new ExampleStatic();  // creating new obj es1 for ExampleStatic() default constructor
		es1.display();
		
		ExampleStatic es2= new ExampleStatic();
		es2.display();
	}
}	