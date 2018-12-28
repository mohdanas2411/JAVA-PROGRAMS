import java.awt.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.event.*;
public class Sum1 extends Applet implements ActionListener{
	JTextField tf1,tf2,result;
	JButton add;
	public void init()
	{
		tf1 = new JTextField();
		tf2 = new JTextField();
		result = new JTextField();
		add = new JButton("add");
		tf1.setBounds(50,50,50,50);
		tf2.setBounds(110,50,50,50);
		add.setBounds(180,50,150,50);
		result.setBounds(270,50,180,50);
		setLayout(null);
		add(tf1);
		add(tf2);
		add(add);
		add(result);
		add.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==add)
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int c = a+b;
			result.setText(""+c);

		}
	}

}