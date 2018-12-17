package itemTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import itemSrc.ListOfWorkers;
import itemSrc.WorkerDetails;

public class ListOfWorkersTest {

	ListOfWorkers list;
	@Test
	public void testListOfWorkers() {
		
		//public WorkerDetails(int wid,String fname,String lname,int wSpeed)
		list = new ListOfWorkers();
		WorkerDetails	w1 = new WorkerDetails(123,"Sham","Boult",4);
		WorkerDetails	w2 = new WorkerDetails(123,"Sham","Boult",4);
		list.addWorkers(w1);
		list.addWorkers(w2);
		assertTrue(list.getNumWorkers()==2);
	
	}

	@Test
	public void testAddWorkers() {
		list = new ListOfWorkers();
		WorkerDetails	w1 = new WorkerDetails(123,"Sham","Boult",4);
		WorkerDetails	w2 = new WorkerDetails(123,"Sham","Boult",4);
		list.addWorkers(w1);
		assertTrue(list.getNumWorkers()==1);
		list.addWorkers(w2);
		assertTrue(list.getNumWorkers()==2);
		
	}

	@Test
	public void testGetWorkers() {
		list = new ListOfWorkers();
		WorkerDetails	w1 = new WorkerDetails(123,"Sham","Boult",4);
		WorkerDetails	w2 = new WorkerDetails(123,"Sham","Boult",4);
		list.addWorkers(w1);
		assertTrue(list.getNumWorkers()==1);
		list.addWorkers(w2);
		assertTrue(list.getNumWorkers()==2);
		assertArrayEquals(list.getWorkers(), list);
	}


	

	private void assertArrayEquals(ArrayList<WorkerDetails> workers, ListOfWorkers list2) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testGetNumWorkers() {
	}

}
