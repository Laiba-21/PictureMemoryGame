
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

public class NormalStreetPicture extends JFrame implements ActionListener

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3981749590102992249L;

	
	
	JLabel normalPiclabel=new JLabel();
	JLabel normalPiclabel2=new JLabel();
	JPanel bluePanel=new JPanel();
	JFrame normalPicframe =new JFrame();

	public   NormalStreetPicture()
	{

		normalPiclabel=new JLabel();
		normalPiclabel.setText("NOTICE: Observe the image and remember.");
		normalPiclabel.setHorizontalTextPosition(JLabel.CENTER);
		normalPiclabel.setVerticalTextPosition(JLabel.TOP);
		normalPiclabel.setSize(1000,50);
		normalPiclabel.setBounds(10,10,500,50);
		normalPiclabel.setBackground(null);
		normalPiclabel.setFont(new Font("Agency FB",Font.BOLD,25));
		normalPiclabel.setForeground(Color.DARK_GRAY);
		
		normalPiclabel2.setSize(1000,100);
		normalPiclabel2.setBounds(10,30,500, 300);
		normalPiclabel2.setBackground(null);
		normalPiclabel2.setIconTextGap(0);
		normalPiclabel2.setOpaque(true);
        ImageIcon NormalPicture= new ImageIcon("NormalStreet.jpg");
        normalPiclabel2.setIcon(NormalPicture);	
        
        

        bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(15,15, 450, 300);
        bluePanel.setLayout(null);

ImageIcon logo2= new ImageIcon("Icon.jpeg"); 
normalPicframe =new JFrame();
normalPicframe.setTitle("Memory Game");
normalPicframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
normalPicframe.getAlignmentX();
normalPicframe.setLayout(null);
normalPicframe.setSize(500, 380);
normalPicframe.getContentPane().setBackground(Color.white);
normalPicframe.setIconImage(logo2.getImage());

bluePanel.add(normalPiclabel);
bluePanel.add(normalPiclabel2);
normalPicframe.add(bluePanel);
normalPicframe.setVisible(true);



//frame2 ends//
//........//
	




Timer t=new Timer(7000, null);
t.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e) 
{
	
	{
		normalPicframe.setVisible(false);
		normalPicframe.dispose();
		NormalStreetScore sw1=new NormalStreetScore();
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
			new  NormalStreetPicture();
		}


}
