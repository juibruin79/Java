import org.junit.*;
import static org.junit.Assert.*;

class FractionTestDrive{
	MyFraction f1 = new MyFraction(1,3);
	

	public static void main(String[] args){
		
		FractionTestDrive test = new FractionTestDrive();
		test.test();
	}

	@Test
	public void test(){
		MyFraction result = f1.add(new MyFraction(2,3));
		//System.out.println(result.toString());
		//System.out.println("@Test: result should be 1/1");
		assertEquals("1/1", result.toString());
		result = f1.multiply(new MyFraction(3,4));
		assertEquals("1/4", result.toString());

	}


}