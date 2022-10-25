//Programmer: Brenan Marenger
//Date: 2/21/20
//Assignment: Ch5 Ex10 Pg279
//Description: 12 days of christmas lyrics using a switch

import javax.swing.JOptionPane;

public class TwelveDays
{
    public static void main(String[] args)
    {
		
		String dayNum;
		dayNum = JOptionPane.showInputDialog("From what day do you want to strat the song The Twelve Days of Christmas?");
		

            System.out.println("On the " + dayNum + "th day of Christmas,");
			System.out.println("My true love gave to me");
			
            switch(dayNum)
            {
                case "12":
                    System.out.println("Twelve Drummers Drumming");

                case "11":
                    System.out.println("Eleven Pipers Piping");

                case "10":
                    System.out.println("Ten Lords a Leaping");

                case "9":
                    System.out.println("Nine Ladies Dancing");

                case "8":
                    System.out.println("Eight Maids a Milking");

                case "7":
                    System.out.println("Seven Swans a Swimming");

                case "6":
                    System.out.println("Six Geese a Laying");

                case "5":
                    System.out.println("Five Golden Rings");

                case "4":
                    System.out.println("Four Calling Birds");

                case "3":
                    System.out.println("Three French Hens");

                case "2":
                    System.out.println("Two Turtle Doves");

                case "1":
                    if(dayNum == "1")
                        System.out.print("A Partridge in a Pear Tree.");
                    else
                        System.out.print("and a Partridge in a Pear Tree.");
                    break;
                default:
                    System.out.print("Internal Error.");
                    System.exit(1);
            }
                                          
    }
}
