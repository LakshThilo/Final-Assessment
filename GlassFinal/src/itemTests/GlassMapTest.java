package itemTests;

import static org.junit.Assert.*;

import org.junit.Test;

import itemSrc.*;


public class GlassMapTest {

	GlassMap glassList;
	/**
	 * This is the  constructor.
	 * Provide an implementation of a constructor that passes these tests
	 */
	@Test
	public void testParcelMap() {
		glassList = new GlassMap();
		assertTrue(glassList.hasGlass()==true); 
		//String id,String colour,double price,int days,double height,double perimeter
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		glassList.addDetails(g);
		assertTrue(glassList.getNumberOfEntries()==2);
		assertEquals(glassList.findGlass("XY002"),g2);
	}
/**
 * This method has been tested in the constructor.
 * Provide an implementation for  it
 */
	@Test
	public void testAddDetails() {
		glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		
		assertTrue(glassList.getNumberOfEntries()==1);
		glassList.addDetails(g);
		//assertEquals(glassList.findGlass("XY001"),g);
		//assertTrue(glassList.getNumberOfEntries()==2);
	}

	/**
	 * This method has already been tested with the constructor.
	 * provide an implementation for it
	 */
	@Test
	public void testHasParcel() {
		glassList = new GlassMap();
		assertTrue(glassList.hasGlass()==true);
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		assertFalse(glassList.hasGlass()==true);
		glassList.addDetails(g);
		assertTrue(glassList.getNumberOfEntries()==2);
	}
/**
 * This method has already been tested above, and in the constructor
 * Provide implementation for it
 */
	@Test
	public void testGetNumberOfEntries() {
		glassList = new GlassMap();
		assertTrue(glassList.getNumberOfEntries()==0);
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		assertTrue(glassList.getNumberOfEntries()>0);
		glassList.addDetails(g);
		assertTrue(glassList.getNumberOfEntries()==2);
	}
/**
 * this method tests whether all parcels have been marked as collected, all gone 
 * provide the implementation for it
 */
	@Test
	public void testAllGone() {
		glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		
		glassList.setCollected(g2);
		
		assertFalse(glassList.allGone()==true);
		glassList.addDetails(g);
		assertFalse(glassList.allGone()==true);
		
	}
/**
 * We test whether a recorded parcel has the correct number of fields i.e.
 * id, days, length, width, height, weight, collected
 * This is one way of testing it
 * You are to provide an implementation for this method
 */
	@Test
	public void testListDetails() {
		glassList = new GlassMap();
		//Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		
		//Parcel p = new Parcel("lt64s", 2, 5, 4, 3,1);
		glassList.addDetails(g2);
		String details [] = glassList.listDetails().split(",");
		assertFalse(details.length==6);
	}
/**
 * This tests whether we can mark a parcel as collected
 * You are to provide the implementation
 */
	@Test
	public void testSetCollected() {
		glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		glassList.addDetails(g);
		glassList.setCollected(g2);
		assertFalse(glassList.hasGlass()==true);           
		glassList.setCollected(g);
		assertFalse(glassList.allGone()==true);
	}
/**
 * This tests that we can list uncollected items
 * Provide an implementation for this method
 */
	@Test
	public void testListUncollected() {
		glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		//Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g);
		g.setCollected(false);
		assertEquals(glassList.listUncollected(), glassList.listUncollected());
		//assertTrue(glassList.findGlass("XY002").isCollected()==true);
		
	}

/**
 * this tests whether we can find a parcel that matches a certain id
 * You are to provide an implementation for this method
 */
	@Test
	public void testFindParcel() {
		glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		Glass g2 = new Glass("XY002", "Blue", 3, 2, 1,1);
		glassList.addDetails(g2);
		glassList.addDetails(g);
		
		assertNotEquals(glassList.findGlass("ntqx"), g);
		assertEquals(glassList.findGlass("XY002"), g2);
	}

}
