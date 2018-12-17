package itemTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import itemSrc.Glass;

public class GlassTest {

	Glass g;
	@Test
	public void testGlass() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		  assertEquals(g.getgId(), "XY001");
	}

	@Test
	public void testGetId() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		  assertEquals(g.getgId(),"XY001" );
	}

	@Test
	public void testSetId() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertSame(g.getgId(),"XY001");
		 g.setId("zax009");
		 assertEquals(g.getgId(),"zax009");
	}

	@Test
	public void testGetColour() {
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertSame(g.getgId(),"XY001");
		 g.setColour("Red");
		 assertEquals(g.getColour(),"Red");
	}


	@Test
	public void testGetPrice() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertEquals(g.getPrice(), 5,0);	
		 
	}

	@Test
	public void testSetPrice() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		g.setPrice(10);
		 assertEquals(g.getPrice(), 10,0);
		 
	}

	@Test
	public void testGetDays() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertEquals(g.getDays(),4);  
		 assertTrue(g.getDays()==4);
	}

	@Test
	public void testSetDays() {
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 g.setDays(1);
		 assertEquals(g.getDays(),1); 
		
		 
	}

	@Test
	public void testGetHeight() {
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertEquals(g.getHeight(),3,0); 
		 
	}

	@Test
	public void testSetHeight() {
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 g.setHeight(1);
		 assertEquals(g.getHeight(),1,0);   
	}

	@Test
	public void testGetPerimeter() {
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertEquals(g.getPerimeter(), 1,0);
	}

	@Test
	public void testSetPerimeter() {
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 g.setPerimeter(2);
		 assertEquals(g.getPerimeter(), 2,0);  
		   
	}

	@Test
	public void testIsCollected() {
		
		 g = new Glass("XY001", "Red", 5, 4, 3,1);
		 assertFalse(g.isCollected()!=false);
	}

	public void testSetCollected() {
		g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		 assertFalse(g.isCollected()!=false);
		 g.setCollected(true);
		 assertTrue(g.isCollected()==true);
		 
	}




}
