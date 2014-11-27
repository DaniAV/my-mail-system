
/**
 Representa un cliente de correo electronico
 */
public class MailClient
{
    //Representa el servidor asociado al cliente
    private MailServer server;
    //Representa la dirección de correo del usuario 
    private String user;

    /**
     * Constructor para los objetos de la clase MailClient
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }
    
    /**
     * Constructor que nos muestra por pantalla el numero de mails que tenemos
     */
    public int howManyMailItems()
    {
        return server.howManyMailItems(user);
    }
    
    /**
     * Metodo que que consigue que el sistema envie un mensaje automatico
     * indicando que estamos de vacaciones
     */
    public void getNextMailItemAndAutorespond()
    {
        MailItem email = server.getNextMailItem(user);
        String newFrom = email.getFrom();
        String newSubject = "RE: " + email.getSubjet();
        String newMessage = email.getMessage();
        String respuesta = "No leeré tu mensaje, estoy de Vacaciones";

        sendMailItem (newFrom, newSubject, newMessage + "\n" + respuesta);
    }
    
    /**
     *Metodo que obtiene del servidor el ultimo mail y lo devuelve 
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Metodo que devuelve el ultimo mail del servidor y lo muestra por pantalla, 
     * si no hay mail que mostrar, muestra un mensaje de "No hay mensajes"
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
    public void sendMailItem(String To, String Message, String subjet)
    {
        MailItem mail = new MailItem(user, To, Message, subjet);
        server.post(mail);
    }
}
