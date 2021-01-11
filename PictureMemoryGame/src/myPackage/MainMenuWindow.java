package myPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuWindow extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1675639502040712319L;


	/**
	 * 
	 */
	
	

	//frame1 STARTS//
	//........//
	 JButton exitButton=new JButton();	 
	JButton playButton=new JButton();
	JLabel label1=new JLabel();
	JPanel yellowPanel=new JPanel();
	JFrame frame1 =new JFrame();
	

  public MainMenuWindow()
  {
label1=new JLabel();
label1.setText("Hello Player!!! Click the play button to play.");
label1.setHorizontalTextPosition(JLabel.RIGHT);
label1.setVerticalTextPosition(JLabel.TOP);
label1.setSize(1000,35);
label1.setBounds(10, 10, 1000, 35);
label1.setBackground(null);
label1.setFont(new Font("Agency FB",Font.PLAIN,24));
label1.setForeground(Color.DARK_GRAY);
label1.setOpaque(true);

yellowPanel=new JPanel();
yellowPanel.setBackground(Color.yellow);
yellowPanel.setBounds(15,15, 350, 200);
yellowPanel.setLayout(null);

exitButton=new JButton();
exitButton.setBounds(140,120, 100, 50);
exitButton.setBorder(BorderFactory.createEtchedBorder());	
exitButton.setText("Exit");
exitButton.setBackground(Color.black);
exitButton.setFocusable(false);
exitButton.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
exitButton.setForeground(Color.BLUE);
exitButton.addActionListener(this);
playButton=new JButton();
playButton.setBounds(140,50, 100, 50);
playButton.setBorder(BorderFactory.createEtchedBorder());	
playButton.setText("Play");
playButton.setBackground(Color.black);
playButton.setFocusable(false);
playButton.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
playButton.setForeground(Color.BLUE);
playButton.addActionListener(this);

ImageIcon logo1= new ImageIcon("Icon.jpeg");  

frame1 =new JFrame();
frame1.setTitle("Memory Game");
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame1.getAlignmentX();
frame1.setVisible(true);
frame1.setLayout(null);
frame1.setSize(400, 275);
frame1.setIconImage(logo1.getImage());
yellowPanel.add(label1);
yellowPanel.add(exitButton);
yellowPanel.add(playButton);
frame1.add(yellowPanel);

//frame1 ends//
//........//

  }
  


@Override
public void actionPerformed(ActionEvent e) 
{
	// TODO Auto-generated method stub
	
	  if(e.getSource() == playButton)
	  {
		  frame1.dispose();
		LevelWindow sw1=new LevelWindow();
		 sw1.setVisible(true);
		  
	  }
	  else if(e.getSource() == exitButton)
	  {
		  System.exit(0);
	  }
	  
}
		public static void main (String []args)
		{	
			new MainMenuWindow();
		}

}