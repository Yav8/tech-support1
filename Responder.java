import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
    private HashMap<HashSet<String>, String> mapaDeRespuestas;
    private HashSet<String> conjuntoDePalabras1;
    private HashSet<String> conjuntoDePalabras2;
    private HashSet<String> conjuntoDePalabras3;
    private HashSet<String> conjuntoDePalabras4;
    private HashSet<String> conjuntoDePalabras5;
    private HashSet<String> conjuntoDePalabras6;

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
        
        conjuntoDePalabras1 = new HashSet<String>();
        conjuntoDePalabras1.add("slow");
        
        conjuntoDePalabras2 = new HashSet<String>();
        conjuntoDePalabras2.add("crash");
        
        conjuntoDePalabras3 = new HashSet<String>();
        conjuntoDePalabras3.add("idea");
        
        conjuntoDePalabras4 = new HashSet<String>();
        conjuntoDePalabras4.add("worst");
        
        conjuntoDePalabras5 = new HashSet<String>();
        conjuntoDePalabras5.add("slow");
        conjuntoDePalabras5.add("crash");
        
        conjuntoDePalabras6 = new HashSet<String>();
        conjuntoDePalabras6.add("slow");
        conjuntoDePalabras6.add("crash");
        conjuntoDePalabras6.add("worst");
        
        mapaDeRespuestas = new HashMap<HashSet<String>, String>();        
        mapaDeRespuestas.put(conjuntoDePalabras1, "I guess, the performance of your computer is not working as expected.");
        mapaDeRespuestas.put(conjuntoDePalabras2, "Oh my god! What have you done?!");
        mapaDeRespuestas.put(conjuntoDePalabras3, "Then tell me, I am curious.");
        mapaDeRespuestas.put(conjuntoDePalabras4, "There are worse computers for sure...");
        mapaDeRespuestas.put(conjuntoDePalabras5, "Wow, it looks like your computer is untouchable...");
        mapaDeRespuestas.put(conjuntoDePalabras6, "I'm sorry, but I think you should buy a new computer...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> texto)
    {
        String respuesta = mapaDeRespuestas.get(texto);
        
        if(respuesta == null) {
            if(listaRespuestas.size() != 0) {
                respuesta = listaRespuestas.remove(aleatorio.nextInt(listaRespuestas.size()));
            }
            else {
                respuesta = "I don't understand your question";
            }
        }
        
        return respuesta;
    }
}
