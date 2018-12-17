package itemGUI;



import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	

		
		private CustomerTemp cusTemp;
		private JTextArea textArea;
		
		public TextPanel(){
			
			
			setLayout(new BorderLayout());
			
			textArea = new JTextArea();
			textArea.setBackground(Color.GRAY);
			add(textArea,BorderLayout.CENTER);
			
			
		
	}
		
		public void appendText(String s){
			textArea.append(s);
		}
		
		public void setFormDetails(CustomerTemp temp){
			this.cusTemp = temp;
		}
		
		public void setValues(){
			
			String cusId = cusTemp.getCusId();
			String cusName = cusTemp.getCusNamae();
			String orId = cusTemp.getOrderId();
			String glId = cusTemp.getGlassId();
			double price = cusTemp.getPrice();
			int qunti = cusTemp.getQuntity();
			
			appendText("Customer Id: "+cusId+"Customer Name: "+cusName);
		}

}
