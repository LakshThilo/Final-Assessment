package itemSrc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * This class store details about Customer who waiting on queue to take their Glass 
 * 
 * */
public class QueueOfCusts 
{
    public LinkedList<CustInQueue> getQueue() {
		return queue;
	}

	// 
    private LinkedList <CustInQueue> queue;


   /* 
    * 
      creating constructor and initialise LinkedList Class 
     */
    public QueueOfCusts()
    {
    	queue = new LinkedList<CustInQueue>();
    }
    

    /**
     * Add a new set of details to the list
     * Complete this method
     * 
     */
    public  void addDetails(CustInQueue details) 
    {
    	queue.add(details);
	
    }


   /*
    * return how many Entities are in list,
    * 
    * */
    public int getNumberOfEntries()
    {
    	return queue.size();
    }
    
    

 
    
    
    
     /*
      * In this method it return how many customers waiting in queue for their Orders
      * 
      * */
    
    public  int getNumQueueing () {
    	int count =0;
    	Iterator itr = queue.iterator();
    	while(itr.hasNext()){
    		CustInQueue cus = (CustInQueue) itr.next();
    		if(cus.isInQueue()==true){
    			count++;
    		}
    	}
    	return count;
    }
   
 /*   
  * this methods is use for getting particular location inList
  * */
    public CustInQueue get(int i) {
    	
    	return queue.get(i);
    	
    }
    
   /*
    * In this method get the first value of the List and then it will remove that value then 
   cursor point to next value in the List and return that value
   */
    
    public  CustInQueue getFirst() {
    	CustInQueue cus = null;
    	cus = queue.getFirst();
    	
    	return cus;
    }
    
    public  CustInQueue getNext() {
    	CustInQueue cus = null;
    	cus = queue.getFirst();
    	queue.removeFirst();
    	cus = queue.getFirst();
    	
    	return cus;
    }
    
    
     
  /*  
     * this method take all values in List and store in StringBuffer object and checked whether 
     * it in queue or not, if it is in queue it will store in buffer object 
     * after that it will return all string value in StringBuffer object   
     * */
     
    public String getQueueString() {
    	//to remove
    	StringBuffer sb = new StringBuffer();
		for (CustInQueue cq : queue) {
			if (cq.isInQueue()) {
				sb.append(cq.toString() + "\n");
			}
		}	
		return sb.toString();
    }
    
    /*
     * this method adds a new item to the list/queue
     * The logic to complete it is as follows:
     * 1) for custinqueue object cq, iterate through the queue/list (use for each loop)
     * 2) if cq is uniqueue, add it to the queue by using setInqueue function of 
     * CustIinque class
     * Write unit tests for this method
     * */
     
    public  void  addToQueue() {
    	
    	for (CustInQueue cq : queue) {
			if (!cq.isInQueue()) {
				cq.setInQueue(true);
				break;
			}
		}	
    }
    
}
