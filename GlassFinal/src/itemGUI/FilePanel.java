package itemGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FilePanel extends JPanel {
	
	private JButton getList;
	private JButton setList;
	private TextPanel panel;
	
	
	public FilePanel(){
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getList = new JButton("Get Customers");
		setList = new JButton("Set Customers");
		
		getList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
		    		Scanner scanner = new Scanner (new File("CusDetail.csv"));
		    		//System.out.println("Scanning");
		        	while(scanner.hasNext()){  
		            	String inputLine = scanner.nextLine();
		            	//System.out.println(inputLine);
		            	panel.appendText(inputLine);
		            	
		        	}
		    	}
		    	catch (Exception e1) {
		    		
		    	}
				
			}
		});
		
		add(getList);
		add(setList);
	}

}
