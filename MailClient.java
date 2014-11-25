
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // atributos de la clase MailClient
    private MailServer server;
    private String user;

    /**
     * Constructor para los objetos de la clase MailClient
     */
    public MailClient(MailServer server, String user)
    {
        server = server;
        user = user;
    }

    /**
     *Metodo que devuelve el ultimo mail 
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Metodo que devuelve el ultimo mail y lo muestra por pantalla, si no hay mail
     * que mostrar, muestra un mensaje de "No hay mensajes"
     */
    public void printNextMailItem()
    { 
        MailItem mail = server.getNextMailItem(user);
        if(mail == null)
        {
            System.out.println("No hay mensajes");
        }
        else
        {
            mail.print();
        }
    }
    
    /**
     * Metodo que crea un objeto MailItem y lo envia al servidor basandose en los
     * dos parametros "To" y "Message"
     */
    public void sendMailItem(String To, String Message)
    {
        MailItem mail = new MailItem(user, To, Message);
        server.post(mail);
    }
}
