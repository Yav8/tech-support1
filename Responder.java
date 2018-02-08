import java.util.Random;
import java.util.ArrayList;

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
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return listaRespuestas.get(aleatorio.nextInt(listaRespuestas.size()));
    }
}
