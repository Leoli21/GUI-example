import javax.swing.JFrame;

public class NewWay extends JFrame
{
	public NewWay()
	{
		this.setTitle("Test this Jawn");
		this.setBounds(100,100,600,300);
		setLayout(null);
		
		
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new NewWay();
	}
}
