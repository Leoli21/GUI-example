import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class thing 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(50,100,500,250);
		myFrame.setLayout(null);
		
		
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(50,25,100,30);;
		myFrame.add(lblName);
		
		
		
		JTextField txtName = new JTextField("");
		txtName.setBounds(150,25,200,30);
		myFrame.add(txtName);
		
		
		
		JButton btnJawn = new JButton("Rick Roll");
		btnJawn.setBounds(75,65,140,40);
		myFrame.add(btnJawn);
		
		//Anonymous Class
		
		btnJawn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
				lblName.setText(txtName.getText());
				txtName.setText("");
				btnJawn.setLocation((int) (Math.random()*myFrame.getWidth()-btnJawn.getWidth()), btnJawn.getY());
				txtName.setEnabled(false);
			}
			
		});
		
		JCheckBox checkBox = new JCheckBox("one", true);
		checkBox.setBounds(80,110,20,30);
		myFrame.add(checkBox);
		
		if(checkBox.isSelected())
		
		
		
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
	}

}
