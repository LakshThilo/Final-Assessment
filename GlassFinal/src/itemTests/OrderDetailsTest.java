package itemTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.w3c.dom.css.CSSUnknownRule;

import itemSrc.CustInQueue;
import itemSrc.OrderDetails;

public class OrderDetailsTest {

	CustInQueue cusInQue;
	@Test
	public void testOrderDetails() {
		
		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getCusId(), "Cus01");

	}

	@Test
	public void testGetoId() {
		
		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getoId(), "Ord01");

	}

	@Test
	public void testGetName() {

		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getName(), "Andrew");		
	}

	@Test
	public void testGetQuntity() {

		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,2);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getQuntity(), 4);	}

	@Test
	public void testGetCusId() {

		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getCusId(), "Cus01");	}

	@Test
	public void testGetqNum() {
		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,3);
		cusInQue.setqNum(5);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getqNum(), 5);

	}

	@Test
	public void testIsQueue() {

		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,4);
		cusInQue.setInQueue(true);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertTrue(orderDetails.isQueue()==true);
	}

	@Test
	public void testGetTotalPrice() {

		cusInQue = new CustInQueue("Cus01","Andrew","px34","Ord01", 4,20);
		cusInQue = new CustInQueue("CRR010","Andrew","px34","Ord01", 4,20);
		OrderDetails orderDetails = new OrderDetails(cusInQue);
		assertEquals(orderDetails.getTotalPrice(), 64.0,0);
		
		CustInQueue cusInQue2 = new CustInQueue("CS1002","Andrew","px34","Ord01", 4,20);
		OrderDetails orderDetail2 = new OrderDetails(cusInQue2);
		assertEquals(orderDetail2.getTotalPrice(), 80.0,0);
	}

}
