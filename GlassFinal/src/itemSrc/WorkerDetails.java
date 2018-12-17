package itemSrc;

public class WorkerDetails {
	
	private int wId;
	private String fname;
	private String lname;
	private int workerSpeed;
	
	public int getWorkerSpeed() {
		return workerSpeed;
	}

	public void setWorkerSpeed(int workerSpeed) {
		this.workerSpeed = workerSpeed;
	}

	public WorkerDetails(int wid,String fname,String lname,int wSpeed){
		
		this.wId = wid;
		this.fname = fname;
		this.lname = lname;
		this.workerSpeed = wSpeed;
	}
	
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
/*	public String toString(){
		
		 return "Worker wId=" + wId + ", First Name=" + fname+ ", Last Name=" + lname+
				 ", Work Speed=" + workerSpeed +"\n" ;
	}*/
	
	

}
