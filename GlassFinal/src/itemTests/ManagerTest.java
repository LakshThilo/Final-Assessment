package itemTests;

import static org.junit.Assert.*;

import org.junit.Test;

import itemSrc.*;


public class ManagerTest {
	
/**
 * The Manager class is fully implemented 
 * You're to write JUnit tests for it. 
 * This is likely to be possible after implementing 
 * the other classes
 *
 */
	Manager m;
	QueueOfCusts custQ ;
	private GlassMap allGlass ;
	 
	@Test
	public void testManager() {
		
		 m = new Manager();
		custQ = new QueueOfCusts();
	    allGlass = new GlassMap();
	    
	    //assertEquals(expected, actual);
	     
		
	}

	@Test
	public void testInitialiseData() {
		
		m = new Manager();
		m.initialiseData();
		m.getTotalPriceforParicularCun();
	}

	@Test
	public void testInitialiseWorkers() {
		
		m = new Manager();
		m.initialiseData();
		m.InitialiseWorkers();
		m.getTotalPriceforParicularCun();
	}
	
	@Test
	public void testgetTotalPriceforParicularCun(){
		
		CustInQueue c1 =  new CustInQueue("Cus01","Andrew","px34","Ord01", 4,12);
		CustInQueue c2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,12);
		OrderDetails or = new OrderDetails(c1);
 		System.out.println(or.getTotalPrice());
 		OrderDetails or1 = new OrderDetails(c1);
 		System.out.println(or1.getTotalPrice());
	}

	@Test
	public void testReadCustFile() {
		
		m = new Manager();
		m.readCustDetailFile();
	}

	@Test
	public void testReadParcelFile() {
		m = new Manager();
		m.readGlassFile();
	}
	
	@Test
	public void testPrint(){
		
		m = new Manager();
		m.initialiseData();
		m.print();
	}

}
