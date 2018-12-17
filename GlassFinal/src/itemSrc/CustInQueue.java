package itemSrc;

/**
 * This class maintains a queue of parcels for customers
 * @author John Kanyaru
 *
 */
public class CustInQueue 
{
	/**
	 * the meaning of instance fields is:
	 * name - parcel name e.g., markerpen
	 * pId - parcel id
	 * qNum - number in the queue of the parcel
	 * inQueue - whether the parcel is currently in the queue or not
	 * sequence - a way to initialise the counting of parcels in the queue
	 */
	private static int sequence = 0;
	private String name;
	private String gId;
	private int qNum;
	private boolean inQueue = false;
	private int quntity;
	private String orderId;
	private String cusId;
	private double itemPrice;
	

	/**
	 * This parameterised constructor requires two arguments
	 * An instance of the class is created, the sequence field is a class field, incremented
	 * then used to generate the queue number for the parcel
	 * Complete the constructor in the manner described above.
	 * You're to perform unit tests for this constructor
	 * 
	 * @param name
	 * @param pId
	 */


	
    public CustInQueue(String cuId,String name, String gId,String orderId,int quntity,double iPrice) {
    	
    	this.cusId = cuId;
    	this.name = name;
    	this.gId = gId;
    	this.orderId = orderId;
    	this.quntity = quntity; 
    	this.itemPrice = iPrice;
    	sequence ++;
		
	}

	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
    

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getgId() {
		return gId;
	}
	
	public void setgId(String gId) {
		this.gId = gId;
	}

	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public int getqNum() {
		return qNum;
	}
	
	public void setqNum(int qNum) {
		this.qNum = qNum;
	}
	

	public boolean isInQueue() {
		if(inQueue==true)
		return true;
		else
			return false;
	}

	public void setInQueue(boolean inQueue) {
		this.inQueue = inQueue;
	}
/**
 * you are to override the toString method to return the details of 
 * customer in queue  - with an informative message
 * e.g., Customer in queue is [name is:, pId is:,qNum is:]  
 * 
 * Customise this for the class provided to you
 */
    
}
