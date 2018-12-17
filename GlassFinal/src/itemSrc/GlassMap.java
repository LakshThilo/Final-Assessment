package itemSrc;

import java.util.Map;
import java.util.TreeMap;


/* This GlassMap  store number of Glass objects to store all data,  TreeMap class has used to store data. 
 * TeeMap is Collection class which inherit to Map Interface it provide lots of feature such as 
 * 
 	* contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 	* contains only unique elements.
 	* cannot have a null key but can have multiple null values.
 	* and it is non synchronized.
 	*Java TreeMap maintains ascending order.
 
 * basically in this class it store two values Glass object and String Id which is unique for every single object 
 *
*/

public class GlassMap {
	
    private TreeMap <String,Glass> allGlass;

    // this is Glass constructor in constructor, TreeMap class has been initialised.
    public GlassMap()
    {
    	allGlass = new TreeMap<String,Glass>();
    }
    

 /*  this method adding data objects to the TeeMapp class
  *  In here as a unique value first it get the glass id and it combine with the unique Value;
  * 
  */
    public void addDetails(Glass details) 
    {
    	allGlass.put("X0Z"+details.getgId(), details);
    }
    
    
    /*
     * a method to check whether the map has any glass at all
     * and it return true is there are values otherwise it return false
     */
    public boolean hasGlass() {
    	
    	return allGlass.isEmpty();
    }
    
   /*
    * this method return map size thst mean how many data has been stored in map
    * 
    * */
    
    public int getNumberOfEntries()
    {
    	
    	return allGlass.size();
    }
    
    /**
     * a method to check whether all the parcels have been collected
     * @return true if all collected, false otherwise
     * Logic:
     * 1) use for each loop
     * 2) use a reference of Parcel, e.g., p to iterate trough allParcels
     * 3) if p is not collected, allGone returns false, otherwise, return true
     * Complete the method
     * 
     */
    public boolean allGone () {
    	
    	Glass g;
    	for(Map.Entry al : allGlass.entrySet()){
    	     g = new Glass();
    	  return g.isCollected();
    	}
    	//your code goes here - return appropriate value
    	
    	return false;
    }
 
   /*
    * This method return Object of StringBuffer, it contain all data stored in List
    * 
    * */
    
    public String listDetails()
    {
    	StringBuffer sb;
    	//your code goes here - return appropriate value
    	sb = new StringBuffer();
    	for(Map.Entry m :allGlass.entrySet()){
    		sb.append("Key ID= "+m.getKey()+","+"Glass Details= "+m.getValue()+"\n");
    	}
    	
    return sb.toString();
    }
    
   /*
    * a method to mark a parcel as collected
    * 
    */
    public void setCollected(Glass g){
    	g.setCollected(true);
    	
    }
    
  /*
   * This methods check whether Customer collected thire Order or not
   * 
   * */
    
    public String listUncollected()
    {
    	//your code goes here - return appropriate value
    	StringBuffer sb;
    	Glass g;
    	sb = new StringBuffer();
    	for(Map.Entry m :allGlass.entrySet()){
    		g = (Glass)m.getValue();
    		if(g.isCollected()==false){
    		sb.append(g.toString()+"\n");
    		}
    	}
    	
    return sb.toString();
    }

/*	public TreeMap<String, Glass> getAllGlass() {
		return allGlass;
	}*/
	
	/*
	 * In this method return the paticular object when provide ID
	 * 
	 * */
   
    public Glass findGlass(String id) {
    	
 		Glass g = null;
    	for(Map.Entry m:allGlass.entrySet()){
    		g = (Glass)m.getValue();
    	  if(g.getgId().equals(id)){
    		  return g;
    	  }	
    	}
    	return g;
    	
    }

}
