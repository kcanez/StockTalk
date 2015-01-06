import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GreetingPanel extends JPanel 
{

	public GreetingPanel()
	{
		TextField stockSelected = new TextField(6);
		Button findTicker = new Button("Enter");
		//stockSelected.setSize(100, 2); 

		this.add(new Label("Please Enter a ticker: "));
		this.add(stockSelected);
		this.add(findTicker);
	}

public static void startProgram()
{
	GreetingPanel pan = new GreetingPanel();
	
	 JFrame frame = new JFrame("test");
	 frame.pack();
	 frame.setSize(500,100);
	 frame.setLocationRelativeTo(null);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(pan);
    frame.setLocationByPlatform(true);
    frame.setVisible(true);
}

public static void main (String args[])
{
	startProgram();
}

}