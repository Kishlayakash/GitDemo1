
public class PS2 extends PS3 {
	
	int a; //->class variable
	//default constructor
	
	public PS2(int a) { //i is called instance variable
		//Concept of parameterized constructor
		super(a); //By super keyword parent class constructor will be invoked
		this.a=a; 
	}

	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}

}
