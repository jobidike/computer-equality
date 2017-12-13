import static org.junit.Assert.*;

import org.junit.Test;



public class ComputerTestEquality {
	
	@Test
	public void assertThatTwoObjectsAreAliases() { //two objects are aliases
		Computer underTest = new Computer("make","model",0);
		Computer underTest2 = new Computer("make", "model",0);
		underTest=underTest2; //creates an Alias
		boolean check = (underTest == underTest2);
		assertEquals(check, true);
		
		}
	
	@Test
	public void assertObjectEqualsMethodWorksAsExpected() { //object equals
		Computer underTest = new Computer("make","model",0);  //object equals
		Computer underTest2 = new Computer("make", "model",0);  //using string version of .equals (toString)
		underTest = underTest2;
		boolean check = underTest.equals(underTest2); //.equals is doing this == 
		assertEquals(check, true);
		
	}
	@Test
	public void assertStringEqualsMethodWorksAsExpected() { //string equals
		Computer underTest = new Computer("make","model",0);
		Computer underTest2 = new Computer("make", "model",0);  //string equals
		//underTest = underTest2;
		boolean check = underTest.getMake().equals(underTest2.getMake()); //testing instance variables
		assertEquals(check, true);
		
	}
	@Test
	public void assertComputerEqualsMethodWorksAsExpected() { //computer equals
		Computer underTest = new Computer("make","model",0);
		Computer underTest2 = new Computer("make", "model",0); //
		boolean check = underTest.equals(underTest2); 
		assertEquals(check, true);
		
	}
	
	
	
	
	
	
	
	
	

}