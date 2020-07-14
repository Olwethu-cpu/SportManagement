package myDataBase;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class mySport extends JFrame
{
    public mySport()
    {
        //headers for the table
        String[] columns = new String[] {
            "Age-Groups", "Table tennis", "Netball", "Football", "Soccer","Rugby","Cricket","Swimming","Volleyball",

            };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {"7 - 13", "John", "Asa", "Lisa" , "Aza" , "Luvo" , "Cam" , "Sbuda" , "Likho" },
            {"14 - 17", "Rambo", "Jenda", "Aija" , "Luke" , "Mike" , "Nomsa" , "Zack" , "Jack" },
            {"18 - 253", "Ryo", "Kyo", "Lee" , "Jackie" , "Jolie" , "Camroon" , "Wonga" , "Neymar" },
            {"26 - 40", "Leo", "Odz", "Ozil" , "Pogba" , "Bruno" , "Kobus" , "Lina" , "Manzoi" },
        };
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mySport();
            }
        });
    }   
}