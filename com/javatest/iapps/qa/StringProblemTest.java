package con.javatest.iapps.qa;

import org.junit.Assert;
import org.junit.Test;

import com.java.iapps.qa.StringProblem;

public class StringProblemTest{
	
	private StringProblem sb = new StringProblem();
	
	@Test
	public void testStringProblemPass() {
		String s = "iapps qa interview";
		char c = 'a';
		String str = sb.remove(s, c);
		
		Assert.assertEquals("ipps q interview", str);
	}
	
	@Test
	public void testStringProblemFailure() {
		String s = "iapps qa interview";
		char c = 'i';
		String str = sb.remove(s, c);
		Assert.assertNotEquals("iapps qa interview", str);
	}
}
