package itemTests;

import static org.junit.Assert.*;

import org.junit.Test;

import itemSrc.WorkerDetails;

public class WorkerDetailsTest {

	@Test
	public void testWorkerDetails() {
		
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		assertEquals(wd.getwId(), 123);
		assertEquals(wd.getFname(),"mathw");
		assertEquals(wd.getLname(), "Chalet");
		assertEquals(wd.getWorkerSpeed(), 5);

		
	}

	
	@Test
	public void testGetWorkerSpeed() {
		//int wid,String fname,String lname,int wSpeed
		
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		assertEquals(wd.getWorkerSpeed(), 5);

	}

	@Test
	public void testSetWorkerSpeed() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		assertEquals(wd.getWorkerSpeed(), 5);
	}


	@Test
	public void testGetwId() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		assertEquals(wd.getwId(), 123);
	}

	@Test
	public void testSetwId() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		wd.setwId(124);
		assertEquals(wd.getwId(), 124);
	}

	@Test
	public void testGetFname() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		
		assertEquals(wd.getFname(), "mathw");
	}

	@Test
	public void testSetFname() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		wd.setFname("matin");
		assertEquals(wd.getFname(), "matin");
	}

	@Test
	public void testGetLname() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		
		assertEquals(wd.getLname(), "Chalet");
	}
	@Test
	public void testSetLname() {
		WorkerDetails wd = new WorkerDetails(123,"mathw","Chalet",5);
		wd.setLname("matin");
		assertEquals(wd.getLname(), "matin");
	}

}
