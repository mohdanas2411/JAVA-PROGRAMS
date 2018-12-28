import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator implements ActionListener{
	JFrame f;
	JTextField text;
    float d1,d2,p1,p2,m1,m2,mi1,mi2;
    String numx;
    String[] num = new String[8];
    JButton[] button = new JButton[16];
    int turn=0,i;
	Calculator (){
		f = new JFrame();
		f.setSize(500,400);
		f.setLayout(null);
		text = new JTextField();
		text.setBounds(50,30,230,40);
		f.add(text);

		for (i=0;i<10 ;i++ ) {
			button[i] = new JButton(i+"");
		}
		
		button[10] = new JButton("/");
		button[11] = new JButton("*");
		button[12] = new JButton("-");
		button[13] = new JButton("+");
		button[14] = new JButton("=");
		button[15] = new JButton("CL");
		
		button[9].setBounds(50,80,50,40);
		button[8].setBounds(110,80,50,40);
		button[7].setBounds(170,80,50,40);
		button[6].setBounds(50,130,50,40);
		button[5].setBounds(110,130,50,40);
		button[4].setBounds(170,130,50,40);
		button[3].setBounds(50,180,50,40);
		button[2].setBounds(110,180,50,40);
		button[1].setBounds(170,180,50,40);
		button[0].setBounds(110,230,50,40);
		button[10].setBounds(230,80,50,40);
		button[11].setBounds(230,130,50,40);
		button[12].setBounds(230,180,50,40);
		button[13].setBounds(230,230,50,40);
		button[14].setBounds(170,230,50,40);
		button[15].setBounds(50,230,50,40);

		for (i=0;i<16 ;i++ ) {
			f.add(button[i]);
			button[i].addActionListener(this);
		}

		f.setVisible(true);
	}
		public void actionPerformed(ActionEvent e){
		
			for (i=0;i<10 ;i++ ) {
				if(e.getSource()==button[i]){
				
					text.setText(text.getText()+button[i].getText());
				}
			}
	
			if(e.getSource()==button[10]){
	
				num[0]=text.getText();
				d1=Float.parseFloat(num[0]);
				text.setText(text.getText()+button[10].getText());
			    numx=text.getText();
			    turn=1;
			}

			if(e.getSource()==button[11]){
				num[2] = text.getText();
				m1 = Float.parseFloat(num[2]);	
				text.setText(text.getText()+button[11].getText());
			    numx=text.getText();
			    turn=2;
				
			}

			if(e.getSource()==button[12]){
		
				num[4] = text.getText();
				mi1 = Float.parseFloat(num[4]);	
				text.setText(text.getText()+button[12].getText());
				numx=text.getText();
				turn=3;
			}

			if(e.getSource()==button[13]){
		
				num[6] = text.getText();
				p1 = Float.parseFloat(num[6]);	
				text.setText(text.getText()+button[13].getText());
				numx=text.getText();
				turn=4;
			}

			if(e.getSource()==button[14]){
			    if (turn==1) {
			    	num[1] = text.getText();
					num[1] =num[1].replace(numx,"");
					d2=Float.parseFloat(num[1]);
					text.setText(d1/d2+"");
					turn=0;
			    }

				else if(turn==2){
					num[3] = text.getText();
					num[3] =num[3].replace(numx,"");
					m2=Float.parseFloat(num[3]);
					text.setText(m1*m2+"");
					turn=0;
				}

				else if(turn==3){
					num[5] = text.getText();
					num[5] =num[5].replace(numx,"");
					mi2=Float.parseFloat(num[5]);
					text.setText(mi1-mi2+"");
					turn=0;
				}

				else if(turn==4){
					num[7] = text.getText();
					num[7] =num[7].replace(numx,"");
					p2=Float.parseFloat(num[7]);
					text.setText(p1+p2+"");
					turn=0;
				}
			}

			if(e.getSource()==button[15]){
				text.setText("");
			}
		}

	public static void main(String[] args) {
		Calculator obj = new Calculator();

	}
}