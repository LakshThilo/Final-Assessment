package itemGUI;

public class CustomerTemp {
	
	private String cusId ;
	private String cusNamae;
	private String orderId;
	private String glassId;
	private double price ;
	private int quntity;
	
	
	
	public CustomerTemp(String cusId,String cusName,String orderId,String glassId,double price,int quntity){
		
		this.cusId = cusId;
		this.cusNamae = cusName;
		this.orderId = orderId;
		this.glassId = glassId;
		this.price = price;
		this.quntity = quntity;
		
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusNamae() {
		return cusNamae;
	}

	public void setCusNamae(String cusNamae) {
		this.cusNamae = cusNamae;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getGlassId() {
		return glassId;
	}

	public void setGlassId(String glassId) {
		this.glassId = glassId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}

}
