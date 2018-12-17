package itemTests;

import static org.junit.Assert.*;

import org.junit.*;

import itemSrc.*;


public class WorkerTest {

	Worker wareHouseWorker;
/**
 * This tests the Worker constructor
 * You are to implement this constructor
 */
	@Test
	public void testWorker() {
		QueueOfCusts qOfCusts = new QueueOfCusts();
		assertTrue(qOfCusts.getNumQueueing()==0);
		CustInQueue cin = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,4);
		CustInQueue cin2 = new CustInQueue("Cus02","Ndrew","py33","Ord02", 5,3);
		CustInQueue cin3 = new CustInQueue("Cus02","Janice","py33","Ord02", 5,2);
		
		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin3);
		qOfCusts.addToQueue();
		
		GlassMap glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		Glass g2 = new Glass("XY020", "Blue", 8, 3, 5,1);
		glassList.addDetails(g);
		glassList.addDetails(g2);
		wareHouseWorker = new Worker( qOfCusts, glassList, 5, 4);
		
		assertTrue(wareHouseWorker.getNum()==4);
		assertEquals(wareHouseWorker.getNext().getName(), "Ndrew");
		//wareHouseWorker.setClosed();
		assertEquals(wareHouseWorker.getNext().getName(), "Janice");  
	}
/*
 * This tests whether the current customer can be obtained
 * You are to implement this method
 */
	@Test
	public void testGetCurrentCust() {
		QueueOfCusts qOfCusts = new QueueOfCusts();
		assertTrue(qOfCusts.getNumQueueing()==0);
		CustInQueue cin = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		CustInQueue cin2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,5);
		
		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();
		
		GlassMap glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		Glass g2 = new Glass("XY020", "Blue", 8, 3, 5,1);
		glassList.addDetails(g);
		glassList.addDetails(g2);
		
		wareHouseWorker = new Worker( qOfCusts, glassList, 5, 4);
		assertEquals(qOfCusts.getFirst(),cin);                          
		wareHouseWorker.setClosed();
		assertEquals(qOfCusts.getFirst(),cin2);
	}

/**
 * This has already been tested with the constructor
 * Implementation is provided
 */
	@Test
	public void testGetFinished() {
		
         QueueOfCusts qOfCusts = new QueueOfCusts();
		
		CustInQueue cin = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,5);
		CustInQueue cin2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,4);
		
		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();
		
		GlassMap glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		Glass g2 = new Glass("XY020", "Blue", 8, 3, 5,1);
		glassList.addDetails(g);
		glassList.addDetails(g2);
		
		wareHouseWorker = new Worker( qOfCusts, glassList, 5, 4);
		assertEquals(qOfCusts.getFirst(),cin); 
		assertTrue(wareHouseWorker.getFinished()==true);
		wareHouseWorker.setClosed();
		assertFalse(wareHouseWorker.getFinished()==true);
		
	}
/**
 * This tests whether a worker has closed processing a customer's job
 * Provide an implementation of this method
 */
	@Test
	public void testGetClosed() {
		
		QueueOfCusts qOfCusts = new QueueOfCusts();
		
		CustInQueue cin = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,5);
		CustInQueue cin2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,4);
		
		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();
		
		GlassMap glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		Glass g2 = new Glass("XY020", "Blue", 8, 3, 5,1);
		glassList.addDetails(g);
		glassList.addDetails(g2);
		
		wareHouseWorker = new Worker( qOfCusts, glassList, 5, 4);
		assertEquals(qOfCusts.getFirst(),cin); 
		assertTrue(wareHouseWorker.getClosed()==true);
		wareHouseWorker.setClosed();
		assertFalse(wareHouseWorker.getClosed()==true);
		assertTrue(wareHouseWorker.getClosed()==false);
	}
	
/**
 * this has been tested alongside the getClosed method
 * Provide an implementation for this method
 */
	@Test
	public void testSetClosed() {
	QueueOfCusts qOfCusts = new QueueOfCusts();
		
		CustInQueue cin = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,4);
		CustInQueue cin2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,7);
		
		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();
		
		GlassMap glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		Glass g2 = new Glass("XY020", "Blue", 8, 3, 5,1);
		glassList.addDetails(g);
		glassList.addDetails(g2);
		
		wareHouseWorker = new Worker( qOfCusts, glassList, 5, 4);
		assertEquals(qOfCusts.getFirst(),cin); 
		assertTrue(wareHouseWorker.getClosed()==true);
		wareHouseWorker.setClosed();
		assertFalse(wareHouseWorker.getClosed()==true);
		assertTrue(wareHouseWorker.getClosed()==false);
		
		
		
	}

/**
 * You're provided with a working implementation of this method
 * Write the tests for it
 * 
 */
	@Test
	public void testProcessOneCustomer() {
        QueueOfCusts qOfCusts = new QueueOfCusts();
		
		CustInQueue cin = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,6);
		CustInQueue cin2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,8);
		
		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();
		
		GlassMap glassList = new GlassMap();
		Glass g = new Glass("XY001", "Red", 5, 4, 3,1);
		
		Glass g2 = new Glass("XY020", "Blue", 8, 3, 5,1);
		glassList.addDetails(g);
		glassList.addDetails(g2);
		
		wareHouseWorker = new Worker( qOfCusts, glassList, 5, 4);
		wareHouseWorker.processOneCustomer();
		assertFalse(wareHouseWorker.getClosed()==false);
		
		
		
		
	}

}
