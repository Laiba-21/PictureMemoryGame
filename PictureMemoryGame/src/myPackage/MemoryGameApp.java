package myPackage;

import java.awt.EventQueue;

public class MemoryGameApp 
{	
		public static void main(String[] args)
		{
			EventQueue.invokeLater(() ->
            {
				try 
				{
					MainMenuWindow frame  =new MainMenuWindow();
					frame.setVisible(true);
					frame.setTitle("Memory Game");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			});
	      
	     }	
}