
/**
 * Write a description of class MailIteme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String From;
    private String To;
    private String Message;

    /**
     * Constructor for objects of class MailIteme
     */
    public MailItem(String from, String to, String message)
    {
        // initialise instance variables
        From = from;
        To = to;
        Message = message;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getTo()
    {
        // put your code here
        return To;
    }
    
    public String getFrom()
    {
        return From;
    }
    
    public String getMessage()
    {
        return Message;
    }
    
    public void print()
    {
        System.out.println("From " + From);
        System.out.println("To " + To);
        System.out.println("Message " + Message);
    }
}
