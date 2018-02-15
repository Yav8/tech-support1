import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> listaRespuestas;
    private HashMap<String, String> mapaDeRespuestas;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        aleatorio = new Random();
        listaRespuestas = new ArrayList<String>();
        
        listaRespuestas.add("What's your problem?");
        listaRespuestas.add("What? I can't believe it.");
        listaRespuestas.add("You have serious problems with this...");
        listaRespuestas.add("Let's do this.");
        listaRespuestas.add("Yeah, we did it!");
        
        mapaDeRespuestas = new HashMap<String, String>();
        
        mapaDeRespuestas.put("slow", "I guess, the performance of your computer is not working as expected.");
        mapaDeRespuestas.put("crash", "Oh my god! What have you done?!");
        mapaDeRespuestas.put("idea", "Then tell me, I am curious.");
        mapaDeRespuestas.put("worst", "There are worse computers for sure...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String texto)
    {
        String respuesta = "";
        respuesta = mapaDeRespuestas.get(texto);
        
        if(respuesta == null) {
            respuesta = listaRespuestas.get(aleatorio.nextInt(listaRespuestas.size()));
        }
        
        return respuesta;
    }
}
