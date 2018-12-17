package itemSrc;

import java.util.ArrayList;

public class ListOfWorkers {
	
	private ArrayList<WorkerDetails> workers;
	
	
	public ListOfWorkers(){
		
		workers = new ArrayList<WorkerDetails>();
	}

	public void addWorkers(WorkerDetails wd){
		workers.add(wd);
	}

	public ArrayList<WorkerDetails> getWorkers() {
		
		return workers;
	}
	
	public int getNumWorkers(){
		
		return workers.size();
	}


	
	
}
