package itemSrc;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager
{
	
	/*
	 * In this class Initialised all relevat objects
	 * 
	*/
	
	private QueueOfCusts custQ;
    private GlassMap allGlass;
   
   /*
    * in  constructor initialised objects of QueueOfCusts and GlassMap 
    */
    public Manager()
    {
    	custQ = new  QueueOfCusts();
    	allGlass = new GlassMap();
    }
    
    public static void main(String[] args) {
    	
		Manager m = new Manager();
		
		m.initialiseData();
		m.InitialiseWorkers();
		m.getTotalPriceforParicularCun();
		//m.print();
	}
    
    

/*
 * This method used for read Customer Details from "cust.txt" and to read Glass(Items) Details from "glass.txt" 
 * also, initialise a number of customers to be in the queue, in here 10 customers 
 * perform a simple println of all parcel details, and queueing customers details
 * 
 */
    public void initialiseData() {
    	
    	
    		StringBuffer sb;
    	
            readCustDetailFile();
            readGlassFile();
            
/////////////////////////////////////////////////////////////////// All Customer Before putting Queue  /////////////////////////
           // System.out.println("Before Setting values to True" ); 
            for(int i=0; i < custQ.getNumberOfEntries(); i++){
                //System.out.println(custQ.get(i));
              } 
            
///////////////////////////////////////////////////////////put 10 customers in the queue  ////////////////////////////
        	for (int i = 0; i < 10; i++ ) {
        		CustInQueue c = custQ.get(i);
        		c.setInQueue(true);
        	}
        	
//////////////////////////////////////////////////////////// Customer after putting Queue /////////////////////////// 
        	
        	/*System.out.println("AFter setting values to True");
        	  for(int i=0; i < custQ.getNumberOfEntries(); i++){
              System.out.println(custQ.get(i));
               
        	  }*/ 
        	
 ///////////////////////////////////////////////////   Get number of CUSTOMERS WHO WAITING IN QUEUE////////////////
        	
        	//System.out.println(custQ.getNumberOfEntries());
        	  
 
 ///////////////////////////////////////////////////////////  Print the all Glass details//////////////////////////
        	  
        	  //System.out.println(allGlass.listDetails());
        	  //System.out.println(allGlass);

          	
        	
///////////////////////// ////////////////////////////////////////// Print the all customers details/////////////////////
        	  
        	  	//System.out.println(custQ.getNumQueueing());
        	  	//System.out.println(custQ.getQueueString());
        	
/////////////////////When u pass Specific Glass Id to findMethod it will return particular Object///////////////////// 	
        	//System.out.println(allGlass.findGlass("X004"));
        	
 
    } 
    
    
    public void InitialiseWorkers(){
    	
    		WorkerDetails wd1 = new WorkerDetails(112, "Michel", "Mathaw", 10); 
    		WorkerDetails wd2 = new WorkerDetails(113, "Susen", "Jhonson", 15); 
    		WorkerDetails wd3 = new WorkerDetails(114, "Kala", "Paul", 20); 
    		WorkerDetails wd4 = new WorkerDetails(115, "Ceneon", "Erik", 10); 
   	 
    		ListOfWorkers listWorkers = new ListOfWorkers();
    		listWorkers.addWorkers(wd1);
   	 		listWorkers.addWorkers(wd2);
   	 		listWorkers.addWorkers(wd3);
   	 		listWorkers.addWorkers(wd4);
   	 		
   	 		//System.out.println(listWorkers.getWorkers().size());
   	 		
/*
 * Initialising a Worker object for worker speed and number of worker coming from different ListOfWorkers Class 
 * which contain List of Workers 
 *  */ 	 		
   	 		Worker w1 = new Worker(custQ,allGlass,wd1.getWorkerSpeed(),listWorkers.getNumWorkers());
   	 
   	 		
 ///////////// Check processOneCustomer() ////////////////////////////// 
   	 		w1.processOneCustomer();
   	 		
   	 		
 /////////////Print Current Customer and Next Customer in Queue (UNCOMMENT AND CHECK)///////////////////  	
   	 		
   	 		//System.out.println(w1.getCurrentCust());
   	 		//System.out.println(w1.getNext());
   	 		
    	
    }
    
    
   /* this method for do the all calculation for each customer 
    first it take specific customer which we provide and when it check whether 
    the customer Regular or not when return the total amount
    */
    
    
    public void getTotalPriceforParicularCun(){
    	
    		CustInQueue c = custQ.get(9);
    		CustInQueue c1 = custQ.get(10);
    		CustInQueue c2 = custQ.get(1);
    		CustInQueue c3 = custQ.get(2);
    		
    		
      	 
	 		
	 		OrderDetails or = new OrderDetails(c);
	 		System.out.println(or.getTotalPrice());
	 		OrderDetails or1 = new OrderDetails(c1);
	 		System.out.println(or1.getTotalPrice());
	 		
	 		System.out.println("");
	 		OrderDetails or2 = new OrderDetails(c2);
	 		System.out.println(or2.getTotalPrice());
	 		OrderDetails or3 = new OrderDetails(c3);
	 		System.out.println(or3.getTotalPrice());
	 	
	
    	
    }
   
/*
 * a method to read "custDetails.csv" file.
 * use an object of Scanner to read the file
 * You will need to use the split method of String class to read input appropriately
 * catch appropriate exceptions
 */

/////////////////////////////////////////////////////////////////////////////////////////////////
    public void readCustDetailFile() {
    	try {
    		Scanner scanner = new Scanner (new File("CusDetail.csv"));
    		//System.out.println("Scanning");
        	while(scanner.hasNext()){  
            	String inputLine = scanner.nextLine();
            	//System.out.println(inputLine);
            	processCustDetailLine(inputLine);

        	}
    	}
    	catch (Exception e) {
    		
    	}
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    private void processCustDetailLine (String inputLine) {
    	//to remove
    	    	
    			try {
    				String parts [] = inputLine.split(",");
    				
    				String cusId = parts[0].trim();
    				//Getting Customer name from file "cusDetail.csv"
    				String name =  parts[1].trim();
    				
    				//get the Glass id 
    				String gid = parts[2].trim();
    				
    				// get the number of queue
    				String orderId = parts[3].trim();
    				//int orderId = Integer.parseInt(value);
    				
    				String qunVal = parts[4].trim();
    				int quntity = Integer.parseInt(qunVal);
    				
    				String itmPrice = parts[5].trim();
    				double itemPrice = Double.parseDouble(qunVal);
    				
    				// Creating CustInQueue object and adding to the custQlist 
    				CustInQueue c = new CustInQueue (cusId,name, gid, orderId,quntity,itemPrice);
    	    		//add to list
    				custQ.addDetails(c);
    				
    	            
    	            
    			}

    				
    				//this catches trying to convert a String to an integer
    				catch (NumberFormatException nfe) {
    					String error = "Number conversion error in '"
    		                   + inputLine + "'  - " + nfe.getMessage();
    					System.out.println(error);
    				}
    				//this catches missing items if only one or two items
    				//other omissions will result in other errors
    				catch (ArrayIndexOutOfBoundsException air) {
    					String error = "Not enough items in  : '" + inputLine
    					            + "' index position : " + air.getMessage();
    					System.out.println(error);
    				}
    			}
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void readGlassFile() {
    	try {
    		Scanner scanner = new Scanner (new File("Glass.csv"));
    		//System.out.println("Scanning");
        	while(scanner.hasNext()){  
            	String inputLine = scanner.nextLine();
            	//System.out.println(inputLine);
        		processGlassLine(inputLine);

        	}
    	}
    	catch (Exception e) {
    		
    	}
    }
    /**
     * similar to processcustline
     * simply, breakdown file content into appropriate data 
     * items using String's split() method 
     * once you obtain all parcel details, create a parcel object, and add 
     * it to allParcels collection     */
    
    private void processGlassLine (String inputLine) {

				 
    	try {
			String parts [] = inputLine.split(",");
			
			//getting glass Id from file
			String id = parts[0].trim();
			
			////getting glass colour from file
			String colour = parts[1].trim();
			
		    ////getting glass price from file
			String vlauePrice = parts[2].trim();
			double price = Integer.parseInt(vlauePrice);
			
			////getting waiting days from file
			String vlaDays = parts[3].trim();
			int days = Integer.parseInt(vlaDays);
			
		////getting glass height from file
			String vlaheight = parts[4].trim();
			double height = Integer.parseInt(vlaheight);
			
			//getting glass perimeter from file
			String vlaPerimeter = parts[5].trim();
			int perimeter = Integer.parseInt(vlaPerimeter);
			
			//create Glass object and add to the list
			//String id,String name,double price,int days,double height,double perimeter
			Glass g = new Glass (id, colour, price,days,height, perimeter);
			
			//adding to the list
            allGlass.addDetails(g);
		}

			
			//this catches trying to convert a String to an integer
			catch (NumberFormatException nfe) {
				String error = "Number conversion error in '"
	                   + inputLine + "'  - " + nfe.getMessage();
				System.out.println(error);
			}
			//this catches missing items if only one or two items
			//other omissions will result in other errors
			catch (ArrayIndexOutOfBoundsException air) {
				String error = "Not enough items in  : '" + inputLine
				            + "' index position : " + air.getMessage();
				System.out.println(error);
			}
		}
///////////////////////////////////////////////////////////////////////////// /////End////////////////////////////
    	    
    
   
 /*   	 this code snippet can be used if you want to print a log to file.
    	 * The Log class is already available for your use.
    	 * 
    		System.out.println("Writing log file");
        	try {
        		File f = new File("Log.txt");
        		FileWriter fw = new FileWriter(f);
        		Log log = Log.getInstance();
        		fw.write(log.toString());
        		fw.close();
        	}
        	catch (IOException e){
        		e.printStackTrace();
        	}
        	System.exit(0);
    	}	
    	
    }*/
    
    
    /**
     * Print to text file
     * @throws IOException */

    public void print()  {
    	FileWriter fw = null;
    	try {
        	fw = new FileWriter("AllItemDetails.txt");
        	LinkedList<CustInQueue> cusList = custQ.getQueue();
        	//System.out.println(cusList);
        	for(CustInQueue c : cusList){
			//System.out.print(c);
			//System.out.println("");
			fw.write("Order Id= "+c.getOrderId()+",\t"+" Customer ID= "+c.getCusId()+", \t"+" Customer Name= "+c.getName()+
					", \t\t"+" Item Id= "+c.getgId()+",\t "+" Number Items= "+c.getQuntity()+",\t "+" Customer is in Queue= "+c.isInQueue()+"\n");
        	}
        	fw.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println(e.getMessage());
    		System.exit(1);
    	}
    	
    	catch (IOException ioe){
    		System.exit(1);
    	}
    	

    }
    
          
}

