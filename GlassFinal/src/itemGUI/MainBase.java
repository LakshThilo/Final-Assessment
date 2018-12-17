package itemGUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainBase extends JFrame{
	
	private FramePanel framePanel;
	private TextPanel textPanel;
	private FilePanel filePanel;
	private CustomerTemp ct;
	
	public MainBase(){
		
		super("Customer Details");
		setVisible(true);
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		framePanel = new FramePanel();
		textPanel = new TextPanel();
		filePanel = new FilePanel();
		
		textPanel.appendText("Hello");
		
		setLayout(new BorderLayout());
		
		add(framePanel,BorderLayout.WEST);
		add(textPanel,BorderLayout.CENTER);
		add(filePanel,BorderLayout.NORTH);
		
		/*String cusId = ct.getCusId();
		String cusName = ct.getCusNamae();
		String orId = ct.getOrderId();
		String glId = ct.getGlassId();
		double price = ct.getPrice();
		int qunti = ct.getQuntity();
		
		textPanel.appendText("Customer Id: "+cusId+"Customer Name: "+cusName);*/
		
		
	}
	public void setFormDetails(CustomerTemp c){
		this.ct = c;
	}

}



