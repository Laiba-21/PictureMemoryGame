

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

public class HardHousePicture extends JFrame implements ActionListener

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3981749590102992249L;

	
	
	JLabel HardPiclabel=new JLabel();
	JLabel HardPiclabel2=new JLabel();
	JPanel bluePanel=new JPanel();
	JFrame HardPicframe =new JFrame();

	public  HardHousePicture()
	{

		HardPiclabel=new JLabel();
		HardPiclabel.setText("NOTICE: Observe the image and remember.");
		HardPiclabel.setHorizontalTextPosition(JLabel.CENTER);
		HardPiclabel.setVerticalTextPosition(JLabel.TOP);
		HardPiclabel.setSize(1000,50);
		HardPiclabel.setBounds(10,10,500,50);
		HardPiclabel.setBackground(null);
		HardPiclabel.setFont(new Font("Agency FB",Font.BOLD,25));
		HardPiclabel.setForeground(Color.DARK_GRAY);
		
		HardPiclabel2.setSize(1000,100);
		HardPiclabel2.setBounds(10,70,500, 300);
		HardPiclabel2.setBackground(null);
		HardPiclabel2.setIconTextGap(0);
		HardPiclabel2.setOpaque(true);
        ImageIcon Hard= new ImageIcon("HardHouse.jpg");
        HardPiclabel2.setIcon(Hard);	
        
        

        bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(15,15, 520, 380);
        bluePanel.setLayout(null);

ImageIcon logo2= new ImageIcon("Icon.jpeg"); 
HardPicframe =new JFrame();
HardPicframe.setTitle("Memory Game");
HardPicframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
HardPicframe.getAlignmentX();
HardPicframe.setLayout(null);
HardPicframe.setSize(570, 450);
HardPicframe.getContentPane().setBackground(Color.white);
HardPicframe.setIconImage(logo2.getImage());

bluePanel.add(HardPiclabel);
bluePanel.add(HardPiclabel2);
HardPicframe.add(bluePanel);
HardPicframe.setVisible(true);



//frame2 ends//
//........//
	




Timer t=new Timer(10000, null);
t.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e) 
{
	
	{
		HardPicframe.setVisible(false);
		HardPicframe.dispose();
		HardHouseScore sw1=new HardHouseScore();
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
			new HardHousePicture();
		}


}
