
package myPackage;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class EasyStreetPicture extends JFrame implements ActionListener
{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 241502749969639588L;
	/**
	 * 
	 */

	//frame2 STARTS//
	//........//
	
	JLabel Easylabel=new JLabel();
	JPanel bluePanel=new JPanel();
	JFrame Easyframe =new JFrame();

	public  EasyStreetPicture()
	{

Easylabel=new JLabel();
Easylabel.setText("NOTICE: Observe the image and remember.");
Easylabel.setHorizontalTextPosition(JLabel.CENTER);
Easylabel.setVerticalTextPosition(JLabel.TOP);
Easylabel.setSize(1000,50);
Easylabel.setBackground(null);
Easylabel.setFont(new Font("Agency FB",Font.BOLD,25));
Easylabel.setForeground(Color.DARK_GRAY);
Easylabel.setIconTextGap(40);
ImageIcon Easy= new ImageIcon("EasyStreet.jpg");
Easylabel.setIcon(Easy);	
Easylabel.setOpaque(true);
Easylabel.setBounds(40, 30, 1000, 300);

bluePanel=new JPanel();
bluePanel.setBackground(Color.blue);
bluePanel.setBounds(15,15, 410, 350);
bluePanel.setLayout(null);

ImageIcon logo2= new ImageIcon("Icon.jpeg"); 
Easyframe =new JFrame();
Easyframe.setTitle("Memory Game");
Easyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Easyframe.getAlignmentX();
Easyframe.setLayout(null);
Easyframe.setSize(460, 420);
Easyframe.getContentPane().setBackground(Color.white);
Easyframe.setIconImage(logo2.getImage());

bluePanel.add(Easylabel);
Easyframe.add(bluePanel);
Easyframe.setVisible(true);



//frame2 ends//
//........//
	




Timer t=new Timer(5000, null);
t.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e) 
{
	
	{
		Easyframe.setVisible(false);
		Easyframe.dispose();
        EasyStreetScore sw1=new EasyStreetScore();
		sw1.setVisible(true);

	}

}

});
t.setRepeats(false);
t.start();

}
	

	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		
			
	}
	 public static void main (String []args)
		{	
			new EasyStreetPicture();
		}

}
