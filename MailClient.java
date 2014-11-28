
/**
 Representa un cliente de correo electronico
 */
public class MailClient
{
    //Representa el servidor asociado al cliente
    private MailServer server;
    //Representa la dirección de correo del usuario 
    private String user;
    //Representa el lugar donde se almacenara el ultimo mail recibido
    private MailItem email;

    /**
     * Constructor para los objetos de la clase MailClient
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
        
    }
    
    /**
     * Método que nos muestra por pantalla el numero de mails que tenemos
     */
    public void howManyMailItems()
    {
        int numberOfMail = server.howManyMailItems(user);
        System.out.println("Numero de mails en servidor" + numberOfMail);
        
    }
    
    /**
     * Método que que consigue que el sistema envie un mensaje automatico
     * indicando que estamos de vacaciones
     */
    public void getNextMailItemAndAutorespond()
    {
        email = server.getNextMailItem(user);
        
        if (email != null)
        {
            String newTo = email.getFrom();
            String newSubject = "RE: " + email.getSubjet();
            String newMessage = email.getMessage();
            String autoRespond = "No leeré tu mensaje, estoy de Vacaciones";
            sendMailItem (newTo, newSubject, newMessage + "\n" + autoRespond);
        }
        else 
        {
        
        }
    }
    
    /**
     *Método que obtiene del servidor el ultimo mail y lo devuelve 
     */
    public MailItem getNextMailItem()
    {
        email = server.getNextMailItem(user);
        return server.getNextMailItem(user);
    }
    
    /**
     * Metodo que devuelve el ultimo mail del servidor y lo muestra por pantalla, 
     * si no hay mail que mostrar, muestra un mensaje de "No hay mensajes"
     */
    public void printNextMailItem()
    { 
        email = server.getNextMailItem(user);
        if(email == null)
        {
            System.out.println("No hay mensajes");
        }
        else
        {
            email.print();
        }
    }
    
    /**
     * Método que muestra por pantalla los datos del ultimo mail recibido, tantas
     * veces como queramos
     */
    public void PrintLastMailItem()
    {
       if (email != null)
       {
        email.print();
       }
       else
       {
       System.out.println("No hay mensajes"); 
       }
       
       
       
    }
    
    /**
     * Metodo que crea un objeto MailItem y lo envia al servidor basandose en los
     * dos parametros "To" y "Message"
     */
    public void sendMailItem(String To, String Message, String subjet)
    {
        email = new MailItem(user, To, Message, subjet);
        server.post(email);
    }
}
