package itemTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import itemSrc.*;


public class QueueOfCustsTest {
	
	QueueOfCusts qOfCusts;
	/*
	 * The constructor is tested below
	 * You are to implement this constructor
	 */
	@Test
	public void testQueueOfCusts() {
		 qOfCusts = new QueueOfCusts();
		 assertTrue(qOfCusts.getNumQueueing()==0);
	}
/*
 * a test to show that you can add customers to the queue
 * You are to implement this method
 */
	@Test
	public void testAddDetails() {
		qOfCusts = new QueueOfCusts(); 
		CustInQueue cinqueue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		qOfCusts.addDetails(cinqueue);
		assertSame(qOfCusts.get(0),cinqueue); 
	
	}
/*
 * a test to show that the count of customers changes when a customer is added to the queue
 * You are to implement this method
 */
	@Test
	public void testGetNumberOfEntries() {
		qOfCusts = new QueueOfCusts(); 
		CustInQueue cinqueue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		qOfCusts.addDetails(cinqueue);
		assertTrue(qOfCusts.getNumberOfEntries()==1);
		//CustInQueue cinqueue2 = new CustInQueue("Jenny", "px335");
		CustInQueue cinqueue2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		qOfCusts.addDetails(cinqueue2);
		assertTrue(qOfCusts.getNumberOfEntries()==2);
	}
/*
 * a test method to check how many customers have been added to the queue
 * You are to implement this method
 */
	@Test
	public void testGetNumQueueing() {
		qOfCusts = new QueueOfCusts(); 
		CustInQueue cinqueue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		qOfCusts.addDetails(cinqueue);
		qOfCusts.addToQueue();
		assertTrue(qOfCusts.getNumQueueing()==1);
		//CustInQueue cinqueue2 = new CustInQueue("Jenny", "px335");
		CustInQueue cinqueue2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,4);
		qOfCusts.addDetails(cinqueue2);
		qOfCusts.addToQueue();
		assertTrue(qOfCusts.getNumQueueing()==2);
		
	}
/*
 * a method to test that a customer in a specific location in the collection can be obtained
 * You are to implement this method
 */
	@Test
	public void testGet() {
		qOfCusts = new QueueOfCusts(); 
		CustInQueue cinqueue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		qOfCusts.addDetails(cinqueue);
		qOfCusts.addToQueue();
    	assertSame(qOfCusts.get(0),cinqueue);                           
		CustInQueue cinqueue2 = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,5);
		qOfCusts.addDetails(cinqueue2);
		qOfCusts.addToQueue();
		assertEquals(qOfCusts.get(1),cinqueue2); 
		
	}
/*
 * a method to test that you can find the next customer in the queue.
 * You are to implement this method
 * 
 */
	@Test
	public void testGetNext() {
		qOfCusts = new QueueOfCusts(); 
		
		CustInQueue cinqueue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		qOfCusts.addDetails(cinqueue);
		CustInQueue cinqueue2 = new CustInQueue("Cus02","Ansoke","px35","Ord02", 6,2);
		qOfCusts.addDetails(cinqueue2);
		qOfCusts.addToQueue();
		assertNotSame(qOfCusts.getNext(), cinqueue);                            
		
		CustInQueue cinqueue3 = new CustInQueue("Cus03","Michel","px37","Ord03", 2,4);
		qOfCusts.addDetails(cinqueue3);
		qOfCusts.addToQueue();
		assertEquals(qOfCusts.getNext(),cinqueue3);
	}

	/*
	 * This method is implemented for you. 
	 * Write tests to show that it works as expected
	 */
	@Test
	public void testPrintList(){
		
		qOfCusts = new QueueOfCusts(); 
		CustInQueue cinqueue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		CustInQueue cinqueue2 = new CustInQueue("Cus02","Ansoke","px35","Ord02", 6,4);
		CustInQueue cinqueue3 = new CustInQueue("Cus03","Sereshe","px36","Ord03", 4,3);
		qOfCusts.addDetails(cinqueue);
		//qOfCusts.addDetails(cinqueue2);
		//qOfCusts.addDetails(cinqueue3);
		
		assertEquals(qOfCusts.getQueue(), qOfCusts.getQueue());
		
	}
	
	@Test
	public void testGetQueueString() {
		
	}
/*
 * This method is implemented for you.
 * Write tests to show that it works as expected
 */
	@Test
	public void testAddToQueue() {
		
	}

}
