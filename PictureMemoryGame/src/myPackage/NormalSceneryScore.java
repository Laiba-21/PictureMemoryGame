package myPackage;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NormalSceneryScore extends JFrame implements ActionListener
{

	
	public String input;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5207981515524990719L;
	//frame4 STARTS//
	//........//
	JLabel label3=new JLabel();
	JLabel label4=new JLabel();
	JLabel label5=new JLabel();
	JLabel label6=new JLabel();
	JLabel label7=new JLabel();
	JLabel noticelabel1=new JLabel();
	JLabel noticelabel2=new JLabel();
	JButton submit=new JButton();
	JLabel checkScore=new JLabel();
	JButton continueButton=new JButton();
	JPanel orangePanel=new JPanel();
	JPanel yellowPanel=new JPanel();
	JPanel yellowPanel2=new JPanel();
	JFrame NormalSceneryScoreFrame =new JFrame();
	JTextField textfield=new JTextField();
	
	
   public  NormalSceneryScore()
   {

	   label3=new JLabel();
		label3.setText("Enter the objects you observed.");
		label3.setHorizontalTextPosition(JLabel.RIGHT);
		label3.setVerticalTextPosition(JLabel.TOP);
		label3.setSize(1000,35);
		label3.setBounds(10, 50, 1000, 25);
		label3.setBackground(null);
		label3.setFont(new Font("Agency FB",Font.PLAIN,24));
		label3.setForeground(Color.DARK_GRAY);
		label3.setOpaque(true);

label4=new JLabel();
label4.setText("Score Board");
label4.setHorizontalTextPosition(JLabel.RIGHT);
label4.setVerticalTextPosition(JLabel.CENTER);
label4.setSize(100,35);
label4.setBounds(200, 10, 100, 35);
label4.setBackground(null);
label4.setFont(new Font("Agency FB",Font.BOLD,24));
label4.setForeground(Color.DARK_GRAY);
label4.setOpaque(true);

label5=new JLabel();
label5.setText("MisMatched:");
label5.setHorizontalTextPosition(JLabel.RIGHT);
label5.setVerticalTextPosition(JLabel.CENTER);
label5.setSize(10,35);
label5.setBounds(15, 300, 200, 35);
label5.setBackground(null);
label5.setFont(new Font("Agency FB",Font.PLAIN,24));
label5.setForeground(Color.DARK_GRAY);
label5.setOpaque(true);

label6=new JLabel();
label6.setText("Matched:");
label6.setHorizontalTextPosition(JLabel.RIGHT);
label6.setVerticalTextPosition(JLabel.CENTER);
label6.setSize(100,35);
label6.setBounds(15, 330, 200, 35);
label6.setBackground(null);
label6.setFont(new Font("Agency FB",Font.PLAIN,24));
label6.setForeground(Color.DARK_GRAY);
label6.setOpaque(true);

noticelabel1=new JLabel();
noticelabel1.setText("NOTICE: Please remove LAST object's name first to enter NEW.");
noticelabel1.setHorizontalTextPosition(JLabel.RIGHT);
noticelabel1.setVerticalTextPosition(JLabel.CENTER);
noticelabel1.setSize(250,35);
noticelabel1.setBounds(15, 160, 500, 25);
noticelabel1.setBackground(null);
noticelabel1.setFont(new Font("Times New Roman",Font.PLAIN,15));
noticelabel1.setForeground(Color.DARK_GRAY);
noticelabel1.setOpaque(true);

noticelabel2=new JLabel();
noticelabel2.setText("NOTICE: Please enter object's name in SMALL LETTERS.");
noticelabel2.setHorizontalTextPosition(JLabel.RIGHT);
noticelabel2.setVerticalTextPosition(JLabel.CENTER);
noticelabel2.setSize(250,35);
noticelabel2.setBounds(15, 190, 500, 25);
noticelabel2.setBackground(null);
noticelabel2.setFont(new Font("Times New Roman",Font.PLAIN,15));
noticelabel2.setForeground(Color.DARK_GRAY);
noticelabel2.setOpaque(true);

label7=new JLabel();
label7.setText("Total Guess:");
label7.setHorizontalTextPosition(JLabel.RIGHT);
label7.setVerticalTextPosition(JLabel.CENTER);
label7.setSize(250,35);
label7.setBounds(15, 360, 200, 35);
label7.setBackground(null);
label7.setFont(new Font("Agency FB",Font.PLAIN,24));
label7.setForeground(Color.DARK_GRAY);
label7.setOpaque(true);

textfield=new JTextField();
textfield.setBorder(BorderFactory.createDashedBorder(Color.white));
textfield.setBackground(Color.black);
textfield.setBounds(150, 100, 300, 50);
textfield.setCaretColor(Color.white);
textfield.setForeground(Color.blue);
textfield.setHorizontalAlignment(JTextField.CENTER);
textfield.addActionListener(this);

submit=new JButton();
submit.setBounds(40,100, 100, 50);
submit.setBorder(BorderFactory.createEtchedBorder());	
submit.setText("SUBMIT");
submit.setBackground(Color.black);
submit.setFocusable(false);
submit.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
submit.setForeground(Color.BLUE);
submit.addActionListener(this);

checkScore=new JLabel();
checkScore.setBounds(200,250, 150, 50);
checkScore.setBorder(BorderFactory.createEtchedBorder());	
checkScore.setText("Check Score");
checkScore.setHorizontalAlignment(JLabel.CENTER);
checkScore.setBackground(Color.black);
checkScore.setFocusable(false);
checkScore.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
checkScore.setForeground(Color.BLUE);


continueButton=new JButton();
continueButton.setBounds(200,430, 120, 50);
continueButton.setBorder(BorderFactory.createEtchedBorder());	
continueButton.setText("Continue");
continueButton.setBackground(Color.black);
continueButton.setFocusable(false);
continueButton.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
continueButton.setForeground(Color.BLUE);
continueButton.addActionListener(this);

orangePanel=new JPanel();
orangePanel.setBackground(Color.orange);
orangePanel.setBounds(15,15, 500, 500);
orangePanel.setLayout(null);

yellowPanel=new JPanel();
yellowPanel.setBackground(Color.yellow);
yellowPanel.setBounds(0,220, 500, 20);
yellowPanel.setLayout(null);

yellowPanel2=new JPanel();
yellowPanel2.setBackground(Color.yellow);
yellowPanel2.setBounds(0,400, 500, 20);
yellowPanel2.setLayout(null);

ImageIcon logo4= new ImageIcon("Icon.jpeg"); 
NormalSceneryScoreFrame  =new JFrame();
NormalSceneryScoreFrame .setTitle("Memory Game");
NormalSceneryScoreFrame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
NormalSceneryScoreFrame .getAlignmentX();
NormalSceneryScoreFrame .setVisible(true);
NormalSceneryScoreFrame .setResizable(false);
NormalSceneryScoreFrame .setLayout(null);
NormalSceneryScoreFrame .setSize(550, 570);

NormalSceneryScoreFrame .getContentPane().setBackground(Color.white);
NormalSceneryScoreFrame .setIconImage(logo4.getImage());
orangePanel.add(label5);
orangePanel.add(label3);
orangePanel.add(label4);
orangePanel.add(label6);
orangePanel.add(label7);
orangePanel.add(textfield);
orangePanel.add(continueButton);
orangePanel.add(submit);
orangePanel.add(checkScore);
orangePanel.add(yellowPanel);
orangePanel.add(yellowPanel2);
orangePanel.add(noticelabel1);
orangePanel.add(noticelabel2);
NormalSceneryScoreFrame .add(orangePanel);



//frame4 ENDS//
	//........//

	
  submit.addActionListener(new ActionListener()
	{
	    
	  @Override
	   public void actionPerformed(ActionEvent e) 
	     {
		// TODO Auto-generated method stub
			  input=textfield.getText();
			  compare();
			
	     }
	});
 
   }

   
   @SuppressWarnings("unlikely-arg-type") 
   int totalGuesses = 0;
   int Matched=0;
   int NotMatched=0;

public void compare()
   {

	   List<String> objects= new ArrayList<String>();
		String temp="Match :" , temp1="Mis-Matched :",temp2="Total Guesses=";
		objects.add("mountains");
		objects.add("rocks");
		objects.add("river");
		objects.add("trees");
		objects.add("grass");
		objects.add("bush");
		objects.add("clouds");
		objects.add("sky");
		
		
//	    while (!objects.isEmpty()) 
//	    {
	        
	        String input= textfield.getText();
	        if (objects.contains(input))
	        {
	        	totalGuesses++;
	        	// correct, remove entry
	        	Matched++;
		        label6.setText(temp.concat(String.valueOf(Matched)));
		        label7.setText(temp2.concat(String.valueOf(totalGuesses)));            
	        }
	        else
	        { 
	        	totalGuesses++;
	        	// incorrect, do nothing
	        	NotMatched++; 
	            label5.setText(temp1.concat(String.valueOf(NotMatched)));
		        label7.setText(temp2.concat(String.valueOf(totalGuesses)));	           
	        }
	    }    
 //  }
  
		
 
   public void actionPerformed(ActionEvent e)
   {
 		// TODO Auto-generated method stub
	   if(e.getSource() == continueButton)
		  {
		   NormalSceneryScoreFrame .dispose();
			  MainMenuWindow mw1=new MainMenuWindow();
			  mw1.setVisible(true);
			  
		  }
 	}
   public static void main (String []args)
	{	
		new NormalSceneryScore();
	}





}

