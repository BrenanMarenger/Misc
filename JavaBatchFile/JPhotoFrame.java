//Programmer: Brenan Marenger
//Date: 5/8/20
//Assignment: Ch14 Ex10 Pg554-555
//Description: JPhotoFrame.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPhotoFrame extends JFrame implements ItemListener
{
	final double LOCATION_PRICE = 90.00;
   double ONE_HUMAN_PRICE = 40.00, MULTI_HUMAN_PRICE = 75.00;
   double PET_PRICE = 95.00;
   double locPrice = 0.00;
   double subPrice = 0.0;
   public JPhotoFrame()
	
   FlowLayout flow = new FlowLayout();
   
   JCheckBox locBox = new JCheckBox("On location",false);
   JCheckBox studioBox = new JCheckBox("In studio", false);
   
   JCheckBox oneBox = new JCheckBox("One human subject          ", false);
   JCheckBox multiBox = new JCheckBox("Two or more human subjects", false);
   JCheckBox petBox = new JCheckBox("Pet subjet                 ", false);
   
   JLabel mainLabel = new JLabel("Paula's Portaits");
   
   Font font = new  Font("Ariel",Font.ITALIC, 30);
   JLabel label2 = new JLabel("Portait fee");
   JLabel label1 = new JLabel("Select options");
   JTextField totPrice = new JTextField(10);
   
   String output;
   
   {
      super("Portait options selection");
	  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
	  
      ButtonGroup subjectsGroup = new ButtonGroup();
	  
      subjectsGroup.add(oneBox);
      subjectsGroup.add(multiBox);
      subjectsGroup.add(petBox);
	  
      add(label1);
      add(oneBox);
      add(multiBox);
      add(petBox);
	  
      ButtonGroup locGroup = new ButtonGroup();
	  
      locGroup.add(locBox);
      locGroup.add(studioBox);
	  
      add(locBox);
      add(studioBox);
	  
      mainLabel.setFont(font);
	  
      add(mainLabel);
      add(label2);
      add(totPrice);
	  
      totPrice.setText("$0");
	  
      oneBox.addItemListener(this);
      multiBox.addItemListener(this);
      petBox.addItemListener(this);
      locBox.addItemListener(this);
      studioBox.addItemListener(this);
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
	  
      int select;
      select = check.getStateChange();
	  
      if(source == locBox)
      {
         if(select == ItemEvent.SELECTED)
            locPrice = locPrice + LOCATION_PRICE;
         else
            locPrice = locPrice - LOCATION_PRICE;
      }
      else
        if(source == oneBox)
        {
           if(select == ItemEvent.SELECTED)
              subPrice = subPrice + ONE_HUMAN_PRICE;
           else
              subPrice = subPrice - ONE_HUMAN_PRICE;
        }
        else
           if(source == multiBox)
           {
	      if(select == ItemEvent.SELECTED)
                 subPrice = subPrice + MULTI_HUMAN_PRICE;
   	      else
	         subPrice = subPrice - MULTI_HUMAN_PRICE;
           }
           else
           {
              if(source == petBox)
              {
                 if(select == ItemEvent.SELECTED)
	            subPrice = subPrice + PET_PRICE;
                 else
	            subPrice = subPrice - PET_PRICE;
              }
           }
		   
        output = " " + (subPrice + locPrice);
        totPrice.setText(output);
    }
	
    public static void main(String[] args)
    {
      JPhotoFrame frame = new JPhotoFrame();
      frame.setSize(320, 250);
      frame.setVisible(true);
   }
}