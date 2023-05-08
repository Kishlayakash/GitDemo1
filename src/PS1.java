import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	public void testRun() {
		int a = 3;
		doThis(); //inheritance
		
		PS2 ps2 = new PS2(3); //by creating object
		//Concept of parameterized constructor
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		//PS3 ps3 = new PS3(3);
		System.out.println(ps2.multiplyThree());
		System.out.println(ps2.multiplyTwo());
	}
}
