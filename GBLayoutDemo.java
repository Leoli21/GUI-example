import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GBLayoutDemo extends JFrame
{
	public GBLayoutDemo() 
	{
		setTitle("GridBagLayout Demo Frame");
		setBounds(100,100,600,300);
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2"); //pack();
		//btn1.setSize(130,50);
		//btn2.setSize(80,80);
		btn1.setPreferredSize(new Dimension(130,50));
		btn2.setPreferredSize(new Dimension(80,80));
		
		
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(btn1,gbc);
		
		
		gbc.gridx = 1;
		add(btn2,gbc);
		
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GBLayoutDemo();
	}
}
