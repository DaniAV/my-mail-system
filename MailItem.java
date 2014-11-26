
/**
 * Esta clase representa un mensaje de email
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    
    // Almacena que dirección envia el mensajeprivate String From;
    private String from;
    //Almacena para que dirección es el mensaje
    private String to;
    //Almacena el contenido del mensaje
    private String message;

    /**
     * Constructor para los objetos de la clase MailItem
     */
    public MailItem(String from, String to, String message)
    {
        
        this.from = from;
        this.to = to;
        this.message = message;
    }

    /**
     * Metodo que devuelve el valor de To.
     */
    public String getTo()
    {
        return to;
    }
    /**
     * Metodo que devuelve el valor de From
     */
    public String getFrom()
    {
        return from;
    }
    /**
     * Metodo que devuelve el valor del Message
     */
    public String getMessage()
    {
        return message;
    }
    
    public void print()
    {
        System.out.println("From " + from);
        System.out.println("To " + to);
        System.out.println("Message " + message);
    }
}
