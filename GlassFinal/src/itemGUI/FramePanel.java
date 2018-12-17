package itemGUI;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FramePanel extends JPanel{
		
		private JLabel cusIdlbl;
		private JTextField cusIdtxt;
		private JLabel cusNamelbl;
		private JTextField cusNametxt;
		private JLabel gIdlbl;
		private JTextField gIdtxt;
		private JLabel ordIdlbl;
		private JTextField ordIdtxt;
		private JLabel quntitylbl;
		private JTextField quntitytxt;
		private JLabel pricelbl;
		private JTextField pricetxt;
		private JButton submitbtn;
		
		private TextPanel panel;
		//private GUIClass guiClass;
		
		
		public FramePanel(){
			
	        Dimension dim = getPreferredSize();	
	        dim.width = 600;
	        
	        Border inner = BorderFactory.createTitledBorder("Add Customer");
	        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
	        setBorder(BorderFactory.createCompoundBorder(outer,inner));
	        
	      
			
			cusIdlbl = new JLabel("Id Number");
			cusIdtxt = new JTextField(10);
			cusIdtxt.setBackground(Color.LIGHT_GRAY);
			cusNamelbl = new JLabel("First Name");
			cusNametxt = new JTextField(10);
			cusNametxt.setBackground(Color.LIGHT_GRAY);
			gIdlbl = new JLabel("Glass Id");
			gIdtxt = new JTextField(10);
			gIdtxt.setBackground(Color.LIGHT_GRAY);
			ordIdlbl = new JLabel("Order Id");
			ordIdtxt = new JTextField(10);
			ordIdtxt.setBackground(Color.LIGHT_GRAY);
			quntitylbl = new JLabel("Items");
			quntitytxt = new JTextField(10);
			quntitytxt.setBackground(Color.LIGHT_GRAY);
			pricelbl = new JLabel("Item Price");
			pricetxt = new JTextField(10);
			pricetxt.setBackground(Color.LIGHT_GRAY);
			
			
			submitbtn = new JButton("Sumbmit Data");
			submitbtn.setBackground(Color.LIGHT_GRAY);
			
			
			
			submitbtn.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					String cusId = cusIdtxt.getText();
					String cusName = cusNametxt.getText();
					String orderId = ordIdtxt.getText();
					String glassId = gIdtxt.getText();
					String priceVal = pricetxt.getText();
					double price = Double.parseDouble(priceVal);
					String iteVal = quntitytxt.getText();
					int quntity = Integer.parseInt(iteVal);
					System.out.println(cusId);
					CustomerTemp ct  = new CustomerTemp(cusId,cusName,orderId,glassId,price,quntity);
					//guiClass.setFormDetails(ct);
				}
			});
			
			
			
			setLayout(new GridBagLayout());
			GridBagConstraints gc = new GridBagConstraints();
			
			
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			gc.gridx = 0;
			gc.gridy = 0;
			add(cusIdlbl,gc);
			
			gc.gridy = 0;
			gc.gridx = 1;
			add(cusIdtxt,gc);
			
			//////////////////////////////////
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			gc.gridx = 0;
			gc.gridy = 1;
			add(cusNamelbl,gc);
			
			gc.gridx = 1;
			gc.gridy = 1;
			add(cusNametxt,gc);
			///////////////////////////////
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			gc.gridx = 0;
			gc.gridy = 2;
			add(ordIdlbl,gc);
			
			gc.gridx = 1;
			gc.gridy = 2;
			add(ordIdtxt,gc);
			
			////////////////////////////////
			
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			gc.gridx = 0;
			gc.gridy = 3;
			add(gIdlbl,gc);
			
			gc.gridx = 1;
			gc.gridy = 3;
			add(gIdtxt,gc);
			
			////////////////////////////
			
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			gc.gridx = 0;
			gc.gridy = 4;
			add(pricelbl,gc);
			
			gc.gridx = 1;
			gc.gridy = 4;
			add(pricetxt,gc);
			////////////////////////////
			
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			gc.gridx = 0;
			gc.gridy = 5;
			add(quntitylbl,gc);
			
			gc.gridx = 1;
			gc.gridy = 5;
			add(quntitytxt,gc);
			////////////////////////////
			
			gc.weightx = 1;
			gc.weighty = 3;
			
			gc.gridx = 1;
			gc.gridy = 6;
			add(submitbtn,gc);
			////////////////////////////
			
		}
		
	
}
