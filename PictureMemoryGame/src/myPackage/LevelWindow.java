package myPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelWindow extends JFrame implements ActionListener
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3184545860851937085L;
	
	
	
	JLabel LevelLabel=new JLabel();
	JLabel ScenarioLabel=new JLabel();
	JPanel greenPanel=new JPanel();
	JFrame LevelFrame =new JFrame();
	JButton easyButton=new JButton();
	JButton normalButton=new JButton();
	JButton hardButton=new JButton();
	
	@SuppressWarnings("rawtypes")
	JComboBox ScenarioComboBox=new JComboBox();


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public LevelWindow()
	{
		
		LevelLabel=new JLabel();
		LevelLabel.setText("Choose Your level of Game");
		LevelLabel.setHorizontalTextPosition(JLabel.RIGHT);
		LevelLabel.setVerticalTextPosition(JLabel.TOP);
		LevelLabel.setSize(1000,35);
		LevelLabel.setBounds(10, 120, 1000, 35);
		LevelLabel.setBackground(null);
		LevelLabel.setFont(new Font("Agency FB",Font.PLAIN,24));
		LevelLabel.setForeground(Color.DARK_GRAY);
		LevelLabel.setOpaque(true);
		
		ScenarioLabel=new JLabel();
		ScenarioLabel.setText("Firstly,Choose the Scenario of Game");
		ScenarioLabel.setHorizontalTextPosition(JLabel.RIGHT);
		ScenarioLabel.setVerticalTextPosition(JLabel.TOP);
		ScenarioLabel.setSize(1000,35);
		ScenarioLabel.setBounds(10, 10, 1000, 35);
		ScenarioLabel.setBackground(null);
		ScenarioLabel.setFont(new Font("Agency FB",Font.PLAIN,24));
		ScenarioLabel.setForeground(Color.DARK_GRAY);
		ScenarioLabel.setOpaque(true);
		ScenarioLabel.setIconTextGap(50);
		
		greenPanel=new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(15,15, 350, 260);
		greenPanel.setLayout(null);
		
		
		easyButton=new JButton();
		easyButton.setBounds(20,180, 70, 50);
		easyButton.setBorder(BorderFactory.createEtchedBorder());	
		easyButton.setText("Easy");
		easyButton.setBackground(Color.black);
		easyButton.setFocusable(false);
		easyButton.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
		easyButton.setForeground(Color.BLUE);
		easyButton.addActionListener(this);
		
		normalButton=new JButton();
		normalButton.setBounds(120,180, 100, 50);
		normalButton.setBorder(BorderFactory.createEtchedBorder());	
		normalButton.setText("Normal");
		normalButton.setBackground(Color.black);
		normalButton.setFocusable(false);
		normalButton.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
		normalButton.setForeground(Color.BLUE);
		normalButton.addActionListener(this);
		
		hardButton=new JButton();
		hardButton.setBounds(250,180, 70, 50);
		hardButton.setBorder(BorderFactory.createEtchedBorder());	
		hardButton.setText("Hard");
		hardButton.setBackground(Color.black);
		hardButton.setFocusable(false);
		hardButton.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
		hardButton.setForeground(Color.BLUE);
		hardButton.addActionListener(this);
		
		
		
	    String[] scenarios = {"House","Scenery","Street","School"};
		
	    ScenarioComboBox=new JComboBox(scenarios);
	    ScenarioComboBox.setBounds(20, 70, 200, 30);	
		ScenarioComboBox.setEditable(true);
		ScenarioComboBox.setBackground(Color.gray);
		ScenarioComboBox.setForeground(Color.white);
		ScenarioComboBox.addActionListener(this);


		//Level Frame starts		
		
		ImageIcon logo1= new ImageIcon("Icon.jpeg");  

		LevelFrame =new JFrame();
		LevelFrame.setTitle("Memory Game");
		LevelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LevelFrame.setResizable(false);
		LevelFrame.setVisible(true);
		LevelFrame.setLayout(null);
		LevelFrame.setSize(400, 330);
		
		//Level Frame ends	
		
		// adding components
		LevelFrame.setIconImage(logo1.getImage());
		greenPanel.add(LevelLabel);
		greenPanel.add(ScenarioLabel);
		greenPanel.add(ScenarioComboBox);
		greenPanel.add(easyButton);
		greenPanel.add(normalButton);
		greenPanel.add(hardButton);
		
		LevelFrame.add(greenPanel);
		
	}
	

		@SuppressWarnings("static-access")
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			
			if( ScenarioComboBox.getSelectedItem().toString() == "House")
			{
				if(e.getSource() == easyButton)
				{
					LevelFrame.dispose();
					EasyHousePicture ehp   =new EasyHousePicture();
					ehp.setVisible(true);
				}
				else if(e.getSource() == normalButton)
				{
					LevelFrame.dispose();
					NormalHousePicture nhp   =new NormalHousePicture();
					nhp.setVisible(true);
				}
				else if(e.getSource() == hardButton)
				{
					LevelFrame.dispose();
					HardHousePicture nhp   =new HardHousePicture();
					nhp.setVisible(true);
				}
			
			}
			else if( ScenarioComboBox.getSelectedItem().toString() == "Street")
			{
				if(e.getSource() == easyButton)
				{
					LevelFrame.dispose();
					EasyStreetPicture ehp   =new EasyStreetPicture();
					ehp.setVisible(true);
				}
				else if(e.getSource() == normalButton)
				{
					LevelFrame.dispose();
					NormalStreetPicture nhp   =new NormalStreetPicture();
					nhp.setVisible(true);
				}
				else if(e.getSource() == hardButton)
				{
					LevelFrame.dispose();
					HardStreetPicture nhp   =new HardStreetPicture();
					nhp.setVisible(true);
				}
			
			}
			else if( ScenarioComboBox.getSelectedItem().toString() == "School")
			{
				if(e.getSource() == easyButton)
				{
					LevelFrame.dispose();
					EasySchoolPicture ehp   =new EasySchoolPicture();
					ehp.setVisible(true);
				}
				else if(e.getSource() == normalButton)
				{
					LevelFrame.dispose();
					NormalSchoolPicture nhp   =new NormalSchoolPicture();
					nhp.setVisible(true);
				}
				else if(e.getSource() == hardButton)
				{
					LevelFrame.dispose();
					HardSchoolPicture nhp   =new HardSchoolPicture();
					nhp.setVisible(true);
				}
			
			}
			else if( ScenarioComboBox.getSelectedItem().toString() == "Scenery")
			{
				if(e.getSource() == easyButton)
				{
					LevelFrame.dispose();
					EasySceneryPicture ehp   =new EasySceneryPicture();
					ehp.setVisible(true);
				}
				else if(e.getSource() == normalButton)
				{
					LevelFrame.dispose();
					NormalSceneryPicture nhp   =new NormalSceneryPicture();
					nhp.setVisible(true);
				}
				else if(e.getSource() == hardButton)
				{
					LevelFrame.dispose();
					HardSceneryPicture nhp   =new HardSceneryPicture();
					nhp.setVisible(true);
				}
			
			}
	  
		
	}
}