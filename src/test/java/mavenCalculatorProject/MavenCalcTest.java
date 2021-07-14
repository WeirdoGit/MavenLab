package mavenCalculatorProject;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MavenCalcTest extends MavenCalc {
	
	MavenCalc cal = new MavenCalc();
	
	@Test
	public void testAdd() {
		Assert.assertEquals(cal.add(10, 20), 30);
	}
	@Test
	public void testDivision() {
		Assert.assertEquals(cal.div(10, 20), 0.5);
	}
	@Test 
	public void testMultiplication()
	{
		Assert.assertEquals(cal.mul(10, 20), 200);
	}
	@Test 
	public void testSubtruction()
	{
		Assert.assertEquals(cal.sub(10, 20), -10);
	}
}