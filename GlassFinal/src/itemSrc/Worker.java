package itemSrc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *  a Worker is responsible for processing orders in the warehouse
 * @author John Kanyaru
 *
 */

public class Worker   {
	/*
	 * the instance fields of a worker.
	 * allCusts - the customers that are in  a queue being processed.
	 * allGlasses - a collection of the glasses (or items) that comprise the order. 
	 * speed - an indication of how fast a customer enters and exits the queue.
	 * numWorker - the number of current worker 
	 * currentCust - the customer currently being processed
	 * 
	 */
	private QueueOfCusts allWaitingCusts;
	private GlassMap allGlass;
	private int speed;
	private int numWorker;
	private CustInQueue currentCust;
	private boolean processing = true;
	private boolean finished = false;
	
	
	
	
    public Worker( QueueOfCusts allCusInQue, GlassMap allglass, int speed,int numWorker)
	{
    	
    	this.allWaitingCusts  = allCusInQue;
    	this.allGlass = allglass;
    	this.speed = speed;
    	this.numWorker = numWorker;
    	
    	setCurrentCus(allCusInQue.getFirst());
	}
    
    public void setCurrentCus(CustInQueue c){
    	
    	this.currentCust = c;
    }
    
	
    public CustInQueue getCurrentCust() {
    	
    	return currentCust;
    	
      
    }
    
 
    /**
     * 
     * @return the number of current worker
     * you don't have to change this
     */
    
    public int getNum() {
    	 return numWorker;
    }
	/**
	 * 
	 * @return true or false depending on whether parcel/order is processed or not
	 */
	public boolean getClosed() {

		if(processing==true){
			
		return true;
		}else 
			
		return false;
	}
	
	/**
	 * close the processing of a parcel
	 */
	public CustInQueue setClosed() {
		int i = 1;
		CustInQueue c;
   	 	c= allWaitingCusts.getFirst();
   	 	
   	 	if(c.isInQueue()==true){
   		c.setqNum(i++);
   		
   		processing = false;
   		//allWaitingCusts.getNext();
   		System.out.println(c.getqNum());
   		return allWaitingCusts.getNext();
   	 	}
   	 	return null;
	}
	
	public boolean getFinished() { 
		
		if(processing == false){
		return finished;
		}
		return processing;
	}
    /**
     * 
     * @return the next customer in the Queue.
     * add the next customer in the queue to a log
     * 
     */
	public  CustInQueue getNext() {
		
		CustInQueue c = allWaitingCusts.getNext();

		Log log = Log.getInstance();
		if (c!= null){
			log.addEntry("W" + numWorker + " :C" + c.getqNum());
			
		}
		return c;
	}
	
	/**
	 * this method is for processing one customer's order
	 * the logic should be as follows:
	 * 1) obtain the current customer using the private method getNext() above.
	 * 2) check that currentcustomer's value is not null
	 * 3) obtain the current customers parcel id (pid), it is a string
	 * 4) declare a Parcel object, obtain it from the collection of parcels that has the same pid
	 * as 4 above
	 * 5) set the the parcel as collected
	 * 6) Do a simple println(pid + the parcel).
	 * 7) check this - if all parcels are processed (allGone()),
	 *  then finished is true, else false.
	 *  8) Obtain an instance of the Log and write add entries for finished parcels, 
	 *  with some useful info e.g., parcel, pid, and something else.
	 *  
	 *  YOU ARE TO PERFORM UNIT TESTS FOR THIS METHOD
	 */
	public  void processOneCustomer() {
		
		currentCust = this.getNext() ;
		
			if (currentCust != null) {
				
			String gid = currentCust.getgId();
			Glass g = allGlass.findGlass(gid);
			allGlass.setCollected(g);
			System.out.println ("Glass Id= "+gid +", "+ g);
		    if (allGlass.allGone() ) {
				finished = true;
			}
		
		}
		else   
		{
			finished = true;
		}
			
	}

}
