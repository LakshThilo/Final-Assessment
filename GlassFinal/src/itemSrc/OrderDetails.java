package itemSrc;


/*
 * This class hold the all details aboubt particular order
 * 
 */
public class OrderDetails {

	private String oId;
	private CustInQueue cusInQue;
	private double totalPrice;
	private String checked;
	private String cusType;

	public OrderDetails(CustInQueue custs) {

		this.cusInQue = custs;
		
	}
	
/*	
 * This method do the all calulation for each customer
 * */
	public double getTotalPrice() {

		double total = 0;
		String cusType = cusInQue.getCusId();
		if (cusInQue.getCusId().equals("CRR010") ||cusInQue.getCusId().equals("CRR011")) {
			total = cusInQue.getQuntity() * cusInQue.getItemPrice();
			total = total * 0.8;
			System.out.println("Customer Id="+cusInQue.getCusId()+"...Your are a Regular Customer..and You Got Discount");
			return total;
		
		} else {
			
			total = cusInQue.getQuntity() * cusInQue.getItemPrice();
			System.out.println("Customer Id="+cusInQue.getCusId()+"...Not a Regular Customer..");
			
			return total;
		}
	}
	
	public String getoId() {

		return cusInQue.getOrderId();
	}

	public String getName() {

		return cusInQue.getName();
	}

	public int getQuntity() {

		return cusInQue.getQuntity();
	}

	public String getCusId() {

		return cusInQue.getCusId();
	}

	public int getqNum() {

		return cusInQue.getqNum();
	}

	public boolean isQueue() {

		return cusInQue.isInQueue();
	}

}
