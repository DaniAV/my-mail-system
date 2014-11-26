
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
    
    private String subjet;

    /**
     * Constructor para los objetos de la clase MailItem
     */
    public MailItem(String from, String to, String message, String subjet)
    {
        
        this.from = from;
        this.to = to;
        this.message = message;
        this.subjet = subjet;
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
    
    /**
     * Metodo que devuelve el valor de subjet
     */
    public String subjet()
    {
        return subjet;
    }
    
    public void print()
    {
        System.out.println("From " + from);
        System.out.println("To " + to);
        System.out.println("Message " + message);
        System.out.println("Subjet " + subjet);
    }
}
