package itemSrc;


/*This is the class for store data about Glass
 * it store glass Id,
 * glass colour
 * glass price 
 * and how many days it take to make glass
 * glass height and perimeter.
*/

public class Glass implements Comparable<Glass>{
	
	private String gid;
	private String colour;
	private double price;
	private int days;
	private double height;
	private double perimeter;
	private boolean collected = false;
	
	// this is GLss default constructor
	public Glass(){
		
	}

	//this is parameterised constructor which take all arguments and assign to specific values.
	public Glass(String id,String colour,double price,int days,double height,double perimeter){
		
		this.gid = id;
		this.colour = colour;
		this.price = price;
		this.days = days;
		this.height = height;
		this.perimeter = perimeter;
		
	}
	
	// return the glass ID
	public String getgId() {
		return gid;
	}
	
	//setting the Glass id
	public void setId(String id) {
		this.gid = id;
	}
	public void setColour(String colour){
		this.colour = colour;;
	}
	
	// return the glass ID
	public String getColour() {
		return colour;
	}
	
	// return the glass Price
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// return the glass days to which it will take to make it 
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	// return the glass height
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// return the glass perimeter
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	// checked and return whether glass is collected or not 
	public boolean isCollected() {
		
		if(collected == true)
			return true;
		else
			return false;
	}
	
	/////
	public void setCollected(boolean collected) {
		
		this.collected = collected;
	}
	
	/////
	
    public boolean equals(Object other)
	    {
	       //to remove
	    	if(other instanceof Glass) {
	            Glass otherItem = (Glass) other;
	            return gid.equals(otherItem.getgId());
	        }
	        else {
	            return false;
	        }
	    }
	
	@Override
	public int compareTo(Glass glass)
	{
		return gid.compareTo(glass.getgId());		
	}
	
	@Override
	public String toString() {
		//to remove
		return "Glass [id=" + gid + ", colour=" + colour+ ", Price=" + price
				+ ", Days=" + days + ", Height=" + height + ", Perimeter="
				+ perimeter + ", collected=" + collected + "]";
	}
	
	

}
